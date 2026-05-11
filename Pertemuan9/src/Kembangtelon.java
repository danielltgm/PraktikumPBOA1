/* Nama File    : Kembangtelon.java
 * Deskripsi    : Class Kembangtelon yang merupakan subclass Kucing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 8 Mei 2026 - 09.44
 */


public class Kembangtelon extends Kucing {
    // Konstruktor tanpa parameter
    // Memanggil konstruktor default dari superclass Kucing
    public Kembangtelon() {
        super();
    }

    // Konstruktor dengan parameter
    public Kembangtelon(String Nama, double bobot) {
        super(Nama, bobot);
    }

    // Override method Gerak dari superclass Kucing
    // Menggunakan perilaku Gerak milik Kucing 
    @Override
    public void Gerak() {
        super.Gerak();
    }

    // Override method Bersuara dari superclass Kucing
    // Nenggunakan perilaku Bersuara milik Kucing
    @Override
    public void Bersuara() {
        super.Bersuara();
    }
}