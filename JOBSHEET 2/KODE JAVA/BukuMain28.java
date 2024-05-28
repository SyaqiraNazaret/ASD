/**
 * BukuMain28
 */
public class BukuMain28 {

    public static void main(String[] args) {
        Buku28 bk1 = new Buku28();
        bk1.judul =  "Today ends tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 75000;
        

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku28 bk2 = new Buku28("Self reward", "Mahendra Ayesya", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        int JumlahTerjual = 11;
        int hargaTotal = bk2.hitungHargaBayar(JumlahTerjual);
        
        Buku28 bukuSyaqira = new Buku28("Psikologi umum", "Drs.Alex", 120, 12, 30000);
        bukuSyaqira.terjual(2);
        bukuSyaqira.tampilInformasi();

    }
}
