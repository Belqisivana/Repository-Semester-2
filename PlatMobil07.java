 public class PlatMobil07 {

            public static void main(String[] args) {
                // Array satu dimensi untuk kode plat mobil
                char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
                // Array dua dimensi untuk nama kota
                char[][] KOTA = {
                    {'B', 'A', 'N', 'T', 'E','N'},
                    {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                    {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                    {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                    {'B', 'O', 'G', 'O', 'R'},
                    {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                    {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                    {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                    {'M', 'A', 'L', 'A', 'N', 'G'},
                    {'T', 'E', 'G', 'A', 'L'}
                };
        
                // Menampilkan isi array
                for (int i = 0; i < KODE.length; i++) {
                    System.out.printf("%c: ", KODE[i]);
                    for (int j = 0; j < KOTA[i].length; j++) {
                        System.out.print(KOTA[i][j]);
                    }
                    System.out.println();
                }
              // Menampilkan input nama kota berdasarkan kode plat
        char kodePlat = 'B'; // Ganti 'B' dengan input dari pengguna
        String kota = platMobil.get(kodePlat);
        if (kota != null) {
            System.out.println("Nama kota untuk plat nomor " + kodePlat + " adalah: " + kota);
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }
    }
}
