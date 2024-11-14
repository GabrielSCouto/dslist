package com.gabrielscouto.dslist.repositories;

import com.gabrielscouto.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
