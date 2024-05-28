import java.util.Scanner;

public class Array_28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);

        String[] matakuliah = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] sks = {3, 4, 3, 4, 4, 2.5, 2.5, 4};
        double[] nilaiSetara = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] nilaiAngka = new double[8];

        double totalBobotSKS = 0;
        double totalNilaiSetara = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matakuliah[i] + ": ");
            nilaiAngka[i] = sc28.nextDouble();

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] >= 73 && nilaiAngka[i] < 80) {
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] < 73) {
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50 && nilaiAngka[i] < 60){
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] >= 39 && nilaiAngka[i] < 50) {
                nilaiSetara[i] = 1;
            } else if (nilaiAngka[i] >= 0 && nilaiAngka[i] < 39) {
                nilaiSetara[i] = 0;
            } else {
                System.out.println("Invalid input. Please enter a number between 0 and 100.");
                i--;
                continue;
            }

            // Menentukan nilai huruf
            if (nilaiSetara[i] == 4) {
                nilaiHuruf[i] = "A";
            } else if (nilaiSetara[i] == 3.5) {
                nilaiHuruf[i] = "B+";
            } else if (nilaiSetara[i] == 3) {
                nilaiHuruf[i] = "B";
            } else if (nilaiSetara[i] == 2.5) {
                nilaiHuruf[i] = "C+";
            } else if (nilaiSetara[i] == 2) {
                nilaiHuruf[i] = "C";
            } else if (nilaiSetara[i] == 1) {
                nilaiHuruf[i] = "D";
            } else if (nilaiSetara[i] == 0) {
                nilaiHuruf[i] = "E";
            }

            totalBobotSKS += sks[i];
            totalNilaiSetara += nilaiSetara[i] * sks[i];
        }

        double ipSemester = totalNilaiSetara / totalBobotSKS;

        // Output Header
        System.out.println("\nHasil Konversi Nilai:");
        System.out.println("===============================================================================================");
        System.out.printf("%-40s%-15s%-15s%-15s%s\n", "Mata Kuliah", "Nilai Angka", "Nilai Setara", "Nilai Huruf", "Bobot SKS");
        System.out.println("===============================================================================================");
        // Output Data Mata Kuliah
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s%-15.0f%-15.2f%-15s%.0f\n", matakuliah[i], nilaiAngka[i], nilaiSetara[i], nilaiHuruf[i], sks[i]);
        }
        
        // Output Total Bobot SKS dan IP Semester
        System.out.println("===============================================================================================");
        System.out.printf("%-45s%-15.2f\n", "Total Bobot SKS", totalBobotSKS);
        System.out.printf("%-45s%-15.2f\n", "Total Nilai Setara", totalNilaiSetara);
        System.out.printf("%-45s%-15.2f\n", "IP Semester", ipSemester);
        System.out.println("===============================================================================================");
        
    }
}
