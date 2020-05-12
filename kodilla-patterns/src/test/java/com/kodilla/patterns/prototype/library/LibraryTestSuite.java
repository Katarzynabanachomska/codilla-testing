package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks () throws CloneNotSupportedException {
        //Given
        Library library = new Library("My library");
        Book book1 = new Book("Gwiazd naszych wina", "Jonh Green", LocalDate.of(2012, 01, 01));
        Book book2 = new Book("Chłopiec w pasiastej piżamie", "John Boyne", LocalDate.of(2006, 01, 01));
        Book book3 = new Book("Opowieść Podręcznej", "Margaret Atwood", LocalDate.of(1985, 01, 01));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        shallowClonedLibrary = library.shallowCopy();
        shallowClonedLibrary.setName("Your shallow library");

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Your deep library");

        //When
        library.getBooks().add(new Book("Cierpienia młodego Wertera","Johan Wolfgang von Goethe", LocalDate.of(1774,01,01)));

        //Then
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}

