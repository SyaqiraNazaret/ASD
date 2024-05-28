/**
 * Buku28
 */
public class Buku28 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, total,diskon, diskon1, diskon2;

    
    void tampilInformasi(){
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Jumlah Halaman : "+halaman);   
        System.out.println("Sisa Stok : "+stok);
        System.out.println("Harga : Rp."+harga);
    }
    
    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
            System.out.println("Terjual : "+jml+" buah");
        } else {
            System.out.println("Maaf, stok tidak cukup.");
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
    int hitungHargaTotal(int jml){
        return harga * jml;
    }
    int hitungDiskon(int hitungHargaTotal) {
        if (total > 150000) {
            return 12/100 * total;
        } else if (total == 75000 && total <= 150000) {
            return 5/100* total; 
        } else {
            return 0;
        }
    }
    int hitungHargaBayar (int hargaTotal){
        return total = hitungHargaTotal(hargaTotal) - hitungDiskon(hitungHargaTotal(hargaTotal));
    }

    public Buku28(){

    }   

    public Buku28(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}

