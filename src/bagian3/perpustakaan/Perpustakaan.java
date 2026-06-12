package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {

        System.out.println("=== Koleksi Buku ===");

        for (Buku b : koleksi) {
            System.out.println(b.info());
        }
    }

    public void pinjamBuku(String judul) {

        for (Buku b : koleksi) {

            if (b.getJudul().equals(judul)) {

                if (!b.isDipinjam()) {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam");
                }

                return;
            }
        }
    }

    public void kembalikanBuku(String judul) {

        for (Buku b : koleksi) {

            if (b.getJudul().equals(judul)) {
                b.setDipinjam(false);
                System.out.println(judul + " berhasil dikembalikan");
                return;
            }
        }
    }

    public void cariPenulis(String penulis) {

        System.out.println("Buku karya " + penulis);

        for (Buku b : koleksi) {

            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println(b.info());
            }
        }
    }
}