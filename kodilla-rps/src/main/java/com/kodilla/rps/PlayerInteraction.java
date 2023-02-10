package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.IntegerTranslator.*;
import static com.kodilla.rps.WinLoseScenarios.*;
import static java.lang.Thread.sleep;

public class PlayerInteraction {
    static Player player1 = new Player("");
    static Player player2 = new Player("");
    static Player jumpingJack = new Player(tcCYAN + "Jack");
    static String jack = jumpingJack.getName();
    static RPSsign rockSign = new RPSsign(tcPURPLE + "Rock" + cRESET);
    static RPSsign paperSign = new RPSsign(tcPURPLE + "Paper" + cRESET);
    static RPSsign scissorsSign = new RPSsign(tcPURPLE + "Scissors" + cRESET);
    static Scanner sc = new Scanner(System.in);

    public static void tellStory01() {
        System.out.println(tcYELLOW + "You and your friend had a nice evening at a bar but it's time to head back home.\n" +
                "Your place is not far but you decide to take a shortcut through the alley behind the bar." + cRESET);
    }

    public static void tellStory02() {
        System.out.println(tcYELLOW + "As you're walking to the other end of the alley, you start to notice a weird shape in the dark.\n" +
                "You both slow down although curiosity wins over you and you quietly approach the shape." + cRESET);
    }

    public static void tellStory03() {
        System.out.println(tcYELLOW + "It looks human-like, it's unusually high with legs oddly bent backwards.\n" +
                "You can see how nervously it moves it's hands, like it's punching and shaking something." + cRESET);
    }

    public static void tellStory04() {
        System.out.println(tcYELLOW + "You're a few steps away from the creature but it still doesn't see you.\n" +
                "When you're right next to it, you grab it by the shoulder." + cRESET);
    }

    public static void tellStory05() {
        System.out.println(tcYELLOW + "The creature turns around and jumps back, dropping some device.\n" +
                "The device landed right under your feet and you pick it up without any thinking." + cRESET);
    }

    public static void introducePlayers() throws InterruptedException {

        System.out.println(tcCYAN + "Stranger: NO!!! Who are you?! Give it back!\n" + cRESET);
        sleep(2000);
        System.out.print(tcGREEN + "Player 1: I am " + cRESET);
        player1.setName(sc.next());
        String p1 = tcGREEN + player1.getName();
        System.out.println(tcCYAN + "\nStranger: I don't care about your name! Give! It! BACK!\n" + cRESET);
        sleep(2500);
        System.out.println(p1 + ": Wait a minute! What's that?\n" + cRESET);
        sleep(2500);
        System.out.println(tcCYAN + "Stranger: None of your business!\n" + cRESET);
        sleep(2500);
        System.out.print(tcGREEN + "Player 2: Hey! Calm down! What.. Who are you? What's your name? My name is " + cRESET);

        while (true) {
            player2.setName(sc.next());
            if (!player2.getName().equals(player1.getName())) {
                break;
            } else {
                System.out.println(tcRED + "\nPlease enter a different name.\n" + cRESET);
            }
        }

        String p2 = tcGREEN + player2.getName();
        System.out.println("\n" + jack + ": People call me Jack.. I really need that back." + tcRED + " *pointing at the device*\n" + cRESET);
        sleep(2500);
        System.out.println(p2 + ": Tell us who you are and why do you look so weird?\n" + cRESET);
        sleep(2500);
        System.out.println(jack + ": I can't, you wouldn't understand.\n" + cRESET);
        sleep(2500);
        System.out.println(p1 + ": Try us..\n" + cRESET);
        sleep(2500);
        System.out.println(jack + ": No.. I.. Okay. It's a.. It allows me to time-travel..\n" + cRESET);
        sleep(3000);
        System.out.println(p2 + ": Wait, what?! Where do you come from then? I mean 'when'.\n" + cRESET);
        sleep(3500);
        System.out.println(p1 + ": Who cares, " + p2 + "! We'll just use it ourselves! We can get rich with it!\n" + cRESET);
        sleep(4000);
        System.out.println(jack + ": No, don't! You can't! Okay.. listen.. I'm in a hurry here and I need the device.\n" + cRESET);
        sleep(4000);
        System.out.println(p1 + ": We can play for it. Do you know the game called 'Rock, Paper, Scissors'? If we win we'll keep it.\n" + cRESET);
        sleep(4000);
        System.out.println(p2 + ": ..but if we lose, you'll at least tell us something that will make us rich.\n" + cRESET);
        sleep(4000);
        System.out.println(jack + ": Deal. Let's play then.\n" + cRESET);
        sleep(3000);
        System.out.println(p1 + " to " + p2 + ": I'll play with him!\n" + cRESET);
        sleep(3000);
        playTheGame();
    }
    static String rock = rockSign.getSignName();
    static String paper = paperSign.getSignName();
    static String scissors = scissorsSign.getSignName();

