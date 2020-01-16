package io.github.idilantha.pos.dao;


import io.github.idilantha.pos.entity.CustomEntity;

import java.util.List;

public interface QueryDAO {



    /**
     *
     * @param query customerId, customerName, orderId, orderDate
     * @return
     * @throws Exception
     */
    List<CustomEntity> getOrdersInfo() throws Exception;

}
