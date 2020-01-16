package io.github.idilantha.pos.dao;

import io.github.idilantha.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemDAO extends JpaRepository<Item, String> {

    @Query(value = "SELECT code FROM Item ORDER BY code",nativeQuery = true)
    String getLastItemCode();
}
