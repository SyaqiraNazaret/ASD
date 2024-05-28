/**
 * bookingBioskop28
 */
public class bookingBioskop28 {
    String namaFilm;
    double jamTayang;
    int tanggal;
    String studio;
    int harga;
    String seat;
    int totalHarga;

void pesanTiket(int i){
    System.out.println("Film: "+namaFilm);
    System.out.println("Jam Tayang: "+jamTayang);
    System.out.println("Tanggal: "+tanggal);
    System.out.println("Seat: "+seat);
    System.out.println("Studio: "+studio);
    System.out.println("Harga: "+harga);
}
public bookingBioskop28(){

}
public bookingBioskop28(String film, double jam, int tgl, String std, int hrg, String Seat){
    namaFilm = film;
    jamTayang = jam;
    tanggal = tgl;
    studio = std;
    harga = hrg;
    seat = Seat;

}
}
