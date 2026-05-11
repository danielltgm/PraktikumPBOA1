/* Nama File    : Anabul.java
 * Deskripsi    : Class untuk induk si Anabul yang assign nama, panggilan,
 *                dan perilaku gerak dan bersuara.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 8 Mei 2026 - 09.09
 */

public class Anabul {
    // Atribut untuk menyimpan nama dan panggilan dari objek Anabul
    private String Nama;
    private String panggilan;

    // Konstruktor tanpa parameter
    public Anabul() {
        this.Nama = "";
        this.panggilan = "";
    }

    // Konstruktor dengan parameter
    public Anabul(String Nama) {
        this.Nama = Nama;
        this.panggilan = "";
    }

    // Getter
    public String getNama() {
        return Nama;
    }

    public String getPanggilan() {
        return panggilan;
    }

    // Setter 
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
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