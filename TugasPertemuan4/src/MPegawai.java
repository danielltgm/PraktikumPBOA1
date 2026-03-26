/*
 * Nama File   : MPegawai.java
 * Deskripsi   : berisi main class untuk membuat dan menampilkan antar objek
 *               Pegawai, DosenTetap, DosenTamu, dan Tendik
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 15 Maret 2026 - 13.49
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {

        // Membuat objek dosen tetap
        DosenTetap DosTap1 = new DosenTetap(
            "1987654321",
            "1234567890",
            "Satrio Adhy",
            LocalDate.of(1975, 3, 12),
            LocalDate.of(2005, 9, 1),
            "Dosen Tetap",
            8500000,
            "Teknik Komputer"
        );

        // Membuat objek dosen tamu
        DosenTamu DosTap2 = new DosenTamu(
            "1978123456",
            "Khadijah",
            LocalDate.of(1982, 7, 25),
            LocalDate.of(2022, 2, 1),
            "Dosen Tamu",
            6000000,
            "Sains Matematika",
            "9988776655",
            LocalDate.of(2027, 12, 31)
        );

        // Membuat objek tendik
        Tendik Tend1 = new Tendik(
            "1999001122",
            "Satriawan Rasyid",
            LocalDate.of(1992, 11, 5),
            LocalDate.of(2018, 4, 10),
            "Tenaga Didik",
            4500000,
            "Kemahasiswaan"
        );

        // Output Dosen Tetap
        System.out.println("===== DATA DOSEN TETAP =====");
        DosTap1.printInfo();
        System.out.println();

        // Output Dosen Tamu
        System.out.println("===== DATA DOSEN TAMU =====");
        DosTap2.printInfo();
        System.out.println();

        // Output Tendik
        System.out.println("===== DATA TENAGA KEPENDIDIKAN =====");
        Tend1.printInfo();
        System.out.println();
    }
}