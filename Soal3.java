import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan camelCase : ");
        String camelCaseString = input.nextLine();

        int jumlahKata = jumlahKataCamelCase(camelCaseString);

        System.out.println("Jumlah kata dalam camelCase tersebut adalah : " + jumlahKata);
    }

    public static int jumlahKataCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 1;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;

    }

}
