package bagian1.array;

public class LatihanArray1 {
    public static void main(String[] args) {

        double[] suhu = {30.5, 29.8, 31.2, 28.7, 32.1, 30.0};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (double s : suhu) {
            if (s > tertinggi) {
                tertinggi = s;
            }

            if (s < terendah) {
                terendah = s;
            }
        }

        System.out.println("Suhu tertinggi : " + tertinggi);
        System.out.println("Suhu terendah  : " + terendah);
    }
}