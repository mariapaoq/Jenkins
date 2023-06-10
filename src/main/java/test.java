public class test {
    public static void main(String[] args) {
        String password = "password";
        System.out.println(password);
        String username = "admin";
        String sql = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";

    }
}