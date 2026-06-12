package bagian1.array;

public class LatihanArray3 {
    public static void main(String[] args) {

        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("Jumlah angka genap = " + jumlahGenap);
    }
}