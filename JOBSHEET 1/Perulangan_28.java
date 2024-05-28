import java.util.Scanner;
/**
 * Perulangan_28
 */
public class Perulangan_28 {

    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);

        System.out.print("Masukkan NIM  :");
        String NIM = sc28.nextLine();
        System.out.println("=========================");
        int n = Integer.parseInt(NIM.substring(NIM.length() - 2));
        System.out.println("n : " +n);

        if (n < 10){
            n += 10;
        }

            for (int i = 1; i <= n; i++){
                if (i != 6 && i != 10){
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
    }
}