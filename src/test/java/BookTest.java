import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before () {
        book1 = new Book("AAA","AA","A");
        book2 = new Book("BBB","BB","B");
        book3 = new Book("CCC","CC","C");
    }

    @Test
    public void canGetBookInfo () {
        assertEquals("AAA", book1.getTitle());
        assertEquals("AA", book1.getAuthor());
        assertEquals("A", book1.getGenre());
    }
}
