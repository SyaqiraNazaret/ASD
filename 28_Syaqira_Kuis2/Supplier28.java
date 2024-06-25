public class Supplier28 {
    String nama;
    String alamat;
    String noTelp;

    public Supplier28(String nama, String alamat, String noTelp){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    @Override
    public String toString(){
        return "Nama Toko: " + nama + "\t| Alamat: " + alamat + "\t| No telp: " + noTelp;
    }
}
