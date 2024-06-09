package za.co.mkhungo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id", nullable = false)
    private Long orderDetailId;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    @JoinTable(name = "order_has_order_detail",joinColumns = @JoinColumn(name = "order_detail_id", referencedColumnName = "order_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "order_id",foreignKey=@ForeignKey(name = "order_detail_order_fk",foreignKeyDefinition = "")))
    private Order order;

    @OneToMany(mappedBy = "orderDetails")
    private Collection<OrderItem> orderItems;
}
