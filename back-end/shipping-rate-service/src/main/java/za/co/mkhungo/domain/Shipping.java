package za.co.mkhungo.domain;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table
public class Shipping {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "shipping_id", nullable = false)
  private Long shippingId;
  //Entity / Model design pending...
}
