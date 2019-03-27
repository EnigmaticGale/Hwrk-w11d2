import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before () {
        library = new Library(2);
        book1 = new Book("AAA","AA","A");
        book2 = new Book("BBB","BB","B");
        book3 = new Book("CCC","CC","C");
    }

    @Test
    public void canGetBookStockCount() {
        assertEquals(0 , library.getBookStockCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1,library.getBookStockCount());
    }

    @Test
    public void capacityCheckTrue () {
        assertEquals(true, library.stockCountCheck());
    }

    @Test
    public void capacityCheckFalse () {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(false, library.stockCountCheck());
    }

    @Test
    public void canAddBookWithCheckTrue () {
        library.addBookWithCheck(book1);
        assertEquals(1,library.getBookStockCount());
    }

    @Test
    public void canAddBookWithCheckFalse () {
        library.addBookWithCheck(book1);
        library.addBookWithCheck(book2);
        library.addBookWithCheck(book3);

        assertEquals(2,library.getBookStockCount());
    }

    @Test
    public void canRemovedSearchedBookTrue () {
        library.addBookWithCheck(book1);
        library.addBookWithCheck(book2);
        library.addBookWithCheck(book3);

        library.lendBook("AAA");
        assertEquals(2, library.getBookStockCount());
    }

    @Test
    public void canREmovedSerachedBookFalse () {
        library.addBookWithCheck(book1);
        library.addBookWithCheck(book2);
        library.addBookWithCheck(book3);
        library.lendBook("hfadsjkfa");
        assertEquals(3, library.getBookStockCount());
    }

    @Test
    public void x () {
        library.addBookWithCheck(book1);
        assertEquals(false, library.testest());
    }
}
