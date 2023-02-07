package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.PlayerInteraction.*;

public class ContinueOrSkip {
    public static void continueOrSkip() throws InterruptedException {
        while (true) {
            System.out.print(cRED + "\n*** press enter to continue or type 's' to start the game ***\n" + cRESET);
            String keyMap = sc.nextLine();
            if (keyMap.equals("s")) {
                skippedIntro();
                break;
            } else if (keyMap.isEmpty()) {
                break;
            }
        }
    }
}
