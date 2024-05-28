import java.util.Scanner;

public class QueueMain28 {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc28.nextInt();
        Queue28 antri = new Queue28(jumlah);
        int pilih;
        do {    
            menu();
            pilih = sc28.nextInt();
            sc28.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc28.next();
                    System.out.print("Nama: ");
                    String nama = sc28.next();
                    System.out.print("Alamat: ");
                    String alamat = sc28.next();
                    System.out.print("Umur: ");
                    int umur = sc28.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc28.nextDouble();
                    Nasabah28 nb = new Nasabah28(norek, nama, alamat, umur, saldo);
                    sc28.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah28 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang dikeluarkan: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                Nasabah28 rearData = antri.peekRear();
                if (rearData != null) {
                    System.out.println("Antrian paling belakang: " + rearData.alamat + " " + rearData.umur + " " + rearData.norek + " " + rearData.saldo + " " + rearData.nama);
                }
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        sc28.close();
    }
}
