/* Nama File    : Kucing.java
 * Deskripsi    : Class untuk sublass Anabul yaitu kucing yang implementasiin perilaku gerak dan suara si kucing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 24 April 2026 - 21.21
 */

public class Kucing extends Anabul {
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " Bergerak dengan Berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " Bersuara dengan Mengeong");
    }
}
