public class Product28 {
    String id;
    String name;
    String harga;

    public Product28() { 
    }
    public Product28(String id, String name, String hrg) {
        this.id = id;
        this.name = name;
        this.harga = hrg;
    }
    @Override
    public String toString() {
        return "Produk Tersedia!\n"+"ID\t: " + id + "\n" +"Nama\t: " + name + "\n"+"Harga\t: " + harga;
    }
}
