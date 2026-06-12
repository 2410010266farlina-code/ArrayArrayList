package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList3 {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aira");
        nama.add("Citra");
        nama.add("Aldi");
        nama.add("Azizah");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}