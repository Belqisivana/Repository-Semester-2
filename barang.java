public class barang {
    String nama;
    int stok;
    double harga;

    public barang(String nama, int stok, double harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public void infoBarang() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println();
    }
}
