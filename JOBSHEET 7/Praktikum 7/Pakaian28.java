public class Pakaian28 {

    String jenis, warna, merk, ukuran;
    String maxHarga;
    double harga;

    Pakaian28(String jneis, String warna, String merk, String ukuran, double harga){
        this.jenis = jneis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
    void tampil(){
        System.out.println("Jenis : "+jenis);
        System.out.println("Warna : "+warna);
        System.out.println("Merk  : "+merk);
        System.out.println("Ukuran: "+ukuran);
        System.out.println("\nHarga : Rp."+harga);
    }
}