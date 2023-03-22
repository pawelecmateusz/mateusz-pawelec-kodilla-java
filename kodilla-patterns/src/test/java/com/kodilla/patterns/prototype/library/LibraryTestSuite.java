package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Books");
        //When
        library.getBooks().add(new Book("A book", "A guy", LocalDate.of(1970, 1, 1)));
        library.getBooks().add(new Book("The book", "The guy", LocalDate.of(1980, 1, 1)));
        library.getBooks().add(new Book("Some book", "Some guy", LocalDate.of(1990, 1, 1)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Then
        System.out.println(library.getName() + library.getBooks());
        System.out.println(clonedLibrary.getName() + clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName() + deepClonedLibrary.getBooks());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}