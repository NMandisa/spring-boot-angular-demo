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
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id", nullable = false)
  private Long orderId;
  @OneToOne(mappedBy = "order")
  private OrderDetails orderDetails;
}
