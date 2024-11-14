package com.gabrielscouto.dslist.services;

import com.gabrielscouto.dslist.dto.GameMinDTO;
import com.gabrielscouto.dslist.entities.Game;
import com.gabrielscouto.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}