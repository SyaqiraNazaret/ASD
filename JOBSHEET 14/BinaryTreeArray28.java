public class BinaryTreeArray28 {
    int[] data;
    int idxLast;

    public BinaryTreeArray28(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void traversePreOrder() {
        traversePreOrder(0);
    }

    private void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " "); 
            traversePreOrder(2 * idxStart + 1); 
            traversePreOrder(2 * idxStart + 2); 
        }
    }

    public void traversePostOrder() {
        traversePostOrder(0); 
    }

    private void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1); 
            traversePostOrder(2 * idxStart + 2); 
            System.out.print(data[idxStart] + " ");
        }
    }
}

