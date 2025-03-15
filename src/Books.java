import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Books {
    private final Map<String, Integer> Books;

    public Books() {
        Books = new HashMap<>();
    }

    public void addBooks(String bookName, int count) {
        Books.merge(bookName, count, Integer::sum);
        System.out.println("Book " + bookName + " has been successfully added to the library book Count " + Books.get(bookName));
    }

    public boolean removeBooks(String bookName, int count) {
        if (!Books.containsKey(bookName)) {
            System.out.println("Book " + bookName + " does not exist in the library book");
            return false;
        }

        Books.merge(bookName, -count, Integer::sum);

        if (Books.get(bookName) <= 0) {
            Books.remove(bookName);
            System.out.println("Book " + bookName + " has been successfully removed from the library book");
        } else System.out.println("Book " + bookName + " has been successfully updated. Remaining count: " + Books.get(bookName));
        return true;
    }

    public void setBooks(String bookName, int count) {
        if (checkBooks(bookName)) {
            Books.put(bookName, count);
            System.out.println("Book " + bookName + " has been updated");
        }
    }

    public void deleteBooks(String bookName) {
        if (checkBooks(bookName)) {
            Books.remove(bookName);
            System.out.println("Book " + bookName + " has been deleted");
        }
    }

    public boolean checkBooks(String bookName) {
        if (Books.containsKey(bookName))
            return true;
        System.out.println("Book " + bookName + " Not found");
        return false;
    }

    public Map<String, Integer> getBooks() {
        return Collections.unmodifiableMap(Books);
    }
}


