public class MainHotel28 {
    public static void main(String[] args) {
        HotelService28 hotelService = new HotelService28(5);
        hotelService.tambah(new Hotel28("Lojikka", "Tulungagung ", 550000, (double) 4));
        hotelService.tambah(new Hotel28("Angkasa", "Bali", 500000, (double) 2));
        hotelService.tambah(new Hotel28("Gajah Mas", "Kediri", 250000, (double) 4));
        hotelService.tambah(new Hotel28("Tugu", "Malang", 1000000, (double) 3.5));
        hotelService.tambah(new Hotel28("Biru", "Surabaya", 760000, (double) 5));

        System.out.println("Daftar hotel sebelum sorting:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.bubbleSortByPrice();
        System.out.println("\nDaftar hotel setelah bubble sort berdasarkan harga:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.selectionSortByPrice();
        System.out.println("\nDaftar hotel setelah selection sort berdasarkan harga:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.bubbleSortByStar();
        System.out.println("\nDaftar hotel setelah bubble sort berdasarkan bintang:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.selectionSortByStar();
        System.out.println("\nDaftar hotel setelah selection sort berdasarkan bintang:");
        System.out.println();
        hotelService.tampilAll();
    }
}