public class Users {
    private String name;
    private int joinTime;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private final String id;

    private static int Count;

    public Users(String name, int age, String gender, String email, String phone, String address, int joinTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.joinTime = joinTime;
        this.id = ManageID.CreateID(this.joinTime);

        Count++;
    }


    public String getId() {
        return id;
    }
}
