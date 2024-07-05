package za.co.mkhungo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

/**
 * @author Noxolo.Mkhungo
 */
@Configuration
public class ElasticsearchClientConfig extends ElasticsearchConfiguration {
    /**
     * @return
     */
    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder().connectedTo("localhost:9200").build();
    }
}
