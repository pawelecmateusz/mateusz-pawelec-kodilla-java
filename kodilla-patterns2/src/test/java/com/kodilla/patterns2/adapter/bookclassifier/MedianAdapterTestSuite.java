package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author1", "Title1", 1960, "123"));
        books.add(new Book("Author2", "Title2", 1965, "456"));
        books.add(new Book("Author3", "Title3", 1980, "789"));
        books.add(new Book("Author4", "Title4", 1983, "1234"));
        books.add(new Book("Author5", "Title5", 1992, "5678"));

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(1980, result);
    }
}