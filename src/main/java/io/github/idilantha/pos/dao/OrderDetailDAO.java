package io.github.idilantha.pos.dao;


import io.github.idilantha.pos.entity.OrderDetail;
import io.github.idilantha.pos.entity.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, OrderDetailPK> {

    @Query(value = "SELECT CASE WHEN EXISTS (SELECT * FROM OrderDetail WHERE itemCode=?1)THEN 'true' ELSE 'false' END ",nativeQuery = true)
    Boolean existsByItemCode(String itemCode);

}
