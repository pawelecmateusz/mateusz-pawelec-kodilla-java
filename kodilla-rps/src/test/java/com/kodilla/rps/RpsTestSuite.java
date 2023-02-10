package com.kodilla.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.rps.PlayerInteraction.playTheGame;
import static com.kodilla.rps.WinLoseScenarios.showPlayerWinScenario;

public class RpsTestSuite {
    @Test
    void testPlayer() {
        //given
        Player player = new Player("");
        //when
        player.setName("Jack");
        //then
        Assertions.assertEquals("Jack", player.getName());
    }
    @Test
    void testWin() throws InterruptedException {
        //given
        PlayerInteraction playerInteraction = new PlayerInteraction();

        //when
        String numberOfWins = "3";
        int parseWins = Integer.parseInt(numberOfWins);
        int playerPoints = 3;
        int jackPoints = 2;

        //then
        Assertions.assertEquals(parseWins, playerPoints);
        Assertions.assertNotEquals(parseWins, jackPoints);

    }
}
