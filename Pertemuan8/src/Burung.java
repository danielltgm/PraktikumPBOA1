/* Nama File    : Burung.java
 * Deskripsi    : Class untuk sublass Anabul yaitu burung yang implementasiin perilaku gerak dan suara si burung
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 27 April 2026
 */

class Burung extends Anabul {
    // Konstruktor dengan parameter
    Burung(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " Bergerak dengan Terbang");
    }

    void bersuara() {
        System.out.println(nama + " Bersuara dengan Berkicau");
    }
}