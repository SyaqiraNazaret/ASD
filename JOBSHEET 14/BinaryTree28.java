public class BinaryTree28 {
    Node28 root;

    public BinaryTree28(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
    public void add(int data) {
        root = addRecursive(root, data);
    //     Node28 newNode = new Node28(data);
    //     if (isEmpty()) {
    //         root = newNode;
    //     } else {
    //         Node28 current = root;
    //         Node28 parent;
    //         while (true) {
    //             parent = current;
    //             if (data < current.data) {
    //                 current = current.left;
    //                 if (current == null) {
    //                     parent.left = newNode;
    //                     return;
    //                 }
    //             } else {
    //                 current = current.right;
    //                 if (current == null) {
    //                     parent.right = newNode;
    //                     return;
    //                 }
    //             }
    //         }
    //     }
     }
    public Node28 addRecursive(Node28 current, int data){
        if (current == null) {
            return new Node28(data);
        }
        if(data < current.data){
            current.left =  addRecursive(current.left, data);
        } else if (data > current.data){
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }
    boolean find(int data){
            Node28 current = root;
            while(current != null){
                if(current.data != data){
                    return true;
            } else if(data>current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }
    void traversePreOrder(Node28 node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node28 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node28 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    Node28 getSuccessor(Node28 del) {
        Node28 successor = del.right;
        Node28 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return; 
        }
        Node28 parent = root;
        Node28 current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            } else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild =  true;
            } else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }else{
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
        }else{
            if(isLeftChild){
                parent.left = null;
        }else{
            parent.right = null;
            }
        }
    }else if(current.left == null){
        if(current == root ){
            root = current.right;
        } else{
            if(isLeftChild){
                parent.left = current.right;
        } else{
            parent.right = current.right;
        }
    }
    }else if(current.right==null) {
        if(current == root){
            root = current.left;
    }else{
        if (isLeftChild) {
            parent.left = current.left; 
        }else {
            parent.right = current.left;
            }
        }
    } else {
        Node28 successor = getSuccessor(current);
        if(current == root){
            root = successor;
        } else {
            if(isLeftChild){
                parent.left = successor;
                }else{
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}
public int findMinValue() {
    if (isEmpty()) {
        System.out.println("Tree is empty!");
        return Integer.MIN_VALUE;
    }
    Node28 current = root;
    while (current.left != null) {
        current = current.left;
    }
    return current.data;
}

public int findMaxValue() {
    if (isEmpty()) {
        System.out.println("Tree is empty!");
        return Integer.MAX_VALUE;
    }
    Node28 current = root;
    while (current.right != null) {
        current = current.right;
    }
    return current.data;
}

public void printLeafNodes() {
    displayLeafData(root);
}

public void displayLeafData(Node28 node) {
    if (node == null) {
        return;
    }
    if (node.left == null && node.right == null) {
        System.out.print(node.data + " ");
    }
    displayLeafData(node.left);
    displayLeafData(node.right);
}

public int countLeafNodes() {
    return countLeafNodesRekursif(root);
}

public int countLeafNodesRekursif(Node28 node) {
    if (node == null) {
        return 0;
    }
    if (node.left == null && node.right == null) {
        return 1;
    }
    return countLeafNodesRekursif(node.left) + countLeafNodesRekursif(node.right);
}
}


