/* Nama File    : Burung.java
 * Deskripsi    : Class untuk sublass Anabul yaitu burung yang implementasiin perilaku gerak dan suara si burung
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 24 April 2026 - 20.38
 */

public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " Bergerak dengan Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " Bersuara dengan Berkicau");
    }
}