public class SLLMain28 {
    public static void main(String[] args) {
        LinkedList28 myLinkedList = new LinkedList28();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700,300);
        myLinkedList.print();

        //demo 
        myLinkedList.insertAfter(800, 200);
        myLinkedList.print();
        myLinkedList.addFirst(120);
        myLinkedList.print();
        myLinkedList.addLast(1000);
        myLinkedList.print();
        System.out.println();
        
        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        System.out.println("Data 300 berada pada index ke: " +myLinkedList.indexOf(300));
        
        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
        
        // System.out.println("Tambahkan Data: ");
        // myLinkedList.print();
        myLinkedList.addLast(10);
        myLinkedList.addLast(25);
        myLinkedList.addLast(30);
        int key = 20;
        int newData = 25;
        myLinkedList.InsertAt(key, newData);
        myLinkedList.print();
        
        
        myLinkedList.insertBefore(30, 25);
        System.out.println("\nLinked list setelah menambahkan node sebelum 30:");
        myLinkedList.print();
        
        myLinkedList.removeAt(3);
        System.out.println("\nLinked list setelah menghapus node pada index 3:");
        myLinkedList.print();


    }
    }
    