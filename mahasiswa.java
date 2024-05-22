public class mahasiswa {
    int nim;
    String jenisKelamin;
    String nama;
    double ipk;
    
    public mahasiswa() {
    }
    
    public mahasiswa(int NIM, String Nama, double IPK, String jk) {
        nim = NIM;
        nama = Nama;
        ipk = IPK;
        jenisKelamin = jk;
    }
    
    public void infoMahasiswa(int i) {
        System.out.println("Mahasiswa ke-" + (i + 1));
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}