package io.github.idilantha.pos.dao;

import io.github.idilantha.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerDAO extends JpaRepository<Customer, String> {

    @Query(value = "SELECT customerId FROM Customer ORDER BY customerId",nativeQuery = true)
    String getLastCustomerId();


}
