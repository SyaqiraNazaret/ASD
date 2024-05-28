import java.util.Scanner;
public class MainPangkat28 {
    public static void main(String[] args) {
        Scanner sc28 =  new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc28.nextInt();

        Pangkat28 [] png = new Pangkat28[elemen];
        
        for (int i = 0; i < elemen; i++) {
            //png[i] = new Pangkat28();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc28.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc28.nextInt();
            png [i] = new Pangkat28(nilai, pangkat);
            }
            System.out.println("=============================================");
            System.out.println("Pilih metode yang ingin digunakan:");
            System.out.println("1. Brute Force");
            System.out.println("2. Devide and Conquer");
            System.out.print("Masukkan pilihan (1/2): ");
            int choice = sc28.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.println("Hasil Pangkat dengan Brute Force");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                    }
                    break;
                case 2:
                    System.out.println("Hasil Pangkat dengan Devide and Conquer");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        // System.out.println("=============================================");
        // System.out.println("Hasil Pangkat dengan Brute Force");
        // for (int i = 0; i<elemen; i++){
        //     System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        // }
        // System.out.println("==============================================");
        // System.out.println("Hasil Pangkat dengan Devide and Conquer");
        // for (int i = 0; i < elemen; i++){
        //     System.out.println("Hasil "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        // }
    }
}
