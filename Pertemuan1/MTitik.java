/*
 * Nama File   : MTitik.java
 * Deskripsi   : berisi main program untuk menggunakan class Titik
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 22/02/2026 - 5.49 PM
 */

public class MTitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();     // Membuat objek titik T1 (0,0)

        T1.setAbsis(3);             // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);           // Mengubah ordinat T1 dengan nilai 4

        T1.printTitik();            // Mencetak koordinat T1 ke layar

        T1.geser(3, 4);             // Menggeser T1 sejauh (3,4)

        T1.printTitik();            // Menampilkan koordinat T1 setelah digeser
    }
}