/* Nama File    : Bobot2.java
 * Deskripsi    : Class yang mengimplementasikan fungsi generik untuk menjumlahkan bobot dua objek subclass Kucing.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 05.11
 */

public class Bobot2 {
    // Method generik dengan tipe parameter T
    // Hanya bisa menerima objek yang bertipe Kucing atau turunannya
    public <T extends Kucing> double jumlahBobot(T kucing1, T kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}