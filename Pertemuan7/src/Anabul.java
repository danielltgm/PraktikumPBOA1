/* Nama File    : Anabul.java
 * Deskripsi    : Class untuk induk si Anabul yang assign nama dan perilaku gerak dan bersuara.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 24 April 2026 - 19.24
 */

public class Anabul {
    protected String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public void Gerak() {
        System.out.println(Nama + " Sedang Bergerak");
    }

    public void Bersuara() {
        System.out.println(Nama + " Bersuara");
    }
}