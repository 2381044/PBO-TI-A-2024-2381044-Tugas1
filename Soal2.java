import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan ukuran tangga (n) : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
