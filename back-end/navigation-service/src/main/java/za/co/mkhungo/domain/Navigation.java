package za.co.mkhungo.domain;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table
public class Navigation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

}
