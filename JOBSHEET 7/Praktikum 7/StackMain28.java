import java.util.Scanner;
public class StackMain28{
    public static void main(String[] args) {
        Stack228 stk = new Stack228(5);
        Scanner sc = new Scanner(System.in);
        char pilih = ' ';
        do {
            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian28 p = new Pakaian28(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
        stk.getMax();
    }
}


    // Modifikasi Percobaan 2
    // public static void main(String[] args) {
    //     Stack228 stk = new Stack228(5);
    //     Scanner sc = new Scanner(System.in);
    //     char pilih = 'y';
    //     while (pilih == 'y' || pilih == 'Y'){
        
    //     System.out.println("1. Push");
    //     System.out.println("2. Pop");
    //     System.out.println("3. Print");
    //     System.out.println("4. Peek");
    //     System.out.print("pilih operasi: ");
    //     int  pil = sc.nextInt();
    //     sc.nextLine();

    //     switch (pil) {
    //         case 1:
    //         System.out.println("Masukkan data");
    //         System.out.print("jenis: ");
    //         String jenis = sc.nextLine();
    //         System.out.print("Warna: ");
    //         String warna = sc.nextLine();
    //         System.out.print("Merk: ");
    //         String merk = sc.nextLine();
    //         System.out.print("Ukuran: ");
    //         String ukuran = sc.nextLine();
    //         System.out.print("Harga: ");
    //         double harga =  sc.nextDouble();
    //         sc.nextLine();
    //         Pakaian28 p = new Pakaian28(jenis, warna, merk, ukuran, harga);
    //         stk.push(p);
    //             break;
    //         case 2: 
    //             stk.pop();
    //             break;
    //         case 3: 
    //             stk.print();
    //             break;
    //         case 4 :
    //             stk.peek();
    //             break;
    //         default:
    //             System.out.println("Pilihan tidak tersedia! Silahkan pilih lagi.");
    //             break;
    //     }
        
    //     System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
    //     pilih = sc.next().charAt(0);
    //     sc.nextLine();   
    // }
    // }

