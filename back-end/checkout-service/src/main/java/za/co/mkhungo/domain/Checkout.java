package za.co.mkhungo.domain;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table
public class Checkout {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

}
