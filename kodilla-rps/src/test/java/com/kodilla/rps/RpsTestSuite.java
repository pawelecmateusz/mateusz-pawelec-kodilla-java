package com.kodilla.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.EndgameScenarios.isGameFinished;
import static com.kodilla.rps.MoveToSign.getMoveSign;
import static com.kodilla.rps.PointsCalculator.calculatePoints;
import static com.kodilla.rps.RpsRunner.*;


public class RpsTestSuite {
    @DisplayName("Test if move number gives(or not) the desired sign")
    @Test
    void testPlayerMove() {
        //given
        String rock = fcBrightPURPLE + "Rock" + cRESET;
        String paper = fcBrightPURPLE + "Paper" + cRESET;
        //when
        Value move = new Value(1);
        //then
        Assertions.assertEquals(getMoveSign(move), rock);
        Assertions.assertNotEquals(getMoveSign(move), paper);
    }

    @DisplayName("Test player win")
    @Test
    void testPlayerWin() throws InterruptedException {
        //given

        //when
        player1.setName("M");
        player2.setName("M");
        p1 = player1.getName();
        Value wins = new Value(5);
        Value playerPoints = new Value(5);
        Value jackPoints = new Value(2);

        //then
        Assertions.assertTrue(isGameFinished(wins, playerPoints, jackPoints));
    }
    @DisplayName("Test CPU win")
    @Test
    void testCpuWin() throws InterruptedException {
        //given

        //when
        player1.setName("M");
        player2.setName("M");
        p1 = player1.getName();
        Value wins = new Value(5);
        Value playerPoints = new Value(2);
        Value jackPoints = new Value(5);

        //then
        Assertions.assertTrue(isGameFinished(wins, playerPoints, jackPoints));
    }
}
