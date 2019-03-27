import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(int capacity) {
        this.bookStock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookStockCount() {
        return this.bookStock.size();
    }

    public void addBook (Book book) {
        this.bookStock.add(book);
    }

    public boolean stockCountCheck() {
        if (this.capacity <= getBookStockCount()) {
            return false;
        }
        return true;
    }

    public void addBookWithCheck(Book book) {
        if (stockCountCheck()) {
            addBook(book);
        }
    }

    public Book lendBook(String title) {
        for (int i = 0; i < getBookStockCount(); i++) {
            if (this.bookStock.get(i).getTitle().compareTo(title) == 0) {
                return this.bookStock.remove(i);
            }
        }
        return null;
    }
}
