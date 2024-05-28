import java.util.Scanner;
public class MainNilaiAkar28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("\t\tNILAI AKAR PANGKAT");
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah bilangan yang ingin dihitung akarnya: ");
        int jumlahBilangan = sc28.nextInt();

        nilaiAkar28[] akar = new nilaiAkar28[jumlahBilangan];
        for (int i = 0; i < jumlahBilangan; i++) {
            akar[i] = new nilaiAkar28();
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            akar[i].nilai = sc28.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Brute Force");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarBF(akar[i].nilai));
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Divide and Conquer");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarDC(akar[i].nilai, 0, akar[i].nilai));
        }
        System.out.println("=======================================================");
    }
}
