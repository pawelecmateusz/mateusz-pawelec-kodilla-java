package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.PlayerInteraction.*;
import static java.lang.Thread.sleep;

public class WinLoseScenarios {
    static String confirm;

    public static void playerwins() throws InterruptedException {

        if (player2.getName().isEmpty()) {
            System.out.println(cGREEN + player1.getName() + ": Yes!" + cRESET);
            sleep(2500);
            System.out.print(jack + cCYAN + ": Congrats! Do you want to play again? (y/n) \n" + cRESET);
            while (true) {
                confirm = sc.next();
                System.out.println(" ");
                if (confirm.equals("y") || confirm.equals("n")) {
                    if (confirm.equals("y")) {
                        thegame();
                    } else if (confirm.equals("n")) {
                        System.exit(0);
                    }
                } else {
                    System.out.println(cRED + "y or n" + cRESET);
                }
            }
        } else {
            System.out.println(cGREEN + player1.getName() + cGREEN + ": HAHA!!! I win! And now I'll use it! " + cRED + "*presses something on the device*" + cRESET);
            sleep(2500);
            System.out.println(cRED + "*poof!*" + cRESET);
            sleep(2500);
            if (player1.getName().equals(player2.getName())) {
                System.out.println(jack + ": You can't really win with a time-traveller...");
                sleep(3000);
                System.exit(0);
            } else {
                System.out.println(cGREEN + player2.getName() + cGREEN + ": Woah!! What happened?! Where is " + player1.getName() + "?" + cRESET);
                sleep(2500);
                System.out.println(jack + cCYAN + ": GONE..." + cRESET);
                sleep(2500);
                System.out.println(jack + cCYAN + ": I told you not to use it.. do you wanna play too?" + cRESET);
                sleep(2500);
                System.out.println(cGREEN + player2.getName() + cGREEN + ": You have to fix the device if I win. " + cRESET);
                System.out.println(jack + cCYAN + "Sure. Ready? (y/n)" + cRESET);
                while (true) {
                    confirm = sc.next();
                    if (confirm.equals("y") || confirm.equals("n")) {
                        if (confirm.equals("y")) {
                            sleep(2500);
                            player1.setName(player2.getName());
                            thegame();
                        } else if (confirm.equals("n")) {
                            System.exit(0);
                        }
                    } else {
                        System.out.println(cRED + "'y' or 'n'" + cRESET);
                    }
                }
            }
        }
    }

    public static void jackwins() throws InterruptedException {
        if (!player2.getName().isEmpty()) {
            System.out.println(cGREEN + player1.getName() + ": NOOOOO!!! I'm just gonna use it myself!" + cRED + "*punches the device*" + cRESET);
            sleep(2500);
            System.out.println(cRED + "*POOF!*" + cRESET);
            sleep(2500);
            System.out.println(cGREEN + player2.getName() + ": Woah!! What the hell happened?! Where is " + player1.getName() + "?" + cRESET);
            sleep(2500);
            System.out.println(jack + cCYAN + ": GONE." + cRESET);
            sleep(2500);
            System.out.println(jack + cCYAN + ": I told you not to use it.. do you wanna play too?" + cRESET);
            sleep(2500);
            System.out.println(cGREEN + player2.getName() + ": You have to fix the device if I win. Let's play." + cRESET);
            sleep(2500);
            player1.setName(player2.getName());
            thegame();
        } else {
            System.out.println(jack + cCYAN + ": Yay me! Do you want to play again? (y/n) ");
            while (true) {
                confirm = sc.next();
                System.out.println(" ");
                if (confirm.equals("y") || confirm.equals("n")) {
                    if (confirm.equals("y")) {
                        thegame();
                    } else if (confirm.equals("n")) {
                        System.exit(0);
                    }
                } else {
                    System.out.println(cRED + "'y' or 'n'" + cRESET);
                }
            }
        }
    }
}
