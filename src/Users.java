import java.util.*;

public class Users {
    private String name;
    private final int joinTime;
    private int age;
    private String gender;
    private final String id;

    private Map<String, Integer> books = new HashMap<>();

    private static int Count;

    public Users(String name, int age, String gender, int joinTime, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.joinTime = joinTime;
        this.id = id;

        Count++;
    }

    public void addBook(String bookName, int amount) {
        if (books.containsKey(bookName)) {
            books.put(bookName, books.get(bookName) + amount);
            System.out.println("Book " + bookName + " has been added");
        } else System.out.println("Book " + bookName + " is not added");
    }

    public boolean removeBook(String book, int amount) {
        if (books.containsKey(book)) {
            if (books.get(book) >= amount) {
                books.put(book, books.get(book) - amount);
                System.out.println("Book " + book + " has been removed");
                return true;
            } else System.out.println("Book " + book + " is not removed");
        } else System.out.println("Book " + book + " is not found");
        return false;
    }

    public void deptBook(String book) {
        if (books.containsKey(book))
            System.out.println("Book " + book + " is already booked");
        else System.out.println("Book " + book + " is not already booked");
    }

    public Map<String, Integer> getBooks() {
        return Collections.unmodifiableMap(books);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return joinTime == users.joinTime && age == users.age && Objects.equals(name, users.name) && Objects.equals(gender, users.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, joinTime, age, gender);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
