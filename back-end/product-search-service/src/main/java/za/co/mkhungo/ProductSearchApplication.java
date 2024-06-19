package za.co.mkhungo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PostMapping;
import za.co.mkhungo.proxy.ProductProxy;
import za.co.mkhungo.repository.ProductIndexRepository;

import java.util.Optional;

@EnableFeignClients
@SpringBootApplication
public class ProductSearchApplication {
	ProductIndexRepository productIndexRepository;
	ProductProxy productProxy;
	@Autowired
	public ProductSearchApplication(ProductIndexRepository productIndexRepository,ProductProxy productProxy){
		this.productIndexRepository=productIndexRepository;
		this.productProxy=productProxy;
	}
	public static void main(String[] args) {
		SpringApplication.run(ProductSearchApplication.class, args);
	}
	@PostConstruct
	 void initializationIndex(){
		productIndexRepository.saveAll(productProxy.retrieveProducts());
	}

}
