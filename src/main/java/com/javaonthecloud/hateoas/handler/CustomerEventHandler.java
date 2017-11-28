package com.javaonthecloud.hateoas.handler;


import com.javaonthecloud.hateoas.exception.InvalidInputException;
import com.javaonthecloud.hateoas.model.customer.Customer;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.util.StringUtils;

import java.util.concurrent.ArrayBlockingQueue;

@RepositoryEventHandler(Customer.class)
public class CustomerEventHandler {

    @HandleBeforeSave
    @HandleBeforeCreate
    public void handleBeforeSave(Customer customer) {
        if (StringUtils.isEmpty(customer.getName())) {
            throw new InvalidInputException("Name is required");
        }
        else if (StringUtils.isEmpty(customer.getEmail())) {
            throw new InvalidInputException("Email is required");
        }
    }
}
