import java.util.Scanner;
public class VaksinMain28 {
    public static void main(String[] args) {
        vaksin28 vks = new vaksin28();
        Scanner input28 = new Scanner(System.in);
        int menu;

            do {
                System.out.println("+++++++++++++++++++++++++++++");
                System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
                System.out.println("+++++++++++++++++++++++++++++");
                System.out.println("1. Tambah Data Penerima Vaksin");
                System.out.println("2. Hapus Data Pengantri Vaksin");
                System.out.println("3. Daftar Penerima Vaksin");
                System.out.println("4. Keluar");
                System.out.println("+++++++++++++++++++++++++++++");
                System.out.print("Masukkan pilihan: ");
                menu = input28.nextInt();
                input28.nextLine();
    
                switch (menu) {
                    case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Masukkan nomor antrian: ");
                    int nomor = input28.nextInt();
                    System.out.print("Masukkan nama penerima: ");
                    String nama = input28.next();
                    vks.add(nama, nomor);
                    break;
                    case 2:
                    vks.remove();
                    break;
                    case 3:
                    vks.print();
                    break;
                    case 4:
                    System.out.println("Keluar dari program.");
                    break;
                    default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
                }
            } while (menu != 5);
        }
    }


