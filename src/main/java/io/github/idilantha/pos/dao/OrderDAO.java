package io.github.idilantha.pos.dao;


import io.github.idilantha.pos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDAO extends JpaRepository<Order, Integer> {


    int getLastOrderId();

    boolean existsByCustomerId(String customerId) throws Exception;

}
