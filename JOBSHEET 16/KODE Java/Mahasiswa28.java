public class Mahasiswa28 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa28(){
    }
    public Mahasiswa28(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString(){
        return "Mahasiswa{"+ "nim = " +nim+", nama = "+nama+", notelp = " +notelp+ '}';
    }
}
