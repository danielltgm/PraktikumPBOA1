/* Nama File    : Anggora.java
 * Deskripsi    : Class Anggora yang merupakan subclass Kucing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 04.21
 */

public class Anggora extends Kucing {
    // Konstruktor tanpa parameter
    // Konstruktor default dari superclass Kucing
    public Anggora() {
        super();
    }

    // Konstruktor dengan parameter
    public Anggora(String Nama, double bobot) {
        super(Nama, bobot);
    }

    // Override method Gerak dari superclass
    @Override
    public void Gerak() {
        super.Gerak();
    }

    // Override method Bersuara dari superclass
    @Override
    public void Bersuara() {
        super.Bersuara();
    }
}