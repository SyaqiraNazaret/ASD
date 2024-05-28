import java.util.Scanner;
import java.util.Stack;

public class StrukMain28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<StrukBelanja28> stack = new Stack<>();

        System.out.println("====================================");
        System.out.println("| Masukkan informasi struk belanja |");
        System.out.println("====================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Struk Belanja ke-" + (i + 1) + ":");
            System.out.print("Nomor Transaksi  : ");
            int nomorTransaksi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
            System.out.print("Tanggal Pembelian: ");
            String tanggalPembelian = scanner.nextLine();
            System.out.print("Jumlah Barang    : ");
            int jumlahBarang = scanner.nextInt();
            System.out.print("Total Harga Bayar: ");
            double totalHargaBayar = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline

            StrukBelanja28 struk = new StrukBelanja28(nomorTransaksi, tanggalPembelian, jumlahBarang, jumlahBarang);
            stack.push(struk);
        }
        System.out.println("====================================");

        System.out.println("\n================================================");
        System.out.println("| Informasi struk belanja yang masih tersimpan |");
        System.out.println("================================================");
        for (StrukBelanja28 struk : stack) {
            System.out.println(struk);
            System.out.println("================================================");
        }

        System.out.println("\n=======================================================");
        System.out.println("| Mengambil lima struk belanja untuk ditukarkan       |");
        System.out.println("| dengan voucher belanja:                             |");
        System.out.println("=======================================================");
        for (int i = 0; i < 5; i++) {
            StrukBelanja28 strukDitukar = stack.pop();
            System.out.println("Struk yang ditukarkan ke-" + (i + 1) + ":\n" + strukDitukar);
            System.out.println("=======================================================");
        }
        scanner.close();
    }
}