    public static void skipIntro() throws InterruptedException {
        System.out.println(tcYELLOW + "Let's Play '" + rock + tcYELLOW + ", " + paper + tcYELLOW + ", " + scissors + tcYELLOW + "'!");
        sleep(500);
        System.out.print(tcYELLOW + "\nType your name: " + cRESET);
        player1.setName(sc.next());
        sleep(500);
        System.out.println(jack + ": Hi " + player1.getName() + tcCYAN + ", I'll be your opponent.\n" + cRESET);
        sleep(500);
        System.out.print(tcYELLOW + "HERE ARE SOME ");
        playTheGame();
    }
    public static void showRules() throws InterruptedException {

        System.out.println(tcYELLOW + "RULES:");
        sleep(500);
        System.out.println(rock + tcRED + " beats " + scissors);
        sleep(500);
        System.out.println(paper + tcRED + " beats " + rock);
        sleep(500);
        System.out.println(scissors + tcRED + " beat " + paper + "\n");
        sleep(500);
    }
    public static void showControls() throws InterruptedException {
        System.out.println(tcYELLOW + "CONTROLS:");
        System.out.println(tcRED + "For " + rock + tcRED + " press 1" + cRESET);
        System.out.println(tcRED + "For " + paper + tcRED + " press 2" + cRESET);
        System.out.println(tcRED + "For " + scissors + tcRED + " press 3\n" + cRESET);

        sleep(500);
    }

