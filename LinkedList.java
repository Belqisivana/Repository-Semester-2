public class LinkedList {
    Node head;

    public boolean isEmpty(){
        return (head == null);
    }
    public void print(){
        if(!isEmpty()){
            System.out.print("Isi linked list: ");
            Node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong.");
        }
    }
    public void addFirst(int input){
        Node newNode = new Node(input, null);

        if(isEmpty()){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int input){
        Node newNode = new Node(input, null);

        if(isEmpty()){
            head = newNode;
        } else{
            Node currentNode = head;

            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void insertAfter(int key, int input){
        Node newNode = new Node(input, null);

        if(!isEmpty()){
            Node currentNode = head;

            do{
                if(currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
            } while (currentNode != null);
        } else {
            System.out.println("Linked list kosong.");
        }
    }
    public void insertAt(int index, int key){
        if(index < 0){
            System.out.println("Index di luar batas");
            return;
        }
        Node newNode = new Node(key, null); // Buat node baru dengan data key

        if(isEmpty()){
            if (index != 0){
                System.out.println("Index di luar batas");
                return;
            }
        } else{
            head = newNode;
            return; 
        }
    
    if(index == 0){
        newNode.next = head;
        head = newNode;
        return;
    }
    Node current = head;

    for(int i = 0; i < index - 1; i++){ // untuk travers
        if(current.next == null){
            System.out.println("Index diluar batas");
            return;
        }
        current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;
  }

    public int getData(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
    
        if (currentNode == null) {
            System.out.println("Index di luar batas");
            return -1;
        } else {
            return currentNode.data;
        }
    }
 public int indexOf(int key){
    Node currentNode = head;
    int index = 0;

    while( currentNode != null && currentNode.data != key){
        currentNode = currentNode.next;
        index++;
    }
    if (currentNode == null){
        return -1;
    } else{
        return index;
    }
 }
 public void removeFirst(){
    if(!isEmpty()){
        head = head.next;
    } else{
        System.out.println("Linked list kosong.");
    }
 }
 public void removeLast(){
    if(isEmpty()){
        System.out.println("Linked list kosong.");
    } else if( head.next == null){
        head = null;
    } else{
        Node currentNode = head;

        while(currentNode.next != null){
            if(currentNode.next.next == null){
                currentNode.next = null;
                break;
            }
            currentNode = currentNode.next;
        }
    }
 }
 public void remove(int key){
    if (isEmpty()){
        System.out.println("Linked list kosong.");
    }else if (head.data == key){
        removeFirst();
    } else {
        Node currentNode = head;

        while (currentNode.next != null){
            if(currentNode.next.data == key){
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
    }
 }
 public void insertBefore(int key, int input) {
    Node newNode = new Node(input, null);

    if (!isEmpty()) {
        if (head.data == key) { // Jika key berada di awal linked list
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.data == key) { // Jika key ditemukan
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

        System.out.println("Key tidak ditemukan dalam linked list.");
    } else {
        System.out.println("Linked list kosong.");
    }
}
public void removeAt(int index) {
    if (index < 0) {
        System.out.println("Index di luar batas");
        return;
    }

    if (isEmpty()) {
        System.out.println("Linked list kosong.");
        return;
    }

    if (index == 0) {
        head = head.next;
        return;
    }

    Node current = head;

    for (int i = 0; i < index - 1; i++) {
        if (current.next == null) {
            System.out.println("Index di luar batas");
            return;
        }
        current = current.next;
    }

    if (current.next == null) {
        System.out.println("Index di luar batas");
        return;
    }

    current.next = current.next.next;
}

}