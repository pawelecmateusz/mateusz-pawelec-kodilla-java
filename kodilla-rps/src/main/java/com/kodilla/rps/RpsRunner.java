package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.MainMenu.*;
import static com.kodilla.rps.MoveToSign.*;
import static com.kodilla.rps.OptionsBar.*;
import static com.kodilla.rps.PlayerInteraction.*;
import static com.kodilla.rps.PointsCalculator.*;
import static com.kodilla.rps.EndgameScenarios.*;
import static java.lang.Thread.sleep;

public class RpsRunner {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static Player player1 = new Player("");
    static String p1;
    static Player player2 = new Player("");
    static String p2;
    static Value playerMove = new Value(0);
    static Value playerPoints = new Value(0);
    static Player jumpingJack = new Player(fcBrightCYAN + "Jack" + cRESET);
    static String jack = jumpingJack.getName();
    static Value jackMove = new Value(0);
    static Value jackPoints = new Value(0);
    static Value wins = new Value(0);
    static String controlKey;

    public static void main(String[] args) throws InterruptedException {

        // Display main menu.
        showMenu();

        // Player have to choose the number of wins.
        getNumberOfWins(wins);

        boolean end = false;
        //int jackMove = 0;

        // Game loop.
        while (!end) {

            if ((playerPoints.getValue() >= 1 && playerPoints.getValue() < wins.getValue()) || (jackPoints.getValue() >= 1 && jackPoints.getValue() < wins.getValue())) {
                System.out.println(fcYELLOW + "~ NEXT ROUND ~" + cRESET);
            }

            // Player's and Jack's moves choice.
            getMove(playerMove, jackMove);

            // Info about the moves.
            System.out.println("\n" + p1 + fcRED + " played " + getMoveSign(playerMove) + cRESET);
            System.out.println(jack + fcRED + " played " + getMoveSign(jackMove) + cRESET);

            // Calculate moves into points.
            calculatePoints(playerMove, jackMove, playerPoints, jackPoints);

            // See if the player wants to play again or if the game is finished.
            if ((isGameFinished(wins, playerPoints, jackPoints))) {
                if (wins.getValue() == playerPoints.getValue() || wins.getValue() == jackPoints.getValue()) {
                    sleep(1000);
                    System.out.println(fcPURPLE + "\nThanks for playing!" + cRESET);
                    sleep(1000);
                    end = true;
                }
            } else if (wins.getValue() == playerPoints.getValue() || wins.getValue() == jackPoints.getValue()) {
                showOptions();
            }
        }
    }
}