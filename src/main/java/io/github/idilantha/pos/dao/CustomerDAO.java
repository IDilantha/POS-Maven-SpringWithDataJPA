package io.github.idilantha.pos.dao;

import io.github.idilantha.pos.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer, String> {

    String getLastCustomerId() throws Exception;

}
