package com.assignment.rps.controller;

//import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.rps.service.ComputerPlayerService;
import com.assignment.rps.service.GameService;

@RestController



public class GameController {
    private static final Logger logger = LoggerFactory.getLogger(GameController.class);

    @Autowired
    private final GameService gameService;
    @Autowired
    private final ComputerPlayerService computerPlayerService;

    public GameController(GameService gameService, ComputerPlayerService computerPlayerService) {
        this.gameService = gameService;
        this.computerPlayerService = computerPlayerService;
    }

    @GetMapping("/play")

    public String playGame(@RequestParam String playerMove) {
        String computerMove = computerPlayerService.generateRandomMove();
        String result = gameService.determineWinner(playerMove, computerMove);
        String message = String.format("Player chose %s, computer chose %s. %s", playerMove, computerMove, result);
        logger.info(message);
        return message;
    }
}


