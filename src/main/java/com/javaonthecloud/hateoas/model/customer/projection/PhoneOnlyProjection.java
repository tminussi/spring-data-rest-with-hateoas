package com.javaonthecloud.hateoas.model.customer.projection;

import com.javaonthecloud.hateoas.model.customer.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "phone", types = Customer.class)
public interface PhoneOnlyProjection {

    String getPhone();
}
