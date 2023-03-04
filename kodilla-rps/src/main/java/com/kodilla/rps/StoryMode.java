package com.kodilla.rps;

import java.util.*;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.RpsRunner.*;
import static java.lang.Thread.sleep;

public class StoryMode {
    public static void tellStory() throws InterruptedException {

        // Story Mode title.
        List<String> title = new ArrayList<>();
        title.add(fcYELLOW + "* * * " + cRESET);
        title.add(fcPURPLE + "A " + cRESET);
        title.add(fcPURPLE + "S" + cRESET);
        title.add(fcPURPLE + "T" + cRESET);
        title.add(fcPURPLE + "R" + cRESET);
        title.add(fcPURPLE + "A" + cRESET);
        title.add(fcPURPLE + "N" + cRESET);
        title.add(fcPURPLE + "G" + cRESET);
        title.add(fcPURPLE + "E " + cRESET);
        title.add(fcPURPLE + "I" + cRESET);
        title.add(fcPURPLE + "N" + cRESET);
        title.add(fcPURPLE + "C" + cRESET);
        title.add(fcPURPLE + "I" + cRESET);
        title.add(fcPURPLE + "D" + cRESET);
        title.add(fcPURPLE + "E" + cRESET);
        title.add(fcPURPLE + "N" + cRESET);
        title.add(fcPURPLE + "T" + cRESET);
        title.add(fcYELLOW + " * * *\n\n" + cRESET);

        for(String t : title) {
            System.out.print(t);
            sleep(200);
        }

        // Story Mode introduction.
        List<String> intro = new ArrayList<>();
        intro.add(fcYELLOW + "You and your friend had a nice evening at a bar but it's time to head back home.\n" +
                "Your place is not far but you decide to take a shortcut through the alley behind the bar.\n" + cRESET);
        intro.add(fcYELLOW + "As you're walking to the other end of the alley, you start to notice a weird shape in the dark.\n" +
                "You both slow down although curiosity wins over you and you quietly approach the shape.\n" + cRESET);
        intro.add(fcYELLOW + "It looks human-like, it's unusually high with legs oddly bent backwards.\n" +
                "You can see how nervously it moves it's hands, like it's punching and shaking something.\n" + cRESET);
        intro.add(fcYELLOW + "You're a few steps away from the creature but it still doesn't see you.\n" +
                "When you're right next to it, you grab it by the shoulder.\n" + cRESET);
        intro.add(fcYELLOW + "The creature turns around and jumps back, dropping some device.\n" +
                "The device landed right under your feet and you pick it up without any thinking.\n" + cRESET);

        for(String i : intro) {
            System.out.print(i);
            continueStory();
        }
    }

    // Just an interlude for introduction.
    public static void continueStory() {
        System.out.print(fcRED + "\n*** c - continue ***\n" + cRESET);
        while (true) {
            String keyMap = scanner.next();
            System.out.println(" ");
            if (keyMap.equals("c")) {
                break;
            } else {
                System.out.println(fcRED + "wrong input" + cRESET);
            }
        }
    }

    static String stranger = fcBrightCYAN + "Stranger" + cRESET;

    // Players type in their names and the game starts after the dialog.
    public static void introducePlayers() throws InterruptedException {

        TreeMap<Integer, String> dialog = new TreeMap<>();
        dialog.put(1, stranger + fcCYAN + ": NO!!! Who are you?! Give it back!\n" + cRESET);
        dialog.put(2, fcBrightGREEN + "Player 1" + cRESET + fcGREEN + ": I am " + cRESET);
        dialog.put(3, stranger + fcCYAN + ": I don't care about your name! Give! It! BACK!\n" + cRESET);
        dialog.put(4, fcGREEN + ": Wait a minute! What's that?\n" + cRESET);
        dialog.put(5, stranger + fcCYAN + ": None of your business!\n" + cRESET);
        dialog.put(6, fcBrightYELLOW + "Player 2: " + cRESET + fcYELLOW + "Hey! Calm down! Who are you? What's your name? My name is " + cRESET);
        dialog.put(7, jack + fcCYAN + ": People call me Jack... I really need that back." + fcRED + " *pointing at the device*\n" + cRESET);
        dialog.put(8, fcYELLOW + ": Tell us who you are and why do you look so weird?\n" + cRESET);
        dialog.put(9, jack + fcCYAN + ": I can't, you wouldn't understand.\n" + cRESET);
        dialog.put(10, fcGREEN + ": Try us...\n" + cRESET);
        dialog.put(11, jack + fcCYAN + ": No... I... Okay. It's a... It allows me to time-travel.\n" + cRESET);
        dialog.put(12, fcYELLOW + ": Wait, what?! Where do you come from then? I mean 'when'.\n" + cRESET);
        dialog.put(13, fcGREEN + ": Who cares! We'll just use it ourselves! We can get rich with it!\n" + cRESET);
        dialog.put(14, jack + fcCYAN + ": No, don't! You can't! Listen... I'm in a hurry here and I need the device.\n" + cRESET);
        dialog.put(15, fcGREEN + ": We can play for it. If we win we'll keep it.\n" + cRESET);
        dialog.put(16, fcYELLOW + ": Do you know the game called 'Rock, Paper, Scissors'?\n" + cRESET);
        dialog.put(17, jack + fcCYAN + ": Yes. Ok... Let's play then.\n" + cRESET);
        dialog.put(18, fcGREEN + ": I'll play with you!\n" + cRESET);

        // Display 'dialog' TreeMap.
        for (Map.Entry<Integer, String> d : dialog.entrySet()) {

            // Display entry 2 and ask for player1's name.
            if (d.getKey() == 2) {
                System.out.print(d.getValue());
                player1.setName(scanner.next());
                p1 = fcBrightGREEN + player1.getName() + cRESET;
                System.out.println(" ");

            // Display entry 6 and ask for player2's name.
            } else if (d.getKey() == 6) {
                System.out.print(d.getValue());
                player2.setName(scanner.next());
                while (player2.getName().equals(player1.getName())) {
                    System.out.println(fcRED + "\nPlease enter a different name.\n" + cRESET);
                    player2.setName(scanner.next());
                }
                p2 = fcBrightYELLOW + player2.getName() + cRESET;
                System.out.println(" ");

            // Display the rest of the entries.
            } else {
                // For entry 4, 10, 13, 15, 18 add player1's name.
                if (d.getKey() == 4 || d.getKey() == 10 || d.getKey() == 13 || d.getKey() == 15 || d.getKey() == 18) {
                    System.out.println(p1 + d.getValue());
                    sleep(2000);
                // For entry 8, 12, 16 add player2's name.
                } else if (d.getKey() == 8 || d.getKey() == 12 || d.getKey() == 16 ) {
                    System.out.println(p2 + d.getValue());
                    sleep(2000);
                } else {
                    System.out.println(d.getValue());
                    sleep(2000);
                }
            }
        }
    }
}