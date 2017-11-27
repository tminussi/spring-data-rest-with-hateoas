package com.javaonthecloud.hateoas;

import com.javaonthecloud.hateoas.model.address.Address;
import com.javaonthecloud.hateoas.model.customer.Customer;
import com.javaonthecloud.hateoas.repository.customer.CustomerRepository;
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
            Customer thales = new Customer("Thales", "thales@matera.com", "99999-9999");
            Address thalesAddress = new Address("Rua 1", "1", "complemento", "11111-111");
            thales.setAddresses(Collections.singletonList(thalesAddress));

            Customer iuri = new Customer("Iuri", "iuri@matera.com", "99999-9999");
            Address iuriAddress = new Address("Rua 2", "2", "complemento2", "22222-222");
            iuri.setAddresses(Collections.singletonList(iuriAddress));

            Customer james = new Customer("James", "james@matera.com", "99999-9999");
            Address jamesAddress = new Address("Rua 3", "3", "complemento3", "33333-333");
            james.setAddresses(Collections.singletonList(jamesAddress));

            Customer fernando = new Customer("Fernando", "fernando@matera.com", "99999-9999");
            Address fernandoAddress = new Address("Rua 4", "4", "complemento4", "44444-444");
            fernando.setAddresses(Collections.singletonList(fernandoAddress));

            Customer thiago = new Customer("Thiago", "thiago@matera.com", "99999-9999");
            Address thiagoAddress = new Address("Rua 5", "5", "complemento5", "55555-555");
            thiago.setAddresses(Collections.singletonList(thiagoAddress));

            Customer guilherme = new Customer("Guilherme", "guilherme@matera.com", "99999-9999");
            Address guilhermeAddress = new Address("Rua 6", "6", "complemento6", "66666-666");
            guilherme.setAddresses(Collections.singletonList(guilhermeAddress));

            Customer estevao = new Customer("Estevao", "estevao@matera.com", "99999-9999");
            Address tatAddress = new Address("Rua 7", "7", "complemento7", "77777-777");
            estevao.setAddresses(Collections.singletonList(tatAddress));

            Customer geraldo = new Customer("Geraldo", "geraldo@matera.com", "99999-9999");
            Address geraldoAddress = new Address("Rua 8", "8", "complemento8", "88888-888");
            geraldo.setAddresses(Collections.singletonList(geraldoAddress));

            repository.save(thales);
            repository.save(iuri);
            repository.save(james);
            repository.save(fernando);
            repository.save(thiago);
            repository.save(guilherme);
            repository.save(estevao);
            repository.save(geraldo);
        };
    }
}