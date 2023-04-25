package com.assignment.rps.serviceTest;

import com.assignment.rps.service.GameService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameServiceTest {
    @Test
    void testDetermineWinner(){
        GameService gameService = new GameService();

        //Test case 1: moves of player and computer are same
        String result1 =gameService.determineWinner("Rock","Rock");
        Assertions.assertEquals("It is a tie", result1);

        String result2 = gameService.determineWinner("Scissors","Scissors");
        Assertions.assertEquals("It is a tie", result2);

        String result3 = gameService.determineWinner("Paper","Paper");
        Assertions.assertEquals("It is a tie", result3);

        //Test case 2: Player wins
        String result4 = gameService.determineWinner("Rock", "Scissors");
        Assertions.assertEquals("Player wins", result4);

        String result5 = gameService.determineWinner("Scissors", "Paper");
        Assertions.assertEquals("Player wins", result5);

        String result6 = gameService.determineWinner("Paper", "Rock");
        Assertions.assertEquals("Player wins", result6);

        //Test case 3: Computer wins

        String result7 = gameService.determineWinner("Rock", "Paper");
        Assertions.assertEquals("Computer wins", result7);

        String result8 = gameService.determineWinner("Paper", "Scissors");
        Assertions.assertEquals("Computer wins", result8);

        String result9 = gameService.determineWinner("Scissors", "Rock");
        Assertions.assertEquals("Computer wins", result9);

    }
}
