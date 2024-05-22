import java.util.ArrayList;
import java.util.List;

public class linkedList {

    private List<Integer> list;

    public linkedList() {
        list = new ArrayList<>();
    }

    public void insertAt(int index, int key) {
        if (index < 0 || index > list.size()) {
            System.out.println("Index di luar batas");
            return;
        }
        list.add(index, key);  // ArrayList handles shifting elements
        System.out.println(list);
    }

    public void removeAt(int index) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Index di luar batas");
            return;
        }
        list.remove(index);  // ArrayList handles shifting elements
        System.out.println(list);
    }

    public static void main(String[] args) {
        linkedList lm = new linkedList();
        lm.insertAt(0, 10); // Menambahkan 10 di index 0
        lm.insertAt(1, 20); // Menambahkan 20 di index 1
        lm.insertAt(2, 30); // Menambahkan 30 di index 2
        lm.removeAt(1);     // Menghapus elemen di index 1 (20 akan dihapus)
    }
}