package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.MainMenu.*;
import static com.kodilla.rps.PlayerInteraction.*;
import static com.kodilla.rps.RpsRunner.*;
import static com.kodilla.rps.EndgameScenarios.*;
import static java.lang.Thread.sleep;

public class OptionsBar {

    // Display options bar.
    public static void showOptions() throws InterruptedException {
        optionsLoop:
        while (true) {
            System.out.println(fcRED + "(c - continue, n - new game, m - menu, x - quit, r - rules)" + cRESET);
            controlKey = scanner.next();
            System.out.println(" ");
            keyLoop:
            switch (controlKey) {

                // Game continues.
                case "c":
                    playerPoints.setValue(0);
                    jackPoints.setValue(0);
                    getNumberOfWins(wins);
                    break optionsLoop;

                // Start a new game.
                case "n":
                    System.out.print(fcRED + "Are you sure you want to end the current game? (y/n) \n" + cRESET);
                    while (true) {
                        controlKey = scanner.next();
                        System.out.println(" ");
                        switch (controlKey) {

                            // End the current game and reset values.
                            case "y":
                                if (!player2.getName().isEmpty()) {
                                    System.out.print(fcYELLOW + "Type Player 1's name to start: " + cRESET);
                                    while (true) {
                                        player1.setName(scanner.next());
                                        System.out.println(" ");
                                        if (player1.getName().equals(player2.getName())) {
                                            System.out.println(fcRED + "Please enter a different name.");
                                        } else {
                                            p1 = fcBrightGREEN + player1.getName() + cRESET;
                                            player2.setName("");
                                            resetValues(playerPoints, jackPoints, playerPrize, jackPrize);
                                            break optionsLoop;
                                        }
                                    }
                                } else {
                                    resetValues(playerPoints, jackPoints, playerPrize, jackPrize);
                                    getNumberOfWins(wins);
                                    break optionsLoop;
                                }

                                // Go back to options bar.
                            case "n":
                                break keyLoop;

                            // Wrong input.
                            default:
                                System.out.println(fcRED + controlKey + " is incorrect! Try again." + cRESET);
                        }
                    }

                // Go back to menu.
                case "m":
                    System.out.print(fcRED + "Are you sure you want to end the current game? (y/n) \n" + cRESET);
                    while (true) {
                        controlKey = scanner.next();
                        System.out.println(" ");
                        switch (controlKey) {

                            // Confirm going to main menu and reset values.
                            case "y":
                                player1.setName("");
                                p1 = fcBrightGREEN + player1.getName() + cRESET;
                                player2.setName("");
                                p2 = fcBrightYELLOW + player1.getName() + cRESET;
                                resetValues(playerPoints, jackPoints, playerPrize, jackPrize);
                                main(null);
                                break optionsLoop;

                            // Go back to options bar.
                            case "n":
                                break keyLoop;

                            // Wrong input.
                            default:
                                System.out.println(fcRED + controlKey + " is incorrect! Try again." + cRESET);
                        }
                    }

                // Quit the game.
                case "x":
                    System.out.print(fcRED + "Are you sure you want to quit? (y/n) \n" + cRESET);
                    while (true) {
                        controlKey = scanner.next();
                        System.out.println(" ");
                        switch (controlKey) {

                            // Quit.
                            case "y":
                                System.out.println(fcPURPLE + "Thanks for playing!" + cRESET);
                                sleep(2000);
                                System.exit(0);

                                // Go back to options bar.
                            case "n":
                                break keyLoop;

                            // Wrong input.
                            default:
                                System.out.println(fcRED + controlKey + " is incorrect! Try again." + cRESET);
                        }
                    }

                // Display rules etc. Go back to options bar.
                case "r":
                    showRules();
                    showControls();
                    if (player2.getName().isEmpty()) {
                        showGameInfo();
                    }
                    break keyLoop;

                // Wrong input.
                default:
                    System.out.println(fcRED + controlKey + " is incorrect! Try again." + cRESET);
                    System.out.println(" ");
            }
        }
    }

    // Reset values.
    public static void resetValues(Value playerPoints, Value jackPoints, Prize playerPrize, Prize jackPrize) {
        playerPoints.setValue(0);
        jackPoints.setValue(0);
        playerPrize.setPrize(10);
        jackPrize.setPrize(10);
    }
}