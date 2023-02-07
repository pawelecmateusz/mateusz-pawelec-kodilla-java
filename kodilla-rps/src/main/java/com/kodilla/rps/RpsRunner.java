package com.kodilla.rps;

import static com.kodilla.rps.PlayerInteraction.*;
import static com.kodilla.rps.ContinueOrSkip.*;
import static com.kodilla.rps.Colors.*;

public class RpsRunner {

    public static void main(String[] args) throws InterruptedException {

       //the story
        System.out.println(cCYAN + "'Story Mode'" + cRESET);
        continueOrSkip();
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
        theGame();
    }
}