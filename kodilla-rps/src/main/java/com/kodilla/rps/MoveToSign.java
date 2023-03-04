package com.kodilla.rps;

import static com.kodilla.rps.MainMenu.*;

public class MoveToSign {


    public static String getMoveSign(Value playerMove) {
        return switch (playerMove.getValue()) {
            case 1 -> rock;
            case 2 -> paper;
            case 3 -> scissors;
            case 4 -> spock;
            case 5 -> lizard;
            default -> "pick something!";
        };
    }
}