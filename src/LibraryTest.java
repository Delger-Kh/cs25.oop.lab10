public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Сүүн Зам", 2020);
        library.addBook("Түүх", 1995);

        Library.BookShelf recentBooks = library.getRecentBooks(2000);

        for (Book book : recentBooks) {
            System.out.println(book);
        }
    }
}
