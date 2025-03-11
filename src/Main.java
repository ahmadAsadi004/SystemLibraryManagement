public class Main {
    public static void main(String[] args) {
        var User1 = new Users(
                "Ahmad",
                21,
                "male",
                "ahmad@gmail.com",
                "09152567092",
                "Behzisti",
                1402
        );

        var User2 = new Users(
                "Mmd",
                21,
                "male",
                "ahmad@gmail.com",
                "09152567092",
                "Behzisti",
                1402
        );

        System.out.println(User1.getId());
        System.out.println(User2.getId());
    }
}