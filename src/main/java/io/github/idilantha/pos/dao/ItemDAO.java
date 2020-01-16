package io.github.idilantha.pos.dao;

import io.github.idilantha.pos.entity.Item;

public interface ItemDAO extends CrudDAO<Item, String> {

    String getLastItemCode() throws Exception;
}