    public static void playTheGame() throws InterruptedException {
        showRules();
        showControls();
        String p1 = tcGREEN + player1.getName() + cRESET;
        String p2 = tcGREEN + player2.getName() + cRESET;

        String numberOfWins;
        System.out.print(tcYELLOW + jack + ": To how many wins would you like to play? 1-5\n" + cRESET);

        while (true) {
            System.out.print(p1 + tcGREEN + ": " + cRESET);
            numberOfWins = sc.next();
            if (numberOfWins.equals("1") || numberOfWins.equals("2") || numberOfWins.equals("3") || numberOfWins.equals("4") || numberOfWins.equals("5") ) {
                break;
            }
            System.out.println(tcRED + "Please enter a number between 1-5" + cRESET);
        }

        Random random = new Random();
        boolean end = false;
        int parseWins = Integer.parseInt(numberOfWins);
        int playerPoints = 0;
        int jackPoints = 0;

        while (!end) {
            int jackMove = random.nextInt(3) + 1;
            String playerMove = null;
            String controlKey;
            String confirm;

            while (!(parseWins == playerPoints) || (parseWins == jackPoints)) {
                System.out.print(jack + ": Your move (1-3) \n" + cRESET);
                System.out.print(p1 + tcGREEN + ": " + cRESET);
                playerMove = sc.next();
                if (playerMove.equals("1") || (playerMove.equals("2") || (playerMove.equals("3")))) {
                    break;
                }
                System.out.println(tcRED + "Please enter a number between 1-3" + cRESET);
            }
            System.out.println("\n" + p1 + tcRED + " played " + translatePlayerMove(playerMove) + cRESET);
            System.out.println(jack + tcRED + " played " + translateJackMove(jackMove) + cRESET);

            if (Integer.parseInt(playerMove) == jackMove) {
                System.out.println(tcRED + "That's a tie! No points." + cRESET);
            } else if (playerMove.equals("1")) {
                if (jackMove == 3) {
                    System.out.println(tcRED + "* " + p1 + tcRED + " gets a point! *" + cRESET);
                    playerPoints += 1;
                } else if (jackMove == 2) {
                    System.out.println(tcRED + "* 1 point for " + jack + tcRED + " *" + cRESET);
                    jackPoints += 1;
                }
            } else if (playerMove.equals("2")) {
                if (jackMove == 1) {
                    System.out.println(tcRED + "* " + p1 + tcRED + " gets a point! *" + cRESET);
                    playerPoints += 1;
                } else if (jackMove == 3) {
                    System.out.println(tcRED + "* 1 point for " + jack + tcRED + " *" + cRESET);
                    jackPoints += 1;
                }
            } else if (playerMove.equals("3")) {
                if (jackMove == 2) {
                    System.out.println(tcRED + "* " + p1 + tcRED + " gets a point! *" + cRESET);
                    playerPoints += 1;
                } else if (jackMove == 1) {
                    System.out.println(tcRED + "* 1 point for " + jack + tcRED + " *" + cRESET);
                    jackPoints += 1;
                }
            }
            System.out.println(p1 + tcRED + " has " + tcPURPLE + playerPoints + tcRED + " point/s" + " and " + jack + tcRED + " has " + tcPURPLE + jackPoints + tcRED + " point/s\n");

            if (parseWins == playerPoints) {
                System.out.println(p1 + tcPURPLE + " wins!\n");
                showPlayerWinScenario();
            } else if (parseWins == jackPoints) {
                System.out.println(jack + tcPURPLE + " wins!\n");
                showJackWinScenario();
            }

            while (!(parseWins == playerPoints) || (parseWins == jackPoints)) {

                System.out.println(tcYELLOW + "(c - continue, n - new game, x - quit game, r - rules)" + cRESET);
                controlKey = sc.next();
                System.out.println(" ");
                if (controlKey.equals("c") || controlKey.equals("n") || controlKey.equals("x") || controlKey.equals("r")) {
                    if (controlKey.equals("c")) {
                        System.out.println(tcYELLOW + "\n~ NEXT ROUND ~" + cRESET);
                        break;
                    } else if (controlKey.equals("n")) {
                        System.out.print(tcRED + "Are you sure you want to end the current game? (y/n) \n" + cRESET);
                        confirm = sc.next();
                        System.out.println(" ");
                        if (confirm.equals("y")) {
                            if (!player2.getName().isEmpty()) {
                                System.out.println(tcRED + "Type 's' for the " + tcCYAN + "'Story Mode'" + cRESET);
                                System.out.println(tcRED + "Type 'f' for the " + tcGREEN + "'Free Mode'" + cRESET);
                                confirm = sc.next();
                                if (confirm.equals("s") || confirm.equals("f")) {
                                    if (confirm.equals("s")) {
                                        System.out.print(tcYELLOW + "Type Player 1's name to start: " + cRESET);
                                        while (true) {
                                            player1.setName(sc.next());
                                            if (player1.getName().equals(player2.getName())) {
                                                System.out.println(tcRED + "Please enter a different name.");

                                            } else {
                                                System.out.println(" ");
                                                playTheGame();
                                            }
                                        }
                                    } else if (confirm.equals("f")) {
                                        player2.setName("");
                                        skipIntro();
                                    }
                                } else {
                                    System.out.println(tcRED + controlKey + " is incorrect! Try again." + cRESET);
                                }
                            } else {
                                System.out.println(jack + ": Good luck this time " + p1 + tcCYAN + "! " + cRESET + "\n");
                                playTheGame();
                            }
                        }
                    } else if (controlKey.equals("x")) {
                        System.out.print(tcRED + "Are you sure you want to quit? (y/n) \n" + cRESET);
                        while (true) {
                            confirm = sc.next();
                            System.out.println(" ");
                            if (confirm.equals("y")) {
                                System.out.println(tcYELLOW + "Thanks for playing, bye bye!" + cRESET);
                                System.exit(0);
                            } else if (confirm.equals("n")) {
                                break;
                            }
                            System.out.println(tcRED + "sure? not sure? hmm.. (y/n)" + cRESET);
                        }
                    }else if (controlKey.equals("r")) {
                        showRules();
                    }
                } else {
                    System.out.println(tcRED + controlKey + " is incorrect! Try again." + cRESET);
                }
            }
        }
        sc.close();
    }
}