package com.javaonthecloud.hateoas;

import com.javaonthecloud.hateoas.model.customer.Customer;
import com.javaonthecloud.hateoas.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HateoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(HateoasApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CustomerRepository repository) {
        return (evt) -> {
            repository.save(new Customer("Adam", "wacky@boot.com"));
            repository.save(new Customer("John", "john@boot.com"));
            repository.save(new Customer("Smith", "smith@boot.com"));
            repository.save(new Customer("Edgar", "edgar@boot.com"));
            repository.save(new Customer("Martin", "martin@boot.com"));
            repository.save(new Customer("Tom", "tom@boot.com"));
            repository.save(new Customer("Sean", "sean@boot.com"));
        };
    }
}
