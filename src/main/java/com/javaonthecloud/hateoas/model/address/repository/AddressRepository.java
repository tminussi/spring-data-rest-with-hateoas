package com.javaonthecloud.hateoas.model.address.repository;

import com.javaonthecloud.hateoas.model.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address, Long> {
}
