package za.co.mkhungo.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.hateoas.RepresentationModel;
import za.co.mkhungo.dto.StoreLocatorDTO;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@Getter
@Setter
public class StoreLocatorResponse extends RepresentationModel<StoreLocatorResponse> {
    private StoreLocatorDTO productDto;
    public StoreLocatorResponse(StoreLocatorDTO productDto){
        this.productDto=productDto;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getClass()).toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StoreLocatorResponse other)) return false;
        return new EqualsBuilder().append(this.getClass(), other.getClass()).isEquals();
    }
}
