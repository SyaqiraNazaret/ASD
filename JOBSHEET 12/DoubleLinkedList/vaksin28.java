public class vaksin28 {
    Node head, tail;
    int size;

    public vaksin28() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void add(String nama, int nomor) {
        Node newNode = new Node(nama, nomor);
        if(head == null) {
            head = newNode;
            tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
            System.out.println("==========================================");
            System.out.println(nama + " Telah ditambahkan dalam antrian " + nomor);
        }
        public void remove() {
            if (head == null) {
                System.out.println("Antrian Kosong ^_^");
                System.out.println();
            } else {
                Node tmp = head;
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail =  null;
                }
                size--;
                System.out.println(tmp.nama + " Sudah divaksinasi");
            }
        }
        public void print() {
            if (head == null) {
                System.out.println("Antrian Kosong ^_^");
                System.out.println();
            } else {
                Node current =  head;
                System.out.println("+++++++++++++++");
                System.out.println("Daftar Antrian");
                System.out.println("+++++++++++++++");
                System.out.println("|No\t|Nama\t|");
                while (current != null) {
                    System.out.println("|" + current.nomor + "\t|" + current.nama + "\t|");
                    current = current.next;
                }
            }
            System.out.println("Sisa antrian: " +size);
            System.out.println();
        }
}
    

