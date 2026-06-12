package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(12);
        angka.add(25);
        angka.add(8);
        angka.add(40);
        angka.add(17);

        int terbesar = angka.get(0);

        for (int a : angka) {
            if (a > terbesar) {
                terbesar = a;
            }
        }

        System.out.println("Data angka : " + angka);
        System.out.println("Nilai terbesar : " + terbesar);
    }
}