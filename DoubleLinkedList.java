public class DoubleLinkedList {
        Node head;
        Node tail;

        DoubleLinkedList(){
            this.head = null;
            this.tail = null;
        }
        void append(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        void printReverse(){
            Node currentNode = tail;
            if(currentNode == null){
                System.out.println("List is empty");
                return;
            }
            while(currentNode != null){
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.prev;
            }
            System.out.println("\nEnd of list");
        
        }
       
    }
