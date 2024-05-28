import java.util.Scanner;

public class ScavengerMain {
    public static void main(String[] args) {
        ScavengerHunt28 game = new ScavengerHunt28();
        game.addPoint("Indonesia di benua apa?", "Asia");

        game.addPoint("2 + 8 berapa?", "10");
        game.addPoint("Apa Singkatan IPA", "Ilmu Pengetahuan Alam");
        game.addPoint("Tahun berapa Indonesia Merdeka", "1945");

        game.displayPoints();

        Scanner sc = new Scanner(System.in);
        while (game.head != null) {
            System.out.print("Jawab: ");
            String answer = sc.nextLine();
            if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc.close();
        System.exit(0);
    }
}
