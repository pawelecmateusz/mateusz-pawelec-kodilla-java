package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestForumStatistics {

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Nested
    @DisplayName("Test Posts")
    class testPosts {
        @DisplayName("zero posts")
        @Test
        void testPostsCount0() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.postsCount()).thenReturn(0);
            //When

            //Then
            Assertions.assertEquals(0, forumStatistics.postsCount());
        }

        @DisplayName("1000 posts")
        @Test
        void testPostsCount1000() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.postsCount()).thenReturn(1000);
            //When

            //Then
            Assertions.assertEquals(1000, forumStatistics.postsCount());
        }
    }

    @Nested
    @DisplayName("Test Comments")
    class testComments {
        @DisplayName("zero comments")
        @Test
        void testCommentsCount0() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When

            //Then
            Assertions.assertEquals(0, forumStatistics.commentsCount());
        }

        @DisplayName("less comments than posts")
        @Test
        void testLessCommentsThanPosts() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.postsCount()).thenReturn(2);
            when(statisticsMock.commentsCount()).thenReturn(1);
            //When

            //Then
            Assertions.assertTrue(forumStatistics.commentsCount() < forumStatistics.postsCount());
        }

        @DisplayName("more comments than posts")
        @Test
        void testMoreCommentsThanPosts() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.postsCount()).thenReturn(1);
            when(statisticsMock.commentsCount()).thenReturn(2);
            //When

            //Then
            Assertions.assertTrue(forumStatistics.commentsCount() > forumStatistics.postsCount());
        }
    }
    @Nested
    @DisplayName("Test Users")
    class testUsers {
        @DisplayName("zero users")
        @Test
        void testZeroUsers() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> usersList = new ArrayList<>();
            //When

            //Then
            Assertions.assertEquals(usersList.size(), forumStatistics.usersNames().size());
        }
        @DisplayName("100 users")
        @Test
        void test100Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> usersList = new ArrayList<>();
            for (int n = 1; n <= 100; n++) {
                usersList.add("User" + n);
            }
            //When

            //Then
            Assertions.assertEquals(100,usersList.size());
        }
    }
}