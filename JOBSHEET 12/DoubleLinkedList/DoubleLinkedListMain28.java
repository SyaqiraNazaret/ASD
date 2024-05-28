public class DoubleLinkedListMain28 {
    public static void main(String[] args) throws Exception {
    DoubleLinkedList28 dll = new DoubleLinkedList28();
    //percobaan 1
    dll.print();
    System.out.println("Size : "+dll.size());
    System.out.println("===========================");
    dll.addFirst(3);
    dll.addLast(4);
    dll.addFirst(7);
    dll.print();
    System.out.println("Size : "+dll.size());
    System.out.println("===========================");
    dll.add(40,1);
    dll.print();
    System.out.println("Size : "+dll.size());
    System.out.println("===========================");
    dll.clear();
    dll.print();
    System.out.println("Size : "+dll.size());
    
    //percobaan 2
    // dll.addLast(50);
    // dll.addLast(40);
    // dll.addLast(10);
    // dll.addLast(20);
    // dll.print();
    // System.out.println("Size : "+dll.size());
    // System.out.println("===========================");
    // dll.removeFirst();
    // dll.print();
    // System.out.println("Size : " +dll.size());
    // System.out.println("===========================");
    // dll.removeLast();
    // dll.print();
    // System.out.println("Size : "+dll.size());
    // System.out.println("===========================");
    // dll.remove(1);
    // dll.print();
    // System.out.println("Size : "+dll.size());

    //percobaan 3
    System.out.println("Data awal pada Linked List adalah: " + dll.getFirst());
    System.out.println("Data akhir pada Linked List adalah: " + dll.getLast());
    System.out.println("Data indekx ke-1 pada Linked List adalah: "+dll.get(1));
    
    }
}
    