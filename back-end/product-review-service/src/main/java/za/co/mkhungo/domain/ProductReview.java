package za.co.mkhungo.domain;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table
public class ProductReview {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  private String review;
  @Column(name = "product_id",nullable = false)
  private Long productId;
  @Column(name = "customer_id",nullable = false,unique = true)
  private Long customerId;
}
