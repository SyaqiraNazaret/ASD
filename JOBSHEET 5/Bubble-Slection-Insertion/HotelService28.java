public class HotelService28 {
    Hotel28[] rooms;
    int idx;
    
        // Constructor
        HotelService28(int size) {
            rooms = new Hotel28[size];
            idx = 0;
        }
    
        void tambah(Hotel28 h) {
            if (idx < rooms.length) {
                rooms[idx] = h;
                idx++;
            } else {
                System.out.println("Tidak dapat menambahkan hotel, kapasitas penuh.");
            }
        }
    
        void tampilAll() {
            for (int i = 0; i < idx; i++) {
                System.out.println("Hotel: " + rooms[i].nama);
                System.out.println("Kota: " + rooms[i].kota);
                System.out.println("Harga: " + rooms[i].harga);
                System.out.println("Bintang: " + rooms[i].bintang);
                System.out.println("------------------------------");
            }
        }
    
        void bubbleSortByPrice() {
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 0; j < idx - i - 1; j++) {
                    if (rooms[j].harga > rooms[j + 1].harga) {
                        Hotel28 temp = rooms[j];
                        rooms[j] = rooms[j + 1];
                        rooms[j + 1] = temp;
                    }
                }
            }
        }
        void bubbleSortByStar() {
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 0; j < idx - i - 1; j++) {
                    if (rooms[j].bintang < rooms[j + 1].bintang) {
                        // Swap
                        Hotel28 tmp = rooms[j];
                        rooms[j] = rooms[j + 1];
                        rooms[j + 1] = tmp;
                    }
                }
            }
        }    
        void selectionSortByStar() {
            for (int i = 0; i < idx - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < idx; j++) {
                    if (rooms[j].bintang > rooms[maxIndex].bintang) {
                        maxIndex = j;
                    }
                }
                Hotel28 temp = rooms[maxIndex];
                rooms[maxIndex] = rooms[i];
                rooms[i] = temp;
            }
        }
        void selectionSortByPrice() {
            int n = idx;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (rooms[j].harga < rooms[minIndex].harga) {
                        minIndex = j;
                    }
                }
            }
        }
        
}
