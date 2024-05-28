public class BookingBioskop28 {
    String judul;
    double waktu, harga;
    String seat;

    public BookingBioskop28(){

    }
    public BookingBioskop28(String jdl, double jamTayang, String nomorKursi, double hargaTiket){
        judul = jdl;
        waktu = jamTayang;
        seat = nomorKursi;
        harga = hargaTiket;
    }
    public void tampilData(){
        System.out.println("Judul film: "+ judul);
        System.out.println("Waktu Tayang: " +waktu);
        System.out.println("Seat: " +seat);
    }
}
