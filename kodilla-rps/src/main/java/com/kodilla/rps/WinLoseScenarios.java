package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.PlayerInteraction.*;
import static java.lang.Thread.sleep;

public class WinLoseScenarios {
    static String confirm;

    public static void showPlayerWinScenario() throws InterruptedException {

        if (player2.getName().isEmpty()) {
            System.out.println(tcGREEN + player1.getName() + ": Yes!" + cRESET);
            sleep(2500);
            System.out.print(jack + tcCYAN + ": Congrats! Do you want to play again? (y/n) \n" + cRESET);
            while (true) {
                confirm = sc.next();
                System.out.println(" ");
                if (confirm.equals("y") || confirm.equals("n")) {
                    if (confirm.equals("y")) {
                        playTheGame();
                    } else if (confirm.equals("n")) {
                        System.exit(0);
                    }
                } else {
                    System.out.println(tcRED + "y or n" + cRESET);
                }
            }
        } else {
            if (player1.getName().equals(player2.getName())) {
                System.out.println(tcGREEN + player1.getName() + tcGREEN + ": HAHA!!! I win!" + tcRED + " *accidentally presses something on the device*" + cRESET);
                sleep(2500);
                System.out.println(tcRED + "*poof!*" + cRESET);
                sleep(2500);
                System.out.println(jack + ": You can't really win with a time-traveller... ;) ");
                sleep(2500);
                System.out.println(tcRED + "Game Over" + cRESET);
                sleep(2500);
                System.exit(0);
            } else {
                System.out.println(tcGREEN + player1.getName() + tcGREEN + ": HAHAHA!!! Yes!" + tcRED + " *punches the device*" + cRESET);
                sleep(2500);
                System.out.println(tcRED + "*poof!*" + cRESET);
                sleep(2500);
                System.out.println(tcGREEN + player2.getName() + tcGREEN + ": Woah!! What happened?! Where is " + player1.getName() + "?" + cRESET);
                sleep(2500);
                System.out.println(jack + tcCYAN + ": GONE..." + cRESET);
                sleep(2500);
                System.out.println(jack + tcCYAN + ": I told you not to use it.. do you wanna play too?" + cRESET);
                sleep(2500);
                System.out.println(tcGREEN + player2.getName() + tcGREEN + ": Well.. after that? I don't know.. " + cRESET);
                sleep(2500);
                System.out.println(jack + tcCYAN + ": You'll be fine." + cRESET);
                sleep(2500);
                System.out.println(tcGREEN + player2.getName() + tcGREEN + ": Ok, but you have to fix the device and show me how to use it if I win. " + cRESET);
                sleep(2500);
                System.out.println(jack + tcCYAN + ": Sure. Ready? (y - play / n - quit)" + cRESET);
                while (true) {
                    confirm = sc.next();
                    System.out.println(" ");
                    if (confirm.equals("y") || confirm.equals("n")) {
                        if (confirm.equals("y")) {
                            player1.setName(player2.getName());
                            playTheGame();
                        } else if (confirm.equals("n")) {
                            System.exit(0);
                        }
                    } else {
                        System.out.println(tcRED + "'y' or 'n'" + cRESET);
                    }
                }
            }
        }
    }

    public static void showJackWinScenario() throws InterruptedException {
        if (!player2.getName().isEmpty()) {
            if (player1.getName().equals(player2.getName())) {
                System.out.println(tcGREEN + player1.getName() + tcGREEN + ": Oh NO! What.." + tcRED + " *accidentally presses something on the device*" + cRESET);
                sleep(2500);
                System.out.println(tcRED + "*poof!*" + cRESET);
                sleep(2500);
                System.out.println(jack + ": You can't really win with a time-traveller... ;) ");
                sleep(2500);
                System.out.println(tcRED + "Game Over" + cRESET);
                sleep(2500);
                System.exit(0);
            } else {
                System.out.println(tcGREEN + player1.getName() + ": NOOOOO!!! I'm just gonna use it myself!" + tcRED + " *punches the device*" + cRESET);
                sleep(2500);
                System.out.println(tcRED + "*POOF!*" + cRESET);
                sleep(2500);
                System.out.println(tcGREEN + player2.getName() + ": Woah!! What the hell happened?! Where is " + player1.getName() + "?" + cRESET);
                sleep(2500);
                System.out.println(jack + tcCYAN + ": GONE." + cRESET);
                sleep(2500);
                System.out.println(jack + tcCYAN + ": I told you not to use it.. do you wanna play too?" + cRESET);
                sleep(2500);
                System.out.println(tcGREEN + player2.getName() + ": Of course, but you'll fix the device if I win! Let's play.\n" + cRESET);
                sleep(2500);
                player1.setName(player2.getName());
                playTheGame();
            }
        } else {
            System.out.println(jack + tcCYAN + ": Yay me! Do you want to play again? (y/n) ");
            while (true) {
                confirm = sc.next();
                System.out.println(" ");
                if (confirm.equals("y") || confirm.equals("n")) {
                    if (confirm.equals("y")) {
                        playTheGame();
                    } else if (confirm.equals("n")) {
                        System.exit(0);
                    }
                } else {
                    System.out.println(tcRED + "'y' or 'n'" + cRESET);
                }
            }
        }
    }
}