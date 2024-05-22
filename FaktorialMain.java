package minggu5;

import java.util.Scanner;

public class FaktorialMain{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin anda hitung: ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            int hasilBF = fk[i].faktorialBF(fk[i].nilai);
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilBF);
            System.out.println("Jumlah iterasi dengan Brute Force adalah: " + fk[i].iterasiBF);
        }
        System.out.println("========================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            int hasilDC = fk[i].faktorialDC(fk[i].nilai);
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilDC);
            System.out.println("Jumlah iterasi dengan Divide and Conquer adalah: " + fk[i].iterasiDC);
        }

        System.out.println("=========================================================");
    } 
}
