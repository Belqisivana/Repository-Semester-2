import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mahasiswa[] arrayMahasiswa = new mahasiswa[3];
        double totalIPK = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.println("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.println("Masukkan NIM: ");
            int nim = Integer.parseInt(sc.nextLine());
            System.out.println("Masukkan jenis kelamin: ");
            String jenisKelamin = sc.nextLine();
            System.out.println("Masukkan IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            arrayMahasiswa[i] = new mahasiswa(nim, nama, ipk, jenisKelamin);
            totalIPK += ipk;
        }
        System.out.println();
        int index = 0;
        for (mahasiswa mhs : arrayMahasiswa) {
            mhs.infoMahasiswa(index);
            index++;
        }
        if (arrayMahasiswa.length != 0) {
            double rata2 = totalIPK / arrayMahasiswa.length;
            System.out.println("Rata-rata IPK: " + rata2);
        }
        System.out.println();
    }
}
