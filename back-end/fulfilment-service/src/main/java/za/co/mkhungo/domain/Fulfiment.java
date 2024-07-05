package za.co.mkhungo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.hateoas.EntityModel;
import za.co.mkhungo.response.FulfilmentResponse;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table
public class Fulfiment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.getClass()).toHashCode();
  }
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Fulfiment other)) return false;
    return new EqualsBuilder().append(this.getClass(), other.getClass()).isEquals();
  }
}
