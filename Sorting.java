public class Sorting {
    public static void main(String[] args) {
        int[] sortedNilaiAsc = {5, 10, 15, 20, 25, 30, 35};
        int[] sortedNilaiDesc = {50, 40, 30, 20, 10, 5};

        int indexAsc = binarySearch(sortedNilaiAsc, 25);
        if (indexAsc != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + indexAsc + " (ascending)");
        } else {
            System.out.println("Data tidak ditemukan (ascending)");
        }

        int indexDesc = binarySearch(sortedNilaiDesc, 25);
        if (indexDesc != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + indexDesc + " (descending)");
        } else {
            System.out.println("Data tidak ditemukan (descending)");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        if (arr[0] < arr[arr.length - 1]) { // Ascending order
            return binarySearchAsc(arr, key);
        } else { // Descending order
            return binarySearchDesc(arr, key);
        }
    }

    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
