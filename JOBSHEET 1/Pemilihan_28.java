import java.util.Scanner;

public class Pemilihan_28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        System.out.println("Perhitungan Nilai Akhir Mahasiswa");
        System.out.println("=================================");

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = sc28.nextInt();

        System.out.print("Masukkan nilai kuis : ");
        int nilaiKuis = sc28.nextInt();

        System.out.print("Masukkan nilai UTS  : ");
        int nilaiUTS = sc28.nextInt();

        System.out.print("Masukkan nilai UAS  : ");
        int nilaiUAS = sc28.nextInt();

        System.out.println("=================================");

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("=================================");
            System.out.println("=================================");
        } else {
            double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
            System.out.println("Nilai akhir: " + nilaiAkhir);

            String nilaiHuruf = "";
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai huruf: " + nilaiHuruf);

            System.out.println("==================================");

            String keterangan = "";
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                keterangan = "SELAMAT ANDA LULUS";
            } else {
                keterangan = "TIDAK LULUS";
            }

            System.out.println(keterangan);
        }
    }
}