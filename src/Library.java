import java.util.*;

class Book {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + ": " + year;
    }
}

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, int year) {
        books.add(new Book(title, year));
    }

    public BookShelf getRecentBooks(int minYear) {
        return new BookShelf(minYear, books);
    }

    public static class BookShelf implements Iterable<Book> {
        private int minYear;
        private List<Book> books;

        public BookShelf(int minYear, List<Book> books) {
            this.minYear = minYear;
            this.books = books;
        }

        @Override
        public Iterator<Book> iterator() {
            return books.stream()
                    .filter(book -> book.getYear() > minYear)
                    .iterator();
        }
    }
}
