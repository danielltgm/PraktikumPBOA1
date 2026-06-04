/* Nama File    : Datum.java
 * Deskripsi    : Kelas generik Datum sebagai wadah (container) untuk sebuah nilai bertipe generik.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 10.12
 */

public class Datum<T> {
    // Atribut generik untuk menyimpan satu nilai dengan tipe bebas T
    private T isi;

    // Konstruktor tanpa parameter
    public Datum() {
        this.isi = null;
    }

    // Konstruktor dengan parameter
    public Datum(T isi) {
        this.isi = isi;
    }

    // Getter 
    public T getIsi() {
        return isi;
    }

    // Setter 
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}