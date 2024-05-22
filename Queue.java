public class Queue {
    Pasien[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Pasien[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pasien dt) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = dt;
            size++;
            System.out.println("Pasien " + dt.nama + " telah ditambahkan ke dalam antrian.");
        } else {
            System.out.println("Antrian penuh, tidak dapat menambahkan pasien baru.");
        }
    }

    public Pasien dequeue() {
        if (!isEmpty()) {
            Pasien temp = antrian[front];
            front = (front + 1) % max;
            size--;
            System.out.println("\nPasien " + temp.nama + " telah dipanggil dan bukan antrian.");
            return temp;
        } else {
            System.out.println("Antrian kosong.");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("\nPasien di Antrian:");
            for (int i = 0; i < size; i++) {
                System.out.println(antrian[(front + i) % max]);
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("\nPasien yang dipanggil: \n" + antrian[front]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("\nPasien di antrian terakhir: \n" + antrian[rear]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (antrian[(front + i) % max].nama.equals(nama)) {
                    System.out.println("\nPasien " + nama + " berada di posisi antrian ke-" + (i + 1));
                    return;
                }
            }
            System.out.println("\nPasien dengan nama " + nama + " tidak ditemukan dalam antrian.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void daftarPasien() {
        if (!isEmpty()) {
            System.out.println("\nDaftar Pasien di Antrian:");
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + antrian[(front + i) % max].nama);
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}
