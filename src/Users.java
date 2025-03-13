public class Users {
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


    public String getId() {
        return id;
    }
}
