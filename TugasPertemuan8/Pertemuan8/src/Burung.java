/* Nama File    : Burung.java
 * Deskripsi    : Class untuk sublass Anabul yaitu burung yang implementasiin perilaku gerak dan suara si burung
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 07.50
 */

public class Burung extends Anabul {
    // Konstruktor tanpa parameter
    // Memanggil konstruktor default dari superclass Anabul
    public Burung() {
        super();
    }

    // Konstruktor dengan parameter
    public Burung(String Nama) {
        super(Nama);
    }

    // Override method Gerak dari class Anabul
    // Mendefinisikan perilaku gerak khusus untuk Burung, yaitu terbang
    @Override
    public void Gerak() {
        System.out.println(getNama() + " Bergerak dengan Terbang");
    }

    // Override method Bersuara dari class Anabul
    // Mendefinisikan perilaku suara khusus untuk Burung, yaitu berkicau
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " Bersuara dengan Berkicau");
    }
}