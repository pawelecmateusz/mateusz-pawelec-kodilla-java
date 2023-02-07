package com.kodilla.rps;

import static com.kodilla.rps.PlayerInteraction.*;
import static com.kodilla.rps.ContinueOrSkip.*;

public class RpsRunner {

    public static void main(String[] args) throws InterruptedException {

       //the story
        intro1();
        continueOrSkip();
        intro2();
        continueOrSkip();
        intro3();
        continueOrSkip();
        intro4();
        continueOrSkip();
        intro5();
        continueOrSkip();

        //players set their names
        introduction();

        //the actual game
        thegame();
    }
}