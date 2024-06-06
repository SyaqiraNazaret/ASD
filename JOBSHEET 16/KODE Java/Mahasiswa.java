public class Mahasiswa {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa(String nim, String nama, String notelp){
        this.nim =nim;
        this.nama= nama;
        this.notelp = notelp;
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getNoTlp(){
        return notelp;
    }
    @Override
    public String toString(){
        return "Nim: " + nim + ", Nama: " + nama+ ", No Telp: " +notelp;
    }
}
