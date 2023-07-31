package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;

import java.util.Arrays;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> books) {
        if (books.size() == 0) return 0;
        int[] years = new int[books.size()];
        int n = 0;
        for (Book book : books) {
            years[n] = book.getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        return years[years.length / 2];
    }
}
