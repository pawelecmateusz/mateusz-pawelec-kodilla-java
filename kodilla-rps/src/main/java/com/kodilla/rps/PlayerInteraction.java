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
    static Player jumpingJack = new Player(cCYAN + "Jack");
    static Scanner sc = new Scanner(System.in);
    static String jack = jumpingJack.getName();

    public static void intro1() {
        System.out.println(cYELLOW + "You and your friend had a nice evening at a bar but it's time to head back home.\n" +
                "Your place is not far but you decide to take a shortcut through the alley behind the bar." + cRESET);
    }

    public static void intro2() {
        System.out.println(cYELLOW + "As you're walking to the other end of the alley, you start to notice a weird shape in the dark.\n" +
                "You both slow down although curiosity wins over you and you quietly approach the shape." + cRESET);
    }

    public static void intro3() {
        System.out.println(cYELLOW + "It looks human-like, it's unusually high with legs oddly bent backwards.\n" +
                "You can see how nervously it moves it's hands, like it's punching and shaking something." + cRESET);
    }

    public static void intro4() {
        System.out.println(cYELLOW + "You're a few steps away from the creature but it still doesn't see you.\n" +
                "When you're right next to it, you grab it by the shoulder." + cRESET);
    }

    public static void intro5() {
        System.out.println(cYELLOW + "The creature turns around and jumps back, dropping some device.\n" +
                "The device landed right under your feet and you pick it up without any thinking." + cRESET);
    }

    public static void introduction() throws InterruptedException {

        System.out.println(cCYAN + "Stranger: NO!!! Who are you?! Give it back!\n" + cRESET);
        sleep(2000);
        System.out.print(cGREEN + "Player 1: I am " + cRESET);
        player1.setName(sc.next());
        String p1 = cGREEN + player1.getName();
        System.out.println(cCYAN + "\nStranger: I don't care about your name! Give! It! BACK!\n" + cRESET);
        sleep(2500);
        System.out.println(p1 + ": Wait a minute! What's that?\n" + cRESET);
        sleep(2500);
        System.out.println(cCYAN + "Stranger: None of your business!\n" + cRESET);
        sleep(2500);
        System.out.print(cGREEN + "Player 2: Hey! Calm down! What.. Who are you? What's your name? My name is " + cRESET);
        player2.setName(sc.next());
        String p2 = cGREEN + player2.getName();
        System.out.println("\n" + jack + ": People call me Jack.. I really need that back." + cRED + " *pointing at the device*\n" + cRESET);
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
        theGame();
    }
    public static void skippedIntro() throws InterruptedException {
        System.out.print(cYELLOW + "\nType your name: " + cRESET);
        player1.setName(sc.next());
        System.out.println(jack + ": Hi " + player1.getName() + cCYAN + ", I'll be your opponent.\n" + cRESET);
        sleep(500);
        System.out.println(cYELLOW + "Let's Play '" + rock + cYELLOW + ", " + paper + cYELLOW + ", " + scissors + cYELLOW + "'!");
        sleep(500);
        System.out.print(cYELLOW + "\nHERE ARE SOME ");
        theGame();
    }
    static String rock = cPURPLE + "Rock";
    static String paper = cPURPLE + "Paper";
    static String scissors = cPURPLE + "Scissors";

    public static void rules() throws InterruptedException {

        System.out.println(cYELLOW + "RULES:");
        sleep(500);
        System.out.println(rock + cRED + " beats " + scissors);
        sleep(500);
        System.out.println(paper + cRED + " beats " + rock);
        sleep(500);
        System.out.println(scissors + cRED + " beat " + paper);
        sleep(500);
    }
    public static void controls() throws InterruptedException {
        System.out.println(cYELLOW + "\nCONTROLS:");
        System.out.println(cRED + "For " + rock + cRED + " press 1" + cRESET);
        System.out.println(cRED + "For " + paper + cRED + " press 2" + cRESET);
        System.out.println(cRED + "For " + scissors + cRED + " press 3" + cRESET);
        System.out.println(cRED + "Type 'c' to continue the game" + cRESET);
        System.out.println(cRED + "Type 'n' to start a new game" + cRESET);
        System.out.println(cRED + "Type 'x' to quit the game" + cRESET);
        System.out.println(cRED + "Type 'r' to see the rules\n" + cRESET);
        sleep(500);
    }
    public static void theGame() throws InterruptedException {
        rules();
        controls();
        String p1 = cGREEN + player1.getName() + cRESET;
        String p2 = cGREEN + player2.getName() + cRESET;

        String wins;
        System.out.print(cYELLOW + jack + ": To how many wins would you like to play? 1-5\n" + cRESET);

        while (true) {
            System.out.print(p1 + cGREEN + ": " + cRESET);
            wins = sc.next();
            if (wins.equals("1") || wins.equals("2") || wins.equals("3") || wins.equals("4") || wins.equals("5") ) {
                break;
            }
            System.out.println(cRED + "Please enter a number between 1-5" + cRESET);
        }

        Random random = new Random();
        boolean end = false;
        int parseWins = Integer.parseInt(wins);
        int playerPoints = 0;
        int jackPoints = 0;

        while (!end) {
            int jackMove = random.nextInt(3) + 1;
            String playerMove = null;
            String game;
            String confirm;

            while (!(parseWins == playerPoints) || (parseWins == jackPoints)) {
                System.out.print(cYELLOW + "Pick a number 1-3 \n" + cRESET);
                System.out.print(p1 + cGREEN + ": " + cRESET);
                playerMove = sc.next();
                if (playerMove.equals("1") || (playerMove.equals("2") || (playerMove.equals("3")))) {
                    break;
                }
                System.out.println(cRED + "Please enter a number between 1-3" + cRESET);
            }
            System.out.println("\n" + p1 + cRED + " played " + playerString(playerMove) + cRESET);
            System.out.println(jack + cRED + " played " + jackString(jackMove) + cRESET);

            if (Integer.parseInt(playerMove) == jackMove) {
                System.out.println(cRED + "That's a tie! No points." + cRESET);
            } else if (playerMove.equals("1")) {
                if (jackMove == 3) {
                    System.out.println(cRED + "* " + p1 + cRED + " gets a point! *" + cRESET);
                    playerPoints += 1;
                } else if (jackMove == 2) {
                    System.out.println(cRED + "* 1 point for " + jack + cRED + " *" + cRESET);
                    jackPoints += 1;
                }
            } else if (playerMove.equals("2")) {
                if (jackMove == 1) {
                    System.out.println(cRED + "* " + p1 + cRED + " gets a point! *" + cRESET);
                    playerPoints += 1;
                } else if (jackMove == 3) {
                    System.out.println(cRED + "* 1 point for " + jack + cRED + " *" + cRESET);
                    jackPoints += 1;
                }
            } else if (playerMove.equals("3")) {
                if (jackMove == 2) {
                    System.out.println(cRED + "* " + p1 + cRED + " gets a point! *" + cRESET);
                    playerPoints += 1;
                } else if (jackMove == 1) {
                    System.out.println(cRED + "* 1 point for " + jack + cRED + " *" + cRESET);
                    jackPoints += 1;
                }
            }
            System.out.println(p1 + cRED + " has " + cPURPLE + playerPoints + cRED + " point/s" + " and " + jack + cRED + " has " + cPURPLE + jackPoints + cRED + " point/s\n");

            if (parseWins == playerPoints) {
                System.out.println(p1 + cPURPLE + " wins!\n");
                playerwins();
            } else if (parseWins == jackPoints) {
                System.out.println(jack + cPURPLE + " wins!\n");
                jackwins();
            }

            while (!(parseWins == playerPoints) || (parseWins == jackPoints)) {

                System.out.println(cYELLOW + "(c - continue, n - new game, x - quit game, r - rules)" + cRESET);
                game = sc.next();
                if (game.equals("c") || game.equals("n") || game.equals("x") || game.equals("r")) {
                    if (game.equals("c")) {
                        System.out.println(cRED + "\n~ NEXT ROUND ~" + cRESET);
                        break;
                    } else if (game.equals("n")) {
                        System.out.print(cRED + "Are you sure you want to end the current game? (y/n) \n" + cRESET);
                        confirm = sc.next();
                        System.out.println(" ");
                        if (confirm.equals("y")) {
                            if (!player2.getName().isEmpty()) {
                                System.out.println("Type 's' for a Story Mode");
                                System.out.println("Type 'f' for a Free Mode");
                                confirm = sc.next();
                                if (confirm.equals("s") || confirm.equals("f")) {
                                    if (confirm.equals("s")) {
                                        System.out.print(cYELLOW + "Type Player 1's name to start: " + cRESET);
                                        player1.setName(sc.next());
                                        System.out.println(" ");
                                        theGame();
                                    } else if (confirm.equals("f")) {
                                        player2.setName("");
                                        skippedIntro();
                                    }
                                } else {
                                    System.out.println(cRED + game + " is incorrect! Try again." + cRESET);
                                }
                            } else {
                                System.out.println(jack + ": Good luck this time " + p1 + cCYAN + "! " + cRESET + "\n");
                                theGame();
                            }
                        }
                    } else if (game.equals("x")) {
                        System.out.print(cRED + "Are you sure you want to quit? (y/n) \n" + cRESET);
                        confirm = sc.next();
                        System.out.println(" ");
                        if (confirm.equals("y")) {
                            System.out.println(cYELLOW + "Thanks for playing, bye bye!" + cRESET);
                            System.exit(0);
                        }
                    } else if (game.equals("r")) {
                        rules();
                    }
                } else {
                    System.out.println(cRED + game + " is incorrect! Try again." + cRESET);
                }
            }
        }
        sc.close();
    }
}