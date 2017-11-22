package com.javaonthecloud.hateoas.model.address.projection;

import com.javaonthecloud.hateoas.model.address.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "street", types = Address.class)
public interface StreetOnlyProjection {

    String getStreet();
}
