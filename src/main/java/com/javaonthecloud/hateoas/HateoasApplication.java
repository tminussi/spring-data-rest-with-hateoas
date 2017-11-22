package com.javaonthecloud.hateoas;

import com.javaonthecloud.hateoas.model.address.Address;
import com.javaonthecloud.hateoas.model.customer.Customer;
import com.javaonthecloud.hateoas.model.customer.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class HateoasApplication {

    public static void main(String[] args) {
        SpringApplication.run(HateoasApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(CustomerRepository repository) {
        return (event) -> {
            Customer thales = new Customer("Thales", "thales@matera.com");
            Address thalesAddress = new Address("Rua 1", "1", "complemento", "11111-111");
            thales.setAddresses(Collections.singletonList(thalesAddress));
            thalesAddress.setCustomer(thales);

            Customer iuri = new Customer("Iuri", "iuri@matera.com");
            Address iuriAddress = new Address("Rua 2", "2", "complemento2", "22222-222");
            iuri.setAddresses(Collections.singletonList(iuriAddress));
            iuriAddress.setCustomer(iuri);

            Customer james = new Customer("James", "james@matera.com");
            Address jamesAddress = new Address("Rua 3", "3", "complemento3", "33333-333");
            james.setAddresses(Collections.singletonList(jamesAddress));
            jamesAddress.setCustomer(james);

            Customer fernando = new Customer("Fernando", "fernando@matera.com");
            Address fernandoAddress = new Address("Rua 4", "4", "complemento4", "44444-444");
            fernando.setAddresses(Collections.singletonList(fernandoAddress));
            fernandoAddress.setCustomer(fernando);

            Customer thiago = new Customer("Thiago", "thiago@matera.com");
            Address thiagoAddress = new Address("Rua 5", "5", "complemento5", "55555-555");
            thiago.setAddresses(Collections.singletonList(thiagoAddress));
            thiagoAddress.setCustomer(thiago);

            Customer guilherme = new Customer("Guilherme", "guilherme@matera.com");
            Address guilhermeAddress = new Address("Rua 6", "6", "complemento6", "66666-666");
            guilherme.setAddresses(Collections.singletonList(guilhermeAddress));
            guilhermeAddress.setCustomer(guilherme);

            Customer tat = new Customer("Tat", "tat@matera.com");
            Address tatAddress = new Address("Rua 7", "7", "complemento7", "77777-777");
            tat.setAddresses(Collections.singletonList(tatAddress));
            tatAddress.setCustomer(tat);

            Customer geraldo = new Customer("Geraldo", "geraldo@matera.com");
            Address geraldoAddress = new Address("Rua 8", "8", "complemento8", "88888-888");
            geraldo.setAddresses(Collections.singletonList(geraldoAddress));
            geraldoAddress.setCustomer(geraldo);

            repository.save(thales);
            repository.save(iuri);
            repository.save(james);
            repository.save(fernando);
            repository.save(thiago);
            repository.save(guilherme);
            repository.save(tat);
            repository.save(geraldo);
        };
    }
}