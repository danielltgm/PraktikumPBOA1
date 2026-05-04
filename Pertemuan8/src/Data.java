/* Nama File    : Data.java
 * Deskripsi    : Class generik Data dengan ArrayList berisi 100 elemen (posisi 1..100), beserta getIsi, setIsi, dan getSize.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 08.39
 */

import java.util.ArrayList;

public class Data<T> {
    // ArrayList generik untuk menyimpan data dengan tipe bebas T
    private ArrayList<T> ruang;

    // Variabel untuk menghitung jumlah elemen yang terisi dan tidak null
    private int banyak;

    // Konstruktor tanpa parameter
    public Data() {
        this.ruang = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            this.ruang.add(null); 
        }
        this.banyak = 0; 
    }

    // Method bantu untuk mengkonversi posisi (1..100) ke indeks ArrayList (0..99)
    private int toIndex(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IndexOutOfBoundsException("Posisi harus dalam rentang 1..100");
        }
        return posisi - 1; 
    }

    // Getter 
    // Pake toIndex supaya aman dan konsisten
    public T getIsi(int posisi) {
        return ruang.get(toIndex(posisi));
    }

    // Setter
    public void setIsi(int posisi, T isi) {
        int index = toIndex(posisi);

        // Kl sebelumnya null, berarti ada penambahan data baru
        if (ruang.get(index) == null) {
            banyak++;
        }

        // Mengisi atau mengganti isi pada index tersebut
        ruang.set(index, isi);
    }

    // Method
    public int getSize() {
        return banyak;
    }
}