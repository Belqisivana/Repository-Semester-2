import java.util.Scanner;

public class barangMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa jumlah barang yang akan dimasukkan?: ");
        int jumlahBarang = sc.nextInt();
        sc.nextLine(); 

        barang[] daftarBarang = new barang[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Masukkan data barang ke-" + (i + 1));
            System.out.print("Nama Barang: ");
            String namaBarang = sc.nextLine();
            System.out.print("Stok: ");
            int stokBarang = sc.nextInt();
            System.out.print("Harga: ");
            double hargaBarang = sc.nextDouble();
            sc.nextLine(); 

            daftarBarang[i] = new barang(namaBarang, stokBarang, hargaBarang);
        }

        System.out.println("\nDaftar Barang:");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Barang ke-" + (i + 1));
            daftarBarang[i].infoBarang();
        }

        sc.close();
    }
}
