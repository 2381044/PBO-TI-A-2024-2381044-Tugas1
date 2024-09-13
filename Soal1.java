public class Soal1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int jumlah = 0;

        for (int i = 0; i < array.length; i++) {
            jumlah += array[i];
        }
        System.out.println("Jumlah elemen-elemen dalam  array : " + jumlah);
    }
}

