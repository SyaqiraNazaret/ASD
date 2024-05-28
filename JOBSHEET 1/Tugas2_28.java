import java.util.Scanner;
/**
 * Tugas2_28
 */
public class Tugas2_28 {
    static Scanner sc28 = new Scanner(System.in);

    public static void hitungKecepatan() {
        System.out.print("Masukkan jarak : ");
        double jarak = sc28.nextDouble();
        System.out.print("Masukkan waktu : ");
        double waktu = sc28.nextDouble();
        
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan = " + kecepatan);
    }
    
    public static void hitungJarak() {
        System.out.print("Masukkan kecepatan : ");
        double kecepatan = sc28.nextDouble();
        System.out.print("Masukkan waktu : ");
        double waktu = sc28.nextDouble();
        
        double jarak = kecepatan * waktu;
        System.out.println("Jarak = " + jarak+ " km");
    }
    
    public static void hitungWaktu() {
        System.out.print("Masukkan jarak : ");
        double jarak = sc28.nextDouble();
        System.out.print("Masukkan kecepatan : ");
        double kecepatan = sc28.nextDouble();
        
        double waktu = jarak / kecepatan;
        System.out.println("Waktu = " + waktu);
    }
    
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.print("Pilih rumus yang akan dihitung : ");
            int pilih = sc28.nextInt();

            switch (pilih) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2: 
                    hitungJarak();
                    break;
                 case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }  
    }

}
