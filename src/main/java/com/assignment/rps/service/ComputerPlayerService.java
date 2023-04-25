package com.assignment.rps.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ComputerPlayerService {
    private static final Logger logger = LoggerFactory.getLogger(ComputerPlayerService.class);

    private static final String[] moves = {"Rock", "Paper", "Scissors"};

    public String generateRandomMove() {
        Random random = new Random();
        String move = moves[random.nextInt(moves.length)];
        logger.info("Computer chose " + move);
        return move;
    }
}


