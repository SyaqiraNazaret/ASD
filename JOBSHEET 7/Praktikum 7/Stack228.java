public class Stack228 {
    Pakaian28 data[];
    int size;
    int top;

    public Stack228(int size){
        this.size = size;
        data = new Pakaian28[size];
        top = -1;
    }
    public boolean isEmpty(){
        if (top == -1) {  
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
    public void push(Pakaian28 pkn){
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    public void pop(){
        if (!isEmpty()){
            Pakaian28 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk +" "+ x.ukuran + " " + x.harga+" ");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas: "+ data[top].jenis + " " + data[top].warna+ " " + data[top].merk+ " " + data[top].ukuran + " " + data[top].harga);
    }
    public void print(){
        System.out.println("Isi Stack: ");
        for  (int i= top;i>=0; i--) {
            System.out.println(data[i].jenis+" " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }
    public void clear() {
        if (isEmpty()) {
            for (int i = top; i >= 0; i--) {
              top --;  
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void getMax(){
        if (isEmpty()) {
           System.out.println("Stack kosong, tidak ada data untuk diurutkan");
           return; 
        }
        Pakaian28 maxHarga = data[0];
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] != null && data[i].harga > maxHarga.harga){
                maxHarga = data[i];
            }
        }
        System.out.println("Data pakaian dengan harga tertinggi:");
        System.out.println("Jenis: " + maxHarga.jenis);
        System.out.println("Warna: " + maxHarga.warna);
        System.out.println("Merk: " + maxHarga.merk);
        System.out.println("Ukuran: " + maxHarga.ukuran);
        System.out.println("Harga: " + maxHarga.harga);
    } 
}