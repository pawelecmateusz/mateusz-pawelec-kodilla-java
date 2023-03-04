package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.RpsRunner.*;

public class PointsCalculator {

    // Calculate points.
    public static void calculatePoints (Value playerMove, Value jackMove, Value playerPoints, Value jackPoints) {
        if (playerMove.getValue() == 1) {
            switch (jackMove.getValue()) {
                case 2, 4 -> {
                    System.out.println(fcRED + "* 1 point for " + jack + fcRED + " *" + cRESET);
                    jackPoints.setValue(jackPoints.getValue()+1);
                }
                case 3, 5 -> {
                    System.out.println(fcRED + "* " + p1 + fcRED + " gets a point! *" + cRESET);
                    playerPoints.setValue(playerPoints.getValue()+1);
                }
            }
        } else if (playerMove.getValue() == 2) {
            switch (jackMove.getValue()) {
                case 3, 5 -> {
                    System.out.println(fcRED + "* 1 point for " + jack + fcRED + " *" + cRESET);
                    jackPoints.setValue(jackPoints.getValue()+1);
                }
                case 1, 4 -> {
                    System.out.println(fcRED + "* " + p1 + fcRED + " gets a point! *" + cRESET);
                    playerPoints.setValue(playerPoints.getValue()+1);
                }
            }
        } else if (playerMove.getValue() == 3) {
            switch (jackMove.getValue()) {
                case 1, 4 -> {
                    System.out.println(fcRED + "* 1 point for " + jack + fcRED + " *" + cRESET);
                    jackPoints.setValue(jackPoints.getValue()+1);
                }
                case 2, 5 -> {
                    System.out.println(fcRED + "* " + p1 + fcRED + " gets a point! *" + cRESET);
                    playerPoints.setValue(playerPoints.getValue()+1);
                }
            }
        } else if (playerMove.getValue() == 4) {
            switch (jackMove.getValue()) {
                case 2, 5 -> {
                    System.out.println(fcRED + "* 1 point for " + jack + fcRED + " *" + cRESET);
                    jackPoints.setValue(jackPoints.getValue()+1);
                }
                case 1, 3 -> {
                    System.out.println(fcRED + "* " + p1 + fcRED + " gets a point! *" + cRESET);
                    playerPoints.setValue(playerPoints.getValue()+1);
                }
            }
        } else if (playerMove.getValue() == 5) {
            switch (jackMove.getValue()) {
                case 1, 3 -> {
                    System.out.println(fcRED + "* 1 point for " + jack + fcRED + " *" + cRESET);
                    jackPoints.setValue(jackPoints.getValue()+1);
                }
                case 2, 4 -> {
                    System.out.println(fcRED + "* " + p1 + fcRED + " gets a point! *" + cRESET);
                    playerPoints.setValue(playerPoints.getValue()+1);
                }
            }
        }

        // Display the amount of points each player has.
        System.out.println(p1 + fcRED + " has " + fcPURPLE + playerPoints.getValue() + fcRED + " point/s" + " and " + jack + fcRED + " has " + fcPURPLE + jackPoints.getValue() + fcRED + " point/s\n");
    }
}