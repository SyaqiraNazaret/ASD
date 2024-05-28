import java.util.Scanner;
public class BioskopMain28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tiket yang ingin dipesan: ");
        int length = sc.nextInt();
        
        String namaFilm;
        double jamTayang;
        int tanggal;
        String studio;
        int harga;
        String seat;
        int totalHarga = 0;

        bookingBioskop28[] arrayBioskop28 = new bookingBioskop28[length];
        
        for (int i = 0; i < arrayBioskop28.length; i++){
            arrayBioskop28[i] = new bookingBioskop28();
            System.out.print("Masukkan Film: ");
            namaFilm = sc.next();
            System.out.print("Masukkan jam tayang: ");
            jamTayang = sc.nextDouble();
            System.out.print("Masukkan tanggal: ");
            tanggal = sc.nextInt();
            System.out.print("Masukkan Studio: ");
            studio = sc.next();
            System.out.print("Pilih nomor seat: ");
            seat = sc.next();
            System.out.print("Harga per Tiket: ");
            harga = sc.nextInt();
            System.out.println();


            arrayBioskop28[i] = new bookingBioskop28(namaFilm, jamTayang, tanggal, studio, harga, seat);
            totalHarga += harga;
        }

        for (int i = 0; i < arrayBioskop28.length; i++){
            arrayBioskop28[i].pesanTiket(i);
        }
        if (length != 0){
            int total = totalHarga;
            System.out.println("Total: " +total);
        }
    }
}
