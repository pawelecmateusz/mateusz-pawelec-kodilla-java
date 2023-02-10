package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.PlayerInteraction.*;

public class IntegerTranslator {
    public static String translateJackMove(int jackMove) {
        String jackString = "";
        if (jackMove == 1) {
            jackString = rock;
        }
        if (jackMove == 2) {
            jackString = paper;
        }
        if (jackMove == 3) {
            jackString = scissors;
        }
        return jackString;
    }
    public static String translatePlayerMove(String playerMove) {
        String playerString = "";
        if (playerMove.equals("1")) {
            playerString = rock;
        }
        if (playerMove.equals("2")) {
            playerString = paper;
        }
        if (playerMove.equals("3")) {
            playerString = scissors;
        }
        return playerString;
    }
}