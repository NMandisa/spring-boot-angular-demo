package za.co.mkhungo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table
public class OrderFulfilment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_fulfilment_id", nullable = false)
  private Long orderFulfilmentId;
}
