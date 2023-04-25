package com.assignment.rps.serviceTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.assignment.rps.service.ComputerPlayerService;

@RunWith(MockitoJUnitRunner.class)
public class ComputerPlayerServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(ComputerPlayerServiceTest.class);

    @InjectMocks
    private ComputerPlayerService computerPlayerService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGenerateRandomMove() {
        String move = computerPlayerService.generateRandomMove();
        logger.info("Random move: " + move);
        assertNotNull(move);
        assertTrue(move.equals("Rock") || move.equals("Paper") || move.equals("Scissors"));
    }
}



