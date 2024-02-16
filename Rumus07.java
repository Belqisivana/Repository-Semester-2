import java.util.Scanner;

public class Rumus07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("a. Menghitung hasil perhitungan Kecepatan");
            System.out.println("b. Menghitung hasil perhitungan Jarak");
            System.out.println("c. Menghitung hasil perhitungan Waktu");
            System.out.println("d. Exit");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.next().charAt(0);

            switch (pilihan) {
                case 'a':
                    hitungKecepatan();
                    break;
                case 'b':
                    hitungJarak();
                    break;
                case 'c':
                    hitungWaktu();
                    break;
                case 'd':
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        } while (pilihan != 'd');

        scanner.close();
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v): " + kecepatan);
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s): " + jarak);
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t): " + waktu);
    }
}
