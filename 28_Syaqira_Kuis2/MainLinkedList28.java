import java.util.Scanner;

public class MainLinkedList28 {
    public static void main(String[] args) {
        List28 productList = new List28(100);
        Product28 p1 = new Product28();

        // Menambahkan data awal
        productList.addProduct(new Product28("P001", "Pensil", "2000"));
        productList.addProduct(new Product28("P002", "Penghapus", "1000"));
        productList.addProduct(new Product28("P003", "Pulpen", "3000"));
        productList.addProduct(new Product28("P004", "Buku", "5000"));

        Scanner scanner = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("========MENU=========");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Hapus Produk");
            System.out.println("3. Cari Produk");
            System.out.println("4. Cetak Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID Produk : ");
                    String id = scanner.next();
                    System.out.print("Masukkan Nama Produk : ");
                    String name = scanner.next();
                    System.out.print("Masukkan Harga Produk : ");
                    String harga = scanner.next();
                    productList.addProduct(new Product28 (id, name, harga));
                    System.out.println("Produk baru berhasil ditambahkan ^_^");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukkan ID Produk yang akan dihapus: ");
                    id = scanner.next();
                    productList.remove(id);
                    System.out.println("Item berhasil dihapus.");
                    System.out.println();
                    break;
                case 3:
                System.out.print("Masukkan ID Produk yang akan dicari : ");
                id = scanner.next();
                Product28 p = productList.getProduct28(id);
                if (p != null) {
                    System.out.println(p + "\n");
                } else {
                    System.out.println("Produk tidak ditemukan.");
                }
                System.out.println();
                break;
                case 4:
                    System.out.println("Data Produk yang Tersedia Saat Ini: ");
                    System.out.println("-------------------------");
                    System.out.println("|Id "+"|Nama"+"\t|Harga  |");
                    System.out.println("-------------------------");
                    productList.print();
                    System.out.println("-------------------------");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih menu ulang ^_^");
                    System.out.println();
                    break;
            }
        } while (pilih != 5);
    }
}
