
public class ManageBooks {

    private static final Books libraryBooks = new Books();

    public static void addLibraryBook(String bookName, int bookCount) {
        libraryBooks.addBooks(bookName, bookCount);
    }

    public static Boolean removeLibraryBook(String bookName, int bookCount) {
        return libraryBooks.removeBooks(bookName, bookCount);
    }

    public static void updateLibraryBook(String bookName, int bookCount) {
        libraryBooks.setBooks(bookName, bookCount);
    }

    public static void deleteLibraryBook(String bookName) {
        libraryBooks.deleteBooks(bookName);
    }

    public static void addBookToUser(String id, String bookName, int bookCount) {
        if (libraryBooks.checkBooks(bookName)) {
            boolean isRemovedFromLibrary = removeLibraryBook(bookName, bookCount);
            if (isRemovedFromLibrary) {
                try {
                    var user = ManageUsers.getUser(id);
                    user.addBooks(bookName, bookCount);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void removeBookFromUser(String id, String bookName, int bookCount) {
        if (libraryBooks.checkBooks(bookName)) {
            try {
                var user = ManageUsers.getUser(id);
                boolean isRemovedFromUser = user.removeBooks(bookName, bookCount);
                if (isRemovedFromUser) {
                    addLibraryBook(bookName, bookCount);
                    System.out.println("Book " + bookName + " has been deleted From the User " + user.getName());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
