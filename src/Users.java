import java.util.*;

public class Users {
    private String name;
    private final int joinTime;
    private int age;
    private String gender;
    private final String id;

    private List<String> books = new ArrayList<>();

    private static int Count;

    public Users(String name, int age, String gender, int joinTime, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.joinTime = joinTime;
        this.id = id;

        Count++;
    }

    public void addBook(String book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println("Book added: " + book);
        } else System.out.println("Book already added");
    }

    public void removeBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book removed: " + book);
        } else System.out.println("Book not removed");
    }

    public void deptBook(String book) {
        if (books.contains(book))
            System.out.println("Book " + book + " is already booked");
        else System.out.println("Book " + book + " is not already booked");
    }

    public List<String> getBooks() {
        return Collections.unmodifiableList(books);
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
}
