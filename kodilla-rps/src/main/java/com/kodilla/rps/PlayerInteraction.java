package com.kodilla.rps;

import java.util.InputMismatchException;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.RpsRunner.*;

public class PlayerInteraction {

    // Set up the amount of wins.
    public static void getNumberOfWins(Value wins) {
        System.out.println(jack + fcCYAN + ": To how many wins would you like to play? (1-5)" + cRESET);
        winsLoop:
        while (true) {
            if (player1.getName().equals(player2.getName())) {
                System.out.print(p1 + fcYELLOW + ": " + cRESET);
            } else {
                System.out.print(p1 + fcGREEN + ": " + cRESET);
            }
            try {
                wins.setValue(scanner.nextInt());
                System.out.println(" ");
                switch (wins.getValue()) {
                    case 1, 2, 3, 4, 5:
                        break winsLoop;
                    default:
                        System.out.println(fcRED + "Enter a number (1-5)" + cRESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(fcRED + "Enter a number (1-5)" + cRESET);
                scanner.next();
            }
        }
    }

    // Player's and CPU's move choice (random for CPU).
    public static void getMove(Value playerMove, Value jackMove) {
        System.out.print(jack + fcCYAN + ": Your move (1-5) \n" + cRESET);
        moveLoop:
        while (true) {
            try {
                playerMove.setValue(scanner.nextInt());
                switch (playerMove.getValue()) {
                    case 1, 2, 3, 4, 5:
                        break moveLoop;
                    default:
                        System.out.println(fcRED + "Enter a number (1-5)" + cRESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(fcRED + "Enter a number (1-5)" + cRESET);
                scanner.next();
            } finally {
                jackMove.setValue(random.nextInt(5) + 1);
                while (jackMove.getValue() == playerMove.getValue()) {
                    jackMove.setValue(random.nextInt(5) + 1);
                }
            }
        }
    }
}