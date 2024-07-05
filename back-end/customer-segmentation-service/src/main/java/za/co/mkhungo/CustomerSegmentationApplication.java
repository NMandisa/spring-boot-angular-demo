package za.co.mkhungo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import za.co.mkhungo.repository.CustomerSegmentIndexRepository;
import za.co.mkhungo.repository.CustomerSegmentationRepository;


@EnableFeignClients
@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "za.co.mkhungo.domain.search")
@EnableMongoRepositories(basePackages = "za.co.mkhungo.domain")
public class CustomerSegmentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSegmentationApplication.class, args);
	}

}
