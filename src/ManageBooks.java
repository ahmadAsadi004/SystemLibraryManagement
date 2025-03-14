import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageBooks {

    private static Map<String, Integer> BookMap = new HashMap<>();

    public static void addLibraryBook(String bookName, int bookCount) {
        if (BookMap.containsKey(bookName)) {
            int currentCount = BookMap.get(bookName);
            BookMap.put(bookName, currentCount + bookCount);
            System.out.println("Book " + bookName + " has been successfully added to the library book Count " + bookCount);
        } else {
            BookMap.put(bookName, bookCount);
            System.out.println("Book " + bookName + " has been successfully added to the library book");
        }
    }

    public static Boolean removeLibraryBook(String bookName, int bookCount) {
        if (BookMap.containsKey(bookName)) {
            int currentCount = BookMap.get(bookName);
            if (currentCount - bookCount > 0) {
                BookMap.put(bookName, currentCount - bookCount);
                return true;
            } else System.out.println("Book " + bookName + " Unavailable");
        } else System.out.println("Book " + bookName + " Not found");
        return false;
    }

    public static void updateLibraryBook(String bookName, int bookCount) {
        if (BookMap.containsKey(bookName)) {
            BookMap.put(bookName, bookCount);
            System.out.println("Book " + bookName + " has been updated");
        } else System.out.println("Book " + bookName + " Not found");
    }

    public static void deleteLibraryBook(String bookName, int bookCount) {
        if (BookMap.containsKey(bookName)) {
            BookMap.remove(bookName);
            System.out.println("Book " + bookName + " has been deleted");
        } else System.out.println("Book " + bookName + " Not found");
    }

    public static void addBookToUser(String id, String bookName, int bookCount) {
        if (BookMap.containsKey(bookName)) {
            var user = ManageUsers.getUser(id);
            boolean isOk = removeLibraryBook(bookName, bookCount);
            if (isOk) {
                assert user != null;
                user.addBook(bookName, bookCount);
            }
        }
    }

}
