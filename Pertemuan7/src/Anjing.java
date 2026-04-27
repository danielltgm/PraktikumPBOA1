/* Nama File    : Anjing.java
 * Deskripsi    : Class untuk sublass Anabul yaitu anjing yang implementasiin perilaku gerak dan suara si anjing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 24 April 2026 - 20.09
 */

public class Anjing extends Anabul {
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " Bergerak dengan Berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " Bersuara dengan Menggonggong");
    }
}