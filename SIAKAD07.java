import java.util.Scanner;

public class SIAKAD07{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan nama mata kuliah
        String[] namaMK = {
            "PAMB",
            "Critical Thinking dan Problem Solving",
            "Bahasa Indonesia",
            "Agama",
            "Praktikum Dasar Pemrograman",
            "Matematika Dasar",
            "Bahasa Inggris Dasar",
            "Dasar Pemrograman",
            "Konsep Teknologi Informasi"
        };

        // Array untuk menyimpan nilai angka
        int[] nilaiAngka = new int[namaMK.length];

        // Memasukkan nilai
        System.out.println("==================================");
        System.out.println("==Program Menghitung IP Semester==");
        System.out.println("==================================");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("Masukkan nilai angka untuk MK %s: ", namaMK[i]);
            nilaiAngka[i] = scanner.nextInt();
        }

        // Menghitung nilai huruf dan bobot nilai
        String[] nilaiHuruf = new String[namaMK.length];
        double[] bobotNilai = new double[namaMK.length];
        for (int i = 0; i < namaMK.length; i++) {
            if (nilaiAngka[i] >= 85) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A-";
                bobotNilai[i] = 3.75;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B-";
                bobotNilai[i] = 2.75;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 55) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C-";
                bobotNilai[i] = 1.75;
            } else {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            }
        }

        // Menghitung IP semester
        double ipSemester = 0.0;
        for (int i = 0; i < namaMK.length; i++) {
            ipSemester += bobotNilai[i];
        }
        ipSemester /= namaMK.length;

        // Menampilkan hasil
        System.out.println("=======================");
        System.out.println();
        System.out.println("Hasil Konversi Nilai");
        System.out.println();
        System.out.println("=======================");
        System.out.printf("| %-50s | %-10s | %-10s | %-10s |\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("| %-50s | %10d | %10s | %10.2f |\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("======================");
        System.out.println();
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
}

    