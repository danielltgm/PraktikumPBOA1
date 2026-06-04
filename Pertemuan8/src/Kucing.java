/* Nama File    : Kucing.java
 * Deskripsi    : Class untuk sublass Anabul yaitu kucing yang implementasiin perilaku gerak dan suara si kucing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 27 April 2026
*/

public class Kucing extends Anabul {
    // Atribut tambahan khusus Kucing
    // Menyimpan bobot/berat badan kucing
    double bobot;

    Kucing(String nama, double bobot) {
        // Konstruktor dengan parameter
        super(nama);
        this.bobot = bobot;
    }

    // Method Gerak
    void gerak() {
        System.out.println(nama + " Bergerak dengan Berjalan");
    }

    // Method Bersuara
    void bersuara() {
        System.out.println(nama + " Bersuara dengan Mengeong");
    }
}