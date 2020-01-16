package io.github.idilantha.pos.dao;

import io.github.idilantha.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDAO extends JpaRepository<Item, String> {

    String getLastItemCode() throws Exception;
}
