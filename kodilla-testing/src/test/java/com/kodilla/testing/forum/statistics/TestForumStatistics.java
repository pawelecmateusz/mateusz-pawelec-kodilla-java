package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestForumStatistics {

    @Mock
    private Statistics statisticsMock;
    private List<String> createUserNameList(int numberOfUsers) {
        List<String> userNameList = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            userNameList.add("User " + i);
        }
        return userNameList;
    }

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
            verify(statisticsMock, times(1)).postsCount();
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
            verify(statisticsMock, times(1)).postsCount();
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
            verify(statisticsMock, times(1)).commentsCount();
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
            verify(statisticsMock, times(1)).commentsCount();
            verify(statisticsMock, times(1)).postsCount();
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
            verify(statisticsMock, times(1)).commentsCount();
            verify(statisticsMock, times(1)).postsCount();
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
            when(statisticsMock.usersNames()).thenReturn(createUserNameList(0));

            //When
            List<String> listOf0 = forumStatistics.usersNames();

            //Then
            assertEquals(0, listOf0.size());
            verify(statisticsMock, times(1)).usersNames();
        }
        @DisplayName("100 users")
        @Test
        void test100Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(createUserNameList(100));

            //When
            List<String> listOf100 = forumStatistics.usersNames();

            //Then
            assertEquals(100, listOf100.size());
            verify(statisticsMock, times(1)).usersNames();
        }
    }
}