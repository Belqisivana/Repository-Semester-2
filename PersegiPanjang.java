public class PersegiPanjang {
   public int panjang;
   public int lebar;

   // Constructor dengan parameter
   public PersegiPanjang(int p, int l) {
       panjang = p;
       lebar = l;
   }

   // Method untuk mencetak informasi persegi panjang
   public void cetakInfo() {
       System.out.println("Panjang: " + panjang + ", Lebar: " + lebar);
   }

   // Method untuk menghitung luas persegi panjang
   public int hitungLuas() {
       return panjang * lebar;
   }

   // Method untuk menghitung keliling persegi panjang
   public int hitungKeliling() {
       return 2 * (panjang + lebar);
   }
}
