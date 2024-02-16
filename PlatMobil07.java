import java.util.Scanner;

public class PlatMobil07 {

    public static void main(String[] args) {
        // Array satu dimensi untuk kode plat mobil
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        // Array dua dimensi untuk nama kota
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        // Membuat objek Scanner
        Scanner sc = new Scanner(System.in);

        // Meminta input
        System.out.print("Masukkan kode plat mobil: ");
        char kodePlat = sc.next().charAt(0);

        // Menampilkan nama kota berdasarkan kode plat
        String kota = getNamaKota(KODE, KOTA, kodePlat);
        if (kota != null) {
            System.out.println("Nama kota untuk plat nomor " + kodePlat + " adalah: " + kota);
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }

        // Menutup objek Scanner
        sc.close();
    }

    // Fungsi untuk mendapatkan nama kota berdasarkan kode
    public static String getNamaKota(char[] kode, char[][] kota, char kodePlat) {
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == kodePlat) {
                String namaKota = "";
                for (int j = 0; j < kota[i].length; j++) {
                    namaKota += kota[i][j];
                }
                return namaKota;
            }
        }
        return null;
    }
}
