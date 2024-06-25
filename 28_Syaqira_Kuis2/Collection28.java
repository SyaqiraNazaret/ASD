import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Collection28 {
    static List<Barang28> barang = new ArrayList<>();
    static List<Supplier28> spl = new ArrayList<>();

    public void tambah(Barang28...barang){
        this.barang.addAll(Arrays.asList(barang));
    }
    public void hapus(String kode){
        int index = linearSearch(kode);
        if(index != -1){
            barang.remove(index);
        } else {
            System.out.println("Barang tidak ditemukan");
        }
    }
    public void tampil(){
        barang.stream().forEach(brg ->{
            System.out.println(""+brg.toString());
        });
    }
    public void tambahSupplier(Supplier28...spl){
        this.spl.addAll(Arrays.asList(spl));
    }
    public void tampilSupplier(){
        spl.stream().forEach(sp ->{
            System.out.println(""+sp.toString());
            });
    }
    int linearSearch(String kode){
        for(int i=0; i<barang.size(); i++){
            if (kode.equals(barang.get(i).kode)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Collection28 lst = new Collection28();
        Collection28 spl = new Collection28();
        Barang28 br1 = new Barang28("P001","Pensil","2000");
        Barang28 br2 = new Barang28("P002","Penghapus","1500");
        Barang28 br3 = new Barang28("P003","Buku kotak","3000");
        lst.tambah(br1,br2,br3);
        Supplier28 sp1 = new Supplier28("Maju Jaya 2","Jl. Aggrek, Kota Surabaya","08123678");
        Supplier28 sp2 = new Supplier28("Berkah Abadi","Jl. Tikung, Kota Bogor","08456123");

        Scanner scanner = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("--------<<Menu>>--------");
            System.out.println("1. Tampil Semua Produk");
            System.out.println("2. Tampilkan Supplier");
            System.out.println("3. Tambah produk");
            System.out.println("4. Hapus produk");
            System.out.println("5. Keluar");
            System.out.println("------------------------");
            System.out.print("Pilih Menu : ");
            pilih = scanner.nextInt();

            switch(pilih) {
                case 1 :
                System.out.println("\t\t\t\t---<< Data Barang >>---");
                System.out.println();
                lst.tampil();
                System.out.println();
                    break;
                case 2:
                System.out.println("\t\t\t\t---<< Data Supplier >>---");
                System.out.println();
                spl.tambahSupplier(sp1,sp2);
                spl.tampilSupplier();
                System.out.println();
                    break;
                case 3: 
                System.out.print("Masukkan kode Produk : ");
                String kode = scanner.next();
                System.out.print("Masukkan Nama Produk : ");
                String nama = scanner.next();
                System.out.print("Masukkan Harga Produk : ");
                String harga = scanner.next();
                if (lst != null && lst != null){
                    Barang28 barangBaru = new Barang28(kode, nama, harga);
                    lst.tambah(barangBaru);
                    System.out.println("Produk baru berhasil ditambahkan ^_^");     
                } else {
                    System.out.println("Produk tidak bisa ditambahkan");
                }
                System.out.println();
                    break;
                case 4: 
                System.out.print("Masukkan kode Produk yang ingin dihapus: ");
                String kodeHapus = scanner.next();
                lst.hapus(kodeHapus);
                System.out.println("BERHASIL DIHAPUS.");
                System.out.println();
                    break;
                case 5:
                System.out.println("Terimakasih >_<!");
                    break;
                default:
                System.out.println("Pilihan tidak tersedia. Pilih lagi >>");
                System.out.println();
                    break;

            }
        } while (pilih != 5);
    }
}
