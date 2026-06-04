/* Nama File    : Anabul.java
 * Deskripsi    : Class untuk induk si Anabul yang assign nama dan perilaku gerak dan bersuara.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 04.12
 */

public class Anabul {
    // Atribut untuk menyimpan nama dari objek Anabul
    private String Nama;

    // Konstruktor tanpa parameter
    public Anabul() {
        this.Nama = "";
    }

    // Konstruktor dengan parameter
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    // Getter
    public String getNama() {
        return Nama;
    }

    // Setter 
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    // Method untuk mendeskripsikan perilaku bergerak
    // Mencetak nama Anabul diikuti dengan aksi bergerak
    public void Gerak() {
        System.out.println(getNama() + " Sedang Bergerak");
    }

    // Method untuk mendeskripsikan perilaku bersuara
    // Mencetak nama Anabul diikuti dengan aksi bersuara
    public void Bersuara() {
        System.out.println(getNama() + " Bersuara");
    }

    // Override method toString()
    // Merepresentasikan objek dalam bentuk String
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{Nama='" + getNama() + "'}";
    }
}