package com.javaonthecloud.hateoas;

import com.javaonthecloud.hateoas.model.customer.Customer;
import com.javaonthecloud.hateoas.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HateoasApplication  {

	public static void main(String[] args) {
		SpringApplication.run(HateoasApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(CustomerRepository repository) {
        return (event) -> {
            repository.save(new Customer("Thales", "thales@matera.com"));
            repository.save(new Customer("Iuri", "iuri@matera.com"));
            repository.save(new Customer("James", "james@matera.com"));
            repository.save(new Customer("Fernando", "fernando@matera.com"));
            repository.save(new Customer("Thiago", "thiago@matera.com"));
            repository.save(new Customer("Guilherme", "guilherme@matera.com"));
            repository.save(new Customer("Tat", "tat@matera.com"));
            repository.save(new Customer("Geraldo", "geraldo@matera.com"));
        };
    }

}
