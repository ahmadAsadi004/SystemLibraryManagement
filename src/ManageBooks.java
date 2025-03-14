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
        if (isBookInLibrary(bookName)) {
            int currentCount = BookMap.get(bookName);
            if (currentCount - bookCount > 0) {
                BookMap.put(bookName, currentCount - bookCount);
                return true;
            } else System.out.println("Book " + bookName + " Unavailable");
        }
        return false;
    }

    public static void updateLibraryBook(String bookName, int bookCount) {
        if (isBookInLibrary(bookName)) {
            BookMap.put(bookName, bookCount);
            System.out.println("Book " + bookName + " has been updated");
        }
    }

    public static void deleteLibraryBook(String bookName, int bookCount) {
        if (isBookInLibrary(bookName)) {
            BookMap.remove(bookName);
            System.out.println("Book " + bookName + " has been deleted");
        }
    }

    public static void addBookToUser(String id, String bookName, int bookCount) {
        if (isBookInLibrary(bookName)) {
            boolean isRemovedFromLibrary = removeLibraryBook(bookName, bookCount);
            if (isRemovedFromLibrary) {
                try {
                    var user = ManageUsers.getUser(id);
                    user.addBook(bookName, bookCount);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void removeBookFromUser(String id, String bookName, int bookCount) {
        if (isBookInLibrary(bookName)) {
            try {
                var user = ManageUsers.getUser(id);
                boolean isRemovedFromUser = user.removeBook(bookName, bookCount);
                if (isRemovedFromUser) {
                    addLibraryBook(bookName, bookCount);
                    System.out.println("Book " + bookName + " has been deleted From the User " + user.getName());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean isBookInLibrary(String bookName) {
        if (BookMap.containsKey(bookName))
            return true;
        System.out.println("Book " + bookName + " Not found");
        return false;
    }
}
