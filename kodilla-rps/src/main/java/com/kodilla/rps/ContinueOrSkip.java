package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.PlayerInteraction.*;

public class ContinueOrSkip {
    public static void continueOrSkip() throws InterruptedException {
        while (true) {
            System.out.print(cRED + "\n*** press enter to continue with the " + cCYAN + "'Story Mode'" + cRED + " or type 'f' to start a " + cGREEN + "'Free Mode'" + cRED + " ***\n" + cRESET);
            String keyMap = sc.nextLine();
            if (keyMap.equals("f")) {
                skippedIntro();
                break;
            } else if (keyMap.isEmpty()) {
                break;
            }
        }
    }
}