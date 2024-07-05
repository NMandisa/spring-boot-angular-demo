package za.co.mkhungo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import za.co.mkhungo.repository.StoreLocatorIndexRepository;

//@EnableElasticsearchRepositories(basePackages = "za.co.mkhungo.domain.search")
@SpringBootApplication
public class StoreLocatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreLocatorApplication.class, args);
	}

}
