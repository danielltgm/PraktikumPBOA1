/*
 * Nama File   : MBangunDatar.java
 * Deskripsi   : berisi program utama untuk membuat objek Persegi dan Lingkaran
 *               serta menampilkan informasi bangun datar
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 12/03/2026 20.49 PM
 */

public class MBangunDatar {

    /*************** METHOD UTAMA *****************/
    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi persegi1 = new Persegi(5.0, "Merah", "Solid");
        Persegi persegi2 = new Persegi(7.0, "Hijau", "Dotted");

        // Membuat objek Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(3.0, "Biru", "Dashed");
        Lingkaran lingkaran2 = new Lingkaran(4.0, "Kuning", "Solid");

        /*************** INFORMASI PERSEGI *****************/

        // Informasi Persegi 1
        System.out.println("=== Informasi Persegi 1 ===");
        persegi1.printInfo();
        System.out.println("Luas Persegi      : " + persegi1.getLuas());
        System.out.println("Keliling Persegi  : " + persegi1.getKeliling());
        System.out.println("Diagonal Persegi  : " + persegi1.getDiagonal());

        // Informasi Persegi 2
        System.out.println("\n=== Informasi Persegi 2 ===");
        persegi2.printInfo();
        System.out.println("Luas Persegi      : " + persegi2.getLuas());
        System.out.println("Keliling Persegi  : " + persegi2.getKeliling());
        System.out.println("Diagonal Persegi  : " + persegi2.getDiagonal());

        /*************** INFORMASI LINGKARAN *****************/

        // Informasi Lingkaran 1
        System.out.println("\n=== Informasi Lingkaran 1 ===");
        lingkaran1.printInfo();
        System.out.println("Luas Lingkaran    : " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran1.getKeliling());

        // Informasi Lingkaran 2
        System.out.println("\n=== Informasi Lingkaran 2 ===");
        lingkaran2.printInfo();
        System.out.println("Luas Lingkaran    : " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran2.getKeliling());

        /*************** COUNTER OBJEK *****************/

        // Menampilkan jumlah objek BangunDatar yang telah dibuat
        System.out.println("\nTotal Bangun Datar yang dibuat : " 
                            + BangunDatar.counterBangunDatar);
    }
}