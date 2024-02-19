public class Sepeda {
    float kecepatan;
    int gear;

    public void tambahKecepatan(float increment) {
        kecepatan += increment;
    }

    public void kurangiKecepatan(float decrement) {
       if(kecepatan - decrement >= 0){
         kecepatan -= decrement;
       } else {
        kecepatan = 0; 
       }
    }

    public void cetakInfo() {
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("======================");
    }
}