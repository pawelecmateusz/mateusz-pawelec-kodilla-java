package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.RpsRunner.*;
import static java.lang.Thread.sleep;

public class EndgameScenarios {
    static Prize playerPrize = new Prize(10);
    static Prize jackPrize = new Prize(10);

    // Prize calculations.
    public static void multiplyPrize (Value wins, Prize prize){
        switch (wins.getValue()) {
            case 1 -> prize.setPrize(prize.getPrize() + 10);
            case 2, 3, 4, 5 -> prize.setPrize(prize.getPrize() * wins.getValue());
        }
    }
    public static void dividePrize (Value wins, Prize prize) {
        switch (wins.getValue()) {
            case 1 -> prize.setPrize(prize.getPrize() - 10);
            case 2, 3, 4, 5 -> prize.setPrize(prize.getPrize() / 2);
        }
    }

    // See what's the result of the game.
    public static boolean isGameFinished(Value wins, Value playerPoints, Value jackPoints) throws InterruptedException {

        // When player wins.
        if (wins.getValue() == playerPoints.getValue()) {
            System.out.println(p1 + fcPURPLE + " wins!");
            System.out.println(" ");

            // Free Mode.
            if (player2.getName().isEmpty()) {
                multiplyPrize(wins, playerPrize);
                if (jackPrize.getPrize() >= 20 && playerPrize.getPrize() >= 20) {
                    dividePrize(wins, jackPrize);
                }
                if (playerPrize.getPrize() >= 1000) {
                    System.out.println(p1 + fcYELLOW + " has won the game with " + fcPURPLE + playerPrize.getPrize() + fcYELLOW + "$" + cRESET);
                    System.out.println(jack + fcYELLOW + " has " + fcPURPLE + jackPrize.getPrize() + fcYELLOW + "$" + cRESET);
                    return true;
                }
                System.out.println(p1 + fcRED + " has " + fcPURPLE + playerPrize.getPrize() + "$\n" +
                                   jack + fcRED + " has " + fcPURPLE + jackPrize.getPrize() + "$\n");
                System.out.println(jack + fcCYAN + ": Congrats! Let's play!\n" + cRESET);
                return false;

            // Story Mode - player1 won but not really, player2's turn
            } else if (!(player1.getName().equals(player2.getName()))) {
                System.out.println(p1 + fcGREEN + ": HAHAHA!!! Yes!" + fcRED + " *punches the device*" + cRESET);
                sleep(2000);
                System.out.println(fcRED + "*poof!*" + cRESET);
                sleep(2000);
                System.out.println(p2 + fcYELLOW + ": Woah!! What happened?! Where is " + p1 + fcYELLOW + "?" + cRESET);
                sleep(2000);
                System.out.println(jack + fcCYAN + ": GONE..." + cRESET);
                sleep(2000);
                System.out.println(p2 + fcYELLOW + ": Gone?! where?" + cRESET);
                sleep(2000);
                System.out.println(jack + fcCYAN + ": That's a long story... do you want to try your luck too?" + cRESET);
                sleep(2000);
                System.out.println(p2 + fcYELLOW + ": After THAT?! I don't know... " + cRESET);
                sleep(2000);
                System.out.println(jack + fcCYAN + ": You'll be fine." + cRESET);
                sleep(2000);
                System.out.println(p2 + fcYELLOW + ": Well, let me think...\n" + cRESET);
                sleep(2000);
                player1.setName(player2.getName());
                p1 = fcBrightYELLOW + player1.getName() + cRESET;
                return false;

            // Story Mode - player2 kind of won but naah and the game is finished.
            } else {
                System.out.println(p1 + fcYELLOW + ": HAHA!!! I win!" + fcRED + " *accidentally presses something on the device*" + cRESET);
                sleep(2000);
                System.out.println(fcRED + "*poof!*" + cRESET);
                sleep(2000);
                System.out.println(jack + fcCYAN + ": You can't really win with a time-traveller..." + cRESET);
                sleep(2000);
                System.out.println(fcRED + "\nGAME OVER" + cRESET);
                return true;
            }

        // When Jack wins.
        } else if (wins.getValue() == jackPoints.getValue()) {
            System.out.println(jack + fcPURPLE + " wins!");
            System.out.println(" ");

            // Free Mode.
            if (player2.getName().isEmpty()) {
                multiplyPrize(wins, jackPrize);
                if (playerPrize.getPrize() >= 20 && jackPrize.getPrize() >= 20) {
                    dividePrize(wins, playerPrize);
                }
                if (jackPrize.getPrize() >= 1000) {
                    System.out.println(jack + fcYELLOW + " won the game with " + fcPURPLE + jackPrize.getPrize() + fcYELLOW + "$");
                    System.out.println(p1 + fcYELLOW + " has " + fcPURPLE + playerPrize.getPrize() + fcYELLOW + "$" + cRESET);
                    return true;
                }
                System.out.println(p1 + fcRED + " has " + fcPURPLE + playerPrize.getPrize() + "$\n" +
                                   jack + fcRED + " has " + fcPURPLE + jackPrize.getPrize() + "$\n");
                System.out.println(p1 + fcGREEN + ": Oh no! I'll beat you next time!\n" + cRESET);
                return false;

            // Story Mode - player1 lost, player2's turn.
            } else if (!(player1.getName().equals(player2.getName()))) {
                System.out.println(p1 + fcGREEN + ": NOOOOO!!!" + fcRED + " *angrily presses all buttons on the device*" + cRESET);
                sleep(2000);
                System.out.println(fcRED + "*POOF!*" + cRESET);
                sleep(2000);
                System.out.println(p2 + fcYELLOW + ": Woah!! What the hell happened?! Where is " + p1 + fcYELLOW + "?" + cRESET);
                sleep(2000);
                System.out.println(jack + fcCYAN + ": GONE." + cRESET);
                sleep(2000);
                System.out.println(p2 + fcYELLOW + ": What do you mean 'gone'?" + cRESET);
                sleep(2000);
                System.out.println(jack + fcCYAN + ": Just gone... I told you not to use it. Do you want to play?" + cRESET);
                sleep(2000);
                System.out.println(p2 + fcYELLOW + ": I... I'm not sure...\n" + cRESET);
                player1.setName(player2.getName());
                p1 = fcBrightYELLOW + player1.getName() + cRESET;
                return false;

            // Story Mode - player2 lost.
            } else {
                System.out.println(p1 + fcYELLOW + ": Oh NO! What.." + fcRED + " *accidentally presses something on the device*" + cRESET);
                sleep(2000);
                System.out.println(fcRED + "*poof!*" + cRESET);
                sleep(2000);
                System.out.println(jack + fcCYAN + ": You can't really win with a time-traveller...  " + cRESET);
                sleep(2000);
                System.out.println(fcRED + "\nGAME OVER" + cRESET);
                return true;
            }
        }
        return false;
    }
}