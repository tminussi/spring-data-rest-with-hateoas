package com.javaonthecloud.hateoas.model.customer.projection;

import com.javaonthecloud.hateoas.model.address.Address;
import com.javaonthecloud.hateoas.model.customer.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;

@Projection(name = "no_phone", types = Customer.class)
public interface NoPhoneProjection {

    String getName();

    String getEmail();

    Collection<Address> getAddresses();
}
