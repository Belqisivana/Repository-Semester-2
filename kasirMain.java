import java.util.Scanner;

public class kasirMain {
    public static void main(String[] args) {
        Kasir[] daftarKasir = {
                new Kasir("renald", "Renald123"),
                new Kasir("belqis", "Belqis123"),
                new Kasir("aqila", "Aqila123")
        };

        Scanner sc = new Scanner(System.in);
        boolean berhasilLogin;

        do {
            berhasilLogin = false;
            System.out.println("Masukkan username: ");
            String masukkanUsername = sc.next();
            System.out.println("Masukkan password: ");
            String masukkanPassword = sc.next();

            for (Kasir kasir : daftarKasir) {
                if (masukkanUsername.equals(kasir.getUsername()) && masukkanPassword.equals(kasir.getPassword())) {
                    System.out.println("Selamat datang, " + kasir.getUsername() + "!");
                    berhasilLogin = true;
                    break;
                }
            
            }
        } while (!berhasilLogin);
        System.out.println("Username atau password salah! Silakan coba lagi.");

        sc.close();
    }
}