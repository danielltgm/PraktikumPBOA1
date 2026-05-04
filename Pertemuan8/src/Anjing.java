/* Nama File    : Anjing.java
 * Deskripsi    : Class untuk sublass Anabul yaitu anjing yang implementasiin perilaku gerak dan suara si anjing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 04.49
 */

public class Anjing extends Anabul {
    // Konstruktor tanpa parameter
    // Memanggil konstruktor default dari superclass Anabul
    public Anjing() {
        super();
    }

    // Konstruktor dengan parameter
    public Anjing(String Nama) {
        super(Nama);
    }

    // Override method Gerak dari class Anabul
    // Mengubah perilaku gerak khusus untuk Anjing
    @Override
    public void Gerak() {
        System.out.println(getNama() + " Bergerak dengan Berjalan");
    }

    // Override method Bersuara dari class Anabul
    // Mengubah perilaku suara khusus untuk Anjing, yaitu menggonggong
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " Bersuara dengan Menggonggong");
    }
}