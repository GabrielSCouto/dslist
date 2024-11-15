package com.gabrielscouto.dslist.repositories;

import com.gabrielscouto.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
