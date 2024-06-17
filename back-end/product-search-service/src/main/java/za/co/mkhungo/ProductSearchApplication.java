package za.co.mkhungo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProductSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSearchApplication.class, args);
	}

}
