package za.co.mkhungo.domain;

import jakarta.persistence.*;
import za.co.mkhungo.domain.enums.Rating;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table
public class ProductRating {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @Enumerated(EnumType.ORDINAL)
  private Rating rating;
  @Column(name = "product_id",nullable = false)
  private Long productId;
  @Column(name = "customer_id",nullable = false,unique = true)
  private Long customerId;
}
