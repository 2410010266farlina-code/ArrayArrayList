package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(
            new Buku("Atomic Habits", "James Clear", 2018)
        );

        perpus.tambahBuku(
            new Buku("Bumi", "Tere Liye", 2014)
        );

        perpus.tambahBuku(
            new Buku("Pulang", "Tere Liye", 2015)
        );

        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("Bumi");

        System.out.println();

        perpus.kembalikanBuku("Bumi");

        System.out.println();

        perpus.cariPenulis("Tere Liye");
    }
}