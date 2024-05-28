/**
 * mahasiswa28
 */
public class mahasiswa28 {
    int nim;
    String jenisKelamin;
    String nama;
    double ipk;
    double totalIPK;
void infoMahasiswa(int i){
    System.out.println("Masukkan data mahasiswa ke- " +(i+1));
    System.out.println("Nama: " +nama);
    System.out.println("NIM: "+ nim);
    System.out.println("Jenis Kelamin: " + jenisKelamin); 
    System.out.println("IPK: "+ ipk);
    System.out.println();
}
public mahasiswa28(){
}
public mahasiswa28(int NIM,String NAMA,double IPK, String jk){
    nim = NIM;
    nama = NAMA;
    ipk = IPK;
    jenisKelamin = jk;
}
}
