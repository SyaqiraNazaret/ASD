public class StrukBelanja28 {
    int nomorTransaksi;
    String tanggal;
    int jmlBarang;
    int totalHrg;

StrukBelanja28(int noTransaksi, String tgl, int jmlBarang, int totHrg){
    nomorTransaksi = noTransaksi;
    tanggal = tgl;
    this.jmlBarang = jmlBarang;
    totalHrg = totHrg;
}
public void tampil(){
    System.out.println("Nomor Transaksi: " + nomorTransaksi);
    System.out.println("Tanggal Pembelian: "+tanggal);
    System.out.println("Jumlah Barang: " +jmlBarang);
    System.out.println("Total Harga: " +totalHrg);
}
}