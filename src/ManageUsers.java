import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ManageUsers {
    private static Map<String, Users> users = new HashMap<>();

    public static void addUser(String name, int age, String gender, int joinTime) {
        String id = ManageID.CreateID(joinTime);
        var newUser = new Users(name, age, gender, joinTime, id);
        boolean exists = users.values().stream().anyMatch(user -> user.equals(newUser));
        if (!exists) {
            users.put(id, newUser);
            System.out.println("User " + name + " has been created");
        } else System.out.println("User " + name + " already exists");
    }

    public static Users searchUser(String id) {
        if (users.containsKey(id))
            return users.get(id);
        System.out.println("User " + id + " does not exist");
        return null;
    }

    public static void removeUser(String id) {
        if (users.containsKey(id)) {
            users.remove(id);
            System.out.println("User " + id + " removed");
        } else System.out.println("User " + id + " does not exist");
    }

    public static Users getUser(String id) {
        return users.get(id);
    }
}
