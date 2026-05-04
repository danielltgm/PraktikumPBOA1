/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Class prosedur generik Tukar untuk menukar isi dua wadah generik Datum
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 13.45
*/

public class OperatorGenerik<T> {
    // Method generik untuk menukar isi dari dua objek Datum<T>
    // Kedua objek harus memiliki tipe yang sama (T)
    public void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}