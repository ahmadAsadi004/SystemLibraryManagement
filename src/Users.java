import java.util.*;

public class Users extends Books {
    private String name;
    private final int joinTime;
    private int age;
    private String gender;
    private final String id;

    private static int Count;

    public Users(String name, int age, String gender, int joinTime, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.joinTime = joinTime;
        this.id = id;

        Count++;
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
