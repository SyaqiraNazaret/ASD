public class Barang28 {
    String kode;
    String nama;
    String harga;

    public Barang28(){
    }
    public Barang28(String kode, String nama, String harga){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }
    @Override
    public String toString(){
        return"Kode Barang \t: " +kode+  "\t| Nama Barang \t: " +nama+  "\t| Harga Barang \t: " +harga;
    }
}
