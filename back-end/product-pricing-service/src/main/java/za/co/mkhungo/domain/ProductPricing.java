package za.co.mkhungo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.EntityModel;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table
public class ProductPricing extends EntityModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  private String name;
  private Long price;
}
