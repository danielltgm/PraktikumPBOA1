/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Class prosedur generik Tukar untuk menukar isi dua wadah generik Datum
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 27 April 2026
*/

class OperatorGenerik {
    static class Wrapper<T> {
        T value;

        Wrapper(T value) {
            this.value = value;
        }
    }

    static <T> void Tukar(Wrapper<T> a, Wrapper<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    static <T extends Kucing> double Bobot2(T a, T b) {
        return a.bobot + b.bobot;
    }
}