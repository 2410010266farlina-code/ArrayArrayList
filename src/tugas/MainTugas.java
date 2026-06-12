package tugas;

// Nama : Farlina Aprilianti
// NPM  : 2410010266

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");

        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Menambahkan mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("Riviana", "231001", 85));

        kelas.tambahMahasiswa(
                new Mahasiswa("Laila", "231002", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Ranti", "231003", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Farlina", "231004", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Chintya", "231005", 60));

        kelas.tampilkanSemua();

        System.out.println();

        System.out.println("Rata-rata nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah mahasiswa lulus : "
                + kelas.jumlahLulus());

        System.out.println("Jumlah data awal : "
                + kelas.jumlahMahasiswa());

        System.out.println();

        // Menambah mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Davina", "231006", 88));

        System.out.println("Mahasiswa baru berhasil ditambahkan.");

        System.out.println("Jumlah data terbaru : "
                + kelas.jumlahMahasiswa());

        System.out.println();

        kelas.tampilkanSemua();
    }
}