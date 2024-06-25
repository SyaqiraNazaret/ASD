public class List28 {
    Product28 data[];
    int top, size;
    String id;

    public List28(int size){
        this.size = size;
        data = new Product28[size];
        top = -1;
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (top == size-1){
            return true;
        } else {
            return false;
        }
    }
    public void addProduct(Product28 product){
        if (!isFull()){
            data[++top] = product;
        }else{
            System.out.println("Tidak dapat menambahkan item. Coba Lagi");
        }
    }
    public void remove(String id){
        if (!isEmpty()){
            for(int i = 0; i <= top; i++){
                if(data[i].id.equals(id)){
                    for(int j = i; j < top; j++){
                        data[j] = data[j + 1];
                    }
                    data[top--] = null;
                    return;
                }
            }
            System.out.println("Item tidak ditemukan");
        } else {
            System.out.println("Tidak dapat menghapus item. Coba Lagi");
        }
    }
    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(data[i].id+"| " +data[i].name+"\t| " +data[i].harga+"| ");
        }
    }
    public Product28 getProduct28(String id) {
        for (int i = 0; i <= top; i++) {
            if (data[i].id.equals(id)) {
                return data[i];
            }
        }
        return null;
    }
}