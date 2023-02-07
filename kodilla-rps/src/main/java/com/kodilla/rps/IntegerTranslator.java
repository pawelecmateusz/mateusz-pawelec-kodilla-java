package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;

public class IntegerTranslator {
    public static String jackString (int jackMove) {
        String jackString = "";
        if (jackMove == 1) {
            jackString = cPURPLE + "rock";
        }
        if (jackMove == 2) {
            jackString = cPURPLE + "paper";
        }
        if (jackMove == 3) {
            jackString = cPURPLE + "scissors";
        }
        return jackString;
    }
    public static String playerString (String playerMove) {
        String playerString = "";
        if (playerMove.equals("1")) {
            playerString = cPURPLE + "rock";
        }
        if (playerMove.equals("2")) {
            playerString = cPURPLE + "paper";
        }
        if (playerMove.equals("3")) {
            playerString = cPURPLE + "scissors";
        }
        return playerString;
    }
}