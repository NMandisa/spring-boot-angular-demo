package za.co.mkhungo.dto;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.hateoas.EntityModel;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
public class StoreLocatorDTO extends EntityModel<StoreLocatorDTO> {

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getClass()).toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StoreLocatorDTO other)) return false;
        return new EqualsBuilder().append(this.getClass(), other.getClass()).isEquals();
    }
}
