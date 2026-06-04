/* Nama File    : Kucing.java
 * Deskripsi    : Class untuk sublass Anabul yaitu kucing yang implementasiin perilaku gerak dan suara si kucing
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 11.02
*/

public class Kucing extends Anabul {
    // Atribut tambahan khusus Kucing
    // Menyimpan bobot/berat badan kucing
    private double bobot;

    // Konstruktor tanpa parameter
    public Kucing() {
        super();
        this.bobot = 0.0;
    }

    // Konstruktor dengan parameter
    public Kucing(String Nama, double bobot) {
        super(Nama); 
        this.bobot = bobot; 
    }

    // Getter 
    public double getBobot() {
        return bobot;
    }

    // Setter
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // Override method Gerak dari Anabul
    // Mendefinisikan perilaku gerak khusus kucing, yaitu berjalan
    @Override
    public void Gerak() {
        System.out.println(this.getNama() + " Bergerak dengan Berjalan");
    }

    // Override method Bersuara dari Anabul
    // Mendefinisikan suara khas kucing, yaitu mengeong
    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " Bersuara dengan Mengeong");
    }

    // Override method toString
    // Menampilkan informasi objek Kucing (nama + bobot)
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{Nama='" + getNama() + "', bobot=" + getBobot() + "kg}";
    }
}