public class LinkedList28 {
    Node28 head;

    public boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty ()) {
            System.out.print("Isi Linked List: ");
            Node28 currentNode28 = head;

            while (currentNode28 != null) {
                System.out.print(currentNode28.data + "\t");
                currentNode28 = currentNode28.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    public void addFirst(int input) {
        Node28 newNode = new Node28(input, null);
        if (isEmpty()){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int input){
        Node28 newNode = new Node28(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            Node28 currentNode28 = head;

            while (currentNode28.next != null) {
                currentNode28 = currentNode28.next;
            }
            currentNode28.next = newNode;
        }
    }
    public void insertAfter(int key, int input) {
        Node28 newNode = new Node28(input, null);
        if (!isEmpty()){
            Node28 currentNode28 = head;

            do {
                if (currentNode28.data == key) {
                    newNode.next = currentNode28.next;
                    currentNode28.next = newNode;
                    break;
                }
                currentNode28 = currentNode28.next;
            } while (currentNode28 != null);
        } else {
            System.out.println("Linked List kosong");
        }
    }
    public int getData(int index) {
        Node28 currentNode28 = head;

        for (int i = 0; i < index; i++){
            currentNode28 = currentNode28.next;
        }
        return currentNode28.data;
    }
    public int indexOf(int key) {
        Node28 currentNode28 = head;
        int index = 0;

        while (currentNode28 != null && currentNode28.data != key){
            currentNode28 = currentNode28.next;
            index++;
        }
        if (currentNode28 == null) {
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst() {
        if (!isEmpty()){
            head = head.next;
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List koosng");
        } else if (head.next == null) {
            head = null;
        } else {
            Node28 currentNode28 = head;

            while (currentNode28.next != null) {
               if (currentNode28.next.next == null) {
                currentNode28.next = null;
                break;
                }
                currentNode28 = currentNode28.next;
           } 
        }
    }
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.data == key) {
           removeFirst();
        } else {
            Node28 currentNode28 = head;

            while (currentNode28.next != null) {
                if (currentNode28.next.data == key) {
                    currentNode28.next = currentNode28.next.next;
                    break;
                }
                currentNode28 = currentNode28.next;
            }
        }
    }
    public void InsertAt(int index, int key) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
    } else {
        Node28 newNode28 = new Node28(index, null);
        Node28 currentNode28 = head;

        while (currentNode28 != null) {
            if (currentNode28.data == key) {
                newNode28.next = currentNode28.next;
                currentNode28.next = newNode28;
                System.out.println("insert data is succed");
                System.out.println();
                break;
            } else {
                currentNode28 = currentNode28.next;
            }
        }
    }
}
public void insertBefore(int key, int input) {
    Node28 newNode = new Node28(input, null);
    if (!isEmpty()) {
        if (head.data == key) {
            addFirst(input);
            System.out.println("Node added before " + key);
            return;
        }

        Node28 currentNode28 = head;
        while (currentNode28.next != null) {
            if (currentNode28.next.data == key) {
                newNode.next = currentNode28.next;
                currentNode28.next = newNode;
                System.out.println("Node added before " + key);
                return;
            }
            currentNode28 = currentNode28.next;
        }
        System.out.println("Key not found");
    } else {
        System.out.println("Linked List kosong");
    }
}
public void removeAt(int index) {
    if (!isEmpty()) {
        if (index == 0) {
            removeFirst();
            System.out.println("Node removed at index " + index);
        } else {
            Node28 currentNode28 = head;
            int currentIndex = 0;
            while (currentNode28 != null) {
                if (currentIndex == index - 1 && currentNode28.next != null) {
                    currentNode28.next = currentNode28.next.next;
                    System.out.println("Node removed at index " + index);
                    return;
                }
                currentNode28 = currentNode28.next;
                currentIndex++;
            }
            System.out.println("Index out of bounds");
        }
    } else {
        System.out.println("Linked List kosong");
    }
}


}