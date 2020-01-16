package io.github.idilantha.pos.dao;


import io.github.idilantha.pos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDAO extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT IFNULL((SELECT id FROM `Order` ORDER BY id DESC LIMIT 1),0)AS id",nativeQuery = true)
    int getLastOrderId();

    @Query(value = "SELECT CASE WHEN EXISTS (SELECT * FROM `Order` WHERE customerId=?1)THEN 'true' ELSE 'false' END",nativeQuery = true)
    boolean existsByCustomerId(String customerId);

}
