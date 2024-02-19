public class SepedaMain{
    public static void main(String[] args) {
        Sepeda  sepeda1 = new Sepeda();
        sepeda1.kecepatan = 5;
        sepeda1.gear = 1;
        sepeda1.tambahKecepatan(3);
        sepeda1.cetakInfo();

        Sepeda sepeda2 = new Sepeda();
        sepeda2.cetakInfo();
    }
}