import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa28 {
    List<Mahasiswa28> mahasiswas = new ArrayList<>();
    
        public void tambah(Mahasiswa28... mahasiswa){
            mahasiswas.addAll(Arrays.asList(mahasiswa));
        }
        public void hapus(int index){
            mahasiswas.remove(index);
        }
        public void update(int index, Mahasiswa28 mhs){
            mahasiswas.set(index, mhs);
        }
        public void tampil(){
            mahasiswas.stream().forEach(mhs ->{
                System.out.println(""+mhs.toString());
            });
        }
        int binarySearch(String nim){
            for(int i =0; i < mahasiswas.size(); i++){
                if (nim.equals(mahasiswas.get(i).nim)) {
                    return i;
                }
            }
            return -1;
        }
        public void sortAscending() {
            Collections.sort(mahasiswas, Comparator.comparing(mahasiswa -> mahasiswa.nim));
        }
        public void sortDescending() {
            Collections.sort(mahasiswas, Comparator.comparing((Mahasiswa28 mahasiswa) -> mahasiswa.nim).reversed());
        }
        public static void main(String[] args) {
        ListMahasiswa28 lm = new ListMahasiswa28();
        Mahasiswa28 m = new Mahasiswa28("201234", "Noureen", "021xx1");
        Mahasiswa28 m1 = new Mahasiswa28("201235", "Akhleema", "021xx2");
        Mahasiswa28 m2 = new Mahasiswa28("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa 
        lm.tampil();
        //update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa28("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // Mengurutkan secara ascending
        lm.sortAscending();
        System.out.println("\nDaftar Mahasiswa setelah diurutkan secara ascending:");
        lm.tampil();

        // Mengurutkan secara descending
        lm.sortDescending();
        System.out.println("\nDaftar Mahasiswa setelah diurutkan secara descending:");
        lm.tampil();
    }

}
