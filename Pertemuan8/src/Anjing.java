/* Nama File    : Anjing.java
 * Deskripsi    : Class untuk sublass Anabul yaitu anjing yang implementasiin perilaku gerak dan suara si anjing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 27 April 2026
 */

class Anjing extends Anabul {
    // Konstruktor dengan parameter
    Anjing(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " Bergerak dengan Berjalan");
    }

    void bersuara() {
        System.out.println(nama + " Bersuara dengan Menggonggong");
    }
}
