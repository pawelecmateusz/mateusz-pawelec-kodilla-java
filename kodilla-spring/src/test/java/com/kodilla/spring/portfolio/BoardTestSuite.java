package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        board.getToDoList().addTask("shopping");
        board.getInProgressList().addTask("learning");
        board.getDoneList().addTask("sleeping");
        //When & Then
        Assertions.assertTrue(board.getToDoList().getTasks().contains("shopping"));
        Assertions.assertTrue(board.getInProgressList().getTasks().contains("learning"));
        Assertions.assertTrue(board.getDoneList().getTasks().contains("sleeping"));
    }
}
