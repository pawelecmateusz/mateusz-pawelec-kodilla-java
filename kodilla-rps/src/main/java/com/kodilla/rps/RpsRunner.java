package com.kodilla.rps;

import static com.kodilla.rps.PlayerInteraction.*;
import static com.kodilla.rps.ContinueStory.*;
import static com.kodilla.rps.Colors.*;

public class RpsRunner {

    public static void main(String[] args) throws InterruptedException {
        //main menu
        System.out.println(bgcBLACK + "                             " + cRESET);
        System.out.println(bgcBLACK + tcYELLOW + " * " + rock + bgcBLACK + tcYELLOW + " * " + paper + bgcBLACK + tcYELLOW + " * " + scissors + bgcBLACK + tcYELLOW + " * " + cRESET);
        System.out.println(bgcBLACK + "                             " + cRESET);
        System.out.println(bgcBLACK + tcCYAN + "  'Story Mode' - 2 players   " + cRESET);
        System.out.println(bgcBLACK + tcGREEN + "   'Free Mode' - 1 player    " + cRESET);
        System.out.println(bgcBLACK + "                             " + cRESET);
        System.out.println("\n" + tcRED + "*** type 's' to play the " + tcCYAN + "'Story Mode'" + tcRED + " or type 'f' to play the " + tcGREEN + "'Free Mode'" + tcRED + " ***\n" + cRESET);

        while (true) {
            String modeChoice = sc.nextLine();
            System.out.println(" ");
            if (modeChoice.equals("s")) {
                break;
            }else if (modeChoice.equals("f")) {
                skipIntro();
            } else {
                System.out.println(tcRED + "Pick your game mode :)");
            }
        }

        //the story
        tellStory01();
        continueStory();
        tellStory02();
        continueStory();
        tellStory03();
        continueStory();
        tellStory04();
        continueStory();
        tellStory05();
        continueStory();

        //players set their names
        introducePlayers();

        //the actual game where the magic happens
        playTheGame();
    }
}