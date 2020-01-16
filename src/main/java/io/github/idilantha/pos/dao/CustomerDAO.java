package io.github.idilantha.pos.dao;

import io.github.idilantha.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer, String> {

    String getLastCustomerId() throws Exception;

}
