package com.assignment.rps.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service

public class GameService {
    private static final Logger logger = LoggerFactory.getLogger(GameService.class);

    public String determineWinner(String playerMove, String computerMove) {
        String result;
        if (playerMove.equals(computerMove)) {
            result = "It is a tie";
        } else if (playerMove.equals("Rock") && computerMove.equals("Scissors") ||
                playerMove.equals("Scissors") && computerMove.equals("Paper") ||
                playerMove.equals("Paper") && computerMove.equals("Rock")) {
            result = "Player wins";
        } else {
            result = "Computer wins";
        }
        String message = String.format("Game result: %s (player move: %s, computer move: %s)", result, playerMove, computerMove);
        logger.info(message);
        return result;
    }
}


