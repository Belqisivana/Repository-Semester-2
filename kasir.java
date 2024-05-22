import java.util.Scanner;

class Kasir {
    String username;
    String password;

    public Kasir(String user, String pass) {
        username = user;
        password = pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

