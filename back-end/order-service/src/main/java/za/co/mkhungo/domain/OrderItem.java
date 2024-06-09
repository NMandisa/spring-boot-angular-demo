package za.co.mkhungo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id", nullable = false)
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_detail_id", referencedColumnName = "order_detail_id")
    @JoinTable(name = "order_details_has_order_items",joinColumns = @JoinColumn(name = "order_item_id", referencedColumnName = "order_item_id"),
            inverseJoinColumns = @JoinColumn(name = "order_detail_id", referencedColumnName = "order_detail_id",foreignKey=@ForeignKey(name = "order_item_order_detail_fk")))
    private OrderDetails orderDetails;
}
