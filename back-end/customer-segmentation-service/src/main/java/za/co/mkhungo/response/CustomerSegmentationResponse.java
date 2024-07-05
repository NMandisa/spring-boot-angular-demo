package za.co.mkhungo.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.hateoas.RepresentationModel;
import za.co.mkhungo.dto.CustomerSegmentationDTO;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@Getter
@Setter
public class CustomerSegmentationResponse extends RepresentationModel<CustomerSegmentationResponse> {
    private CustomerSegmentationDTO productDto;
    public CustomerSegmentationResponse(CustomerSegmentationDTO productDto){
        this.productDto=productDto;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getClass()).toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CustomerSegmentationResponse other)) return false;
        return new EqualsBuilder().append(this.getClass(), other.getClass()).isEquals();
    }
}
