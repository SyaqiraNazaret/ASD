import java.util.Scanner;
public class MainFaktorial28 {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial28 [] fk = new Faktorial28[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial28();
            System.out.print("Masukkan nilai data ke-" + (i+1)+ " : ");
            fk[i].nilai = sc.nextInt(); 
        }
        System.out.println("============================================= ");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startTimeBF =System.currentTimeMillis();
        for (int i = 0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : " + fk[i].FactorialBF(fk[i].nilai));
        }
        Long endTimeBF = System.currentTimeMillis();
        System.out.println("Waktu eksekusi Brute Force: "+(endTimeBF - startTimeBF)+" ms");
        System.out.println("==============================================");
        System.out.println("Hasil Faktor dengan Devide and Conquer");
        long startTimeDC = System.currentTimeMillis();
        for (int i = 0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].FactorialDC(fk[i].nilai));
        }
        long endTimeDC = System.currentTimeMillis();
        System.out.println("Waktu eksekusi Divide and Conquer: "+(endTimeDC - startTimeDC)+" ms");
    }
}