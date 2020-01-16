package io.github.idilantha.pos.dao;

import io.github.idilantha.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemDAO extends JpaRepository<Item, String> {

    @Query(value = "SELECT IFNULL(SELECT code FROM Item ORDER BY code DESC LIMIT 1),0)AS code",nativeQuery = true)
    String getLastItemCode();
}
