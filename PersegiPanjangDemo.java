import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        int panjang, lebar; 
        // Memasukkan panjang array
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();
        // Memasukkan data persegi panjang
        for(int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt(); 
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            // Instansiasi objek menggunakan constructor berparameter
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }  

        // Menampilkan data persegi panjang
        for(int i = 0; i < jumlahPersegiPanjang; i++) {
        System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: "
        + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
        System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        } 

    }
}


