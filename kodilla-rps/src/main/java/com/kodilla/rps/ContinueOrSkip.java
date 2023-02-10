package com.kodilla.rps;

import static com.kodilla.rps.Colors.*;
import static com.kodilla.rps.PlayerInteraction.*;

public class ContinueOrSkip {
    public static void continueStory() throws InterruptedException {
        System.out.print(tcRED + "\n*** press enter to continue ***\n" + cRESET);
        while (true) {
            String keyMap = sc.nextLine();
            if (keyMap.equals("")) {
                break;
            } else {
                System.out.println("wrong input");
            }
        }
    }
}