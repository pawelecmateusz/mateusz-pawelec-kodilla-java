package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.StoryMode.*;
import static com.kodilla.rps.RpsRunner.*;
import static java.lang.Thread.sleep;

public class MainMenu {

    static rpsSign rockSign = new rpsSign(fcBrightPURPLE + "Rock" + cRESET);
    static rpsSign paperSign = new rpsSign(fcBrightPURPLE + "Paper" + cRESET);
    static rpsSign scissorsSign = new rpsSign(fcBrightPURPLE + "Scissors" + cRESET);
    static rpsSign spockSign = new rpsSign(fcBrightPURPLE + "Spock" + cRESET);
    static rpsSign lizardSign = new rpsSign(fcBrightPURPLE + "Lizard" + cRESET);
    static String rock = rockSign.getSignName();
    static String paper = paperSign.getSignName();
    static String scissors = scissorsSign.getSignName();
    static String spock = spockSign.getSignName();
    static String lizard = lizardSign.getSignName();

    // Display game menu.
    public static void showMenu() throws InterruptedException {
        System.out.println(bgcBLACK + "                             " + cRESET);
        System.out.println(bgcBLACK + fcBrightYELLOW + " * " + rock + bgcBLACK + fcBrightYELLOW + " * " + paper + bgcBLACK + fcBrightYELLOW + " * " + scissors + bgcBLACK + fcYELLOW + " * " + cRESET);
        System.out.println(bgcBLACK + fcBrightYELLOW + "    * " + spock + bgcBLACK + fcBrightYELLOW + " and " + lizard + bgcBLACK + fcBrightYELLOW + " *     " + cRESET);
        System.out.println(bgcBLACK + fcBrightYELLOW + "          EDITION!           " + cRESET);
        System.out.println(bgcBLACK + "                             " + cRESET);
        System.out.println(bgcBLACK + fcCYAN + "  'Story Mode' - 2 players   " + cRESET);
        System.out.println(bgcBLACK + fcGREEN + "   'Free Mode' - 1 player    " + cRESET);
        System.out.println(bgcBLACK + "                             " + cRESET);
        System.out.println("\n" + fcRED + "*** type 's' to play the " + fcCYAN + "'Story Mode'" + fcRED + " ***\n" + "*** type 'f' to play the " + fcGREEN + "'Free Mode'" + fcRED + " ***\n" + cRESET);

        menuLoop:
        while (true) {
            controlKey = scanner.next();
            System.out.println(" ");
            switch(controlKey) {

                // Start Story Mode.
                case "s":
                    tellStory();
                    introducePlayers();
                    showRules();
                    showControls();
                    break menuLoop;

                // Start Free Mode.
                case "f":
                    startFreeMode();
                    showRules();
                    showControls();
                    showGameInfo();
                    break menuLoop;

                // Wrong input.
                default:
                    System.out.println(fcRED + "Pick your game mode");
            }
        }
    }

    // Asking the player for the name.
    public static void startFreeMode() throws InterruptedException {
        System.out.print(fcYELLOW + "Type your name: " + cRESET);
        player1.setName(scanner.next());
        p1 = fcBrightGREEN + player1.getName() + cRESET;
        sleep(500);
        System.out.println(jack + fcCYAN + ": Hi " + p1 + fcCYAN + ", I'll be your opponent.\n" + cRESET);
        sleep(500);
        System.out.print(fcYELLOW + "HERE ARE SOME ");
    }

    // Rules for RPS.
    public static void showRules() throws InterruptedException {
        System.out.println(fcYELLOW + "RULES:");
        sleep(100);
        System.out.println(rock + fcRED + " crushes " + scissors);
        sleep(100);
        System.out.println(rock + fcRED + " crushes " + lizard);
        sleep(100);
        System.out.println(paper + fcRED + " covers " + rock);
        sleep(100);
        System.out.println(paper + fcRED + " disproves " + spock);
        sleep(100);
        System.out.println(scissors + fcRED + " cut " + paper);
        sleep(100);
        System.out.println(scissors + fcRED + " decapitate " + lizard);
        sleep(100);
        System.out.println(spock + fcRED + " vaporizes " + rock);
        sleep(100);
        System.out.println(spock + fcRED + " smashes " + scissors);
        sleep(100);
        System.out.println(lizard + fcRED + " eats " + paper);
        sleep(100);
        System.out.println(lizard + fcRED + " poisons " + spock);
        sleep(100);
        System.out.println(" ");
    }

    // Controls for RPS.
    public static void showControls() throws InterruptedException {
        System.out.println(fcYELLOW + "CONTROLS:");
        sleep(100);
        System.out.println(fcRED + "For " + rock + fcRED + " type 1" + cRESET);
        sleep(100);
        System.out.println(fcRED + "For " + paper + fcRED + " type 2" + cRESET);
        sleep(100);
        System.out.println(fcRED + "For " + scissors + fcRED + " type 3" + cRESET);
        sleep(100);
        System.out.println(fcRED + "For " + spock + fcRED + " type 4" + cRESET);
        sleep(100);
        System.out.println(fcRED + "For " + lizard + fcRED + " type 5\n" + cRESET);
        sleep(100);
    }

    // RPS Free Mode info.
    public static void showGameInfo() {
        System.out.println(fcYELLOW + "GAME INFO:" + cRESET);
        System.out.println(fcYELLOW + "- players get 10$ at the start of the game\n" +
                "- you have to choose the number of wins you'd like to play to (1-5)\n" +
                "- each round consists of the number of wins that you chose\n" +
                "- 2-5 wins multiply your money if you win but divide you money if you lose\n" +
                "- 1 win gives you 10$ if you win but takes away 10$ if you lose\n" +
                "- a player who gets to 1000$ first, wins the game!\n" +
                "- oh, and there can be no tie, so... enjoy.\n" + cRESET);
    }
}
