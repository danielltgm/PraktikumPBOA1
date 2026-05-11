/* Nama File    : Piaraan.java
 * Deskripsi    : Class Piaraan untuk mengelola antrean (Queue) objek Anabul di klinik
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 8 Mei 2026 - 11.09
 */

import java.util.*;

public class Piaraan {
    // Atribut untuk menyimpan jumlah elemen/anabul dalam antrean
    private Integer nbelm;

    // Queue untuk menyimpan objek-objek Anabul
    private Queue<Anabul> Lanabul;

    // Konstruktor tanpa parameter
    // Menginisialisasi queue kosong dan jumlah elemen = 0
    public Piaraan() {
        nbelm = 0;
        Lanabul = new LinkedList<>();
    }
    
    // Getter
    // Mengembalikan jumlah anabul dalam antrean
    public Integer getNbelm() {
        return nbelm;
    }

    // Method
    // Menambahkan objek Anabul ke dalam antrean
    public void enqueueAnabul(Anabul anabul) {
        if (anabul != null) {
            Lanabul.add(anabul);
            nbelm += 1;
        }
    }

    // Method
    // Mengecek apakah Anabul dengan nama panggilan tertentu
    // sudah terdapat dalam antrean
    public boolean isMember(Anabul anabul) {
        if (anabul == null || anabul.getPanggilan() == null) {
            return false;
        }

        for (Anabul e : Lanabul) {
            if (e.getPanggilan() != null &&
                e.getPanggilan().equals(anabul.getPanggilan())) {
                return true;
            }
        }

        return false;
    }

    // Getter
    // Mengambil Anabul paling depan dalam antrean tanpa menghapusnya
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // Method
    // Menghapus dan mengambil Anabul paling depan dalam antrean
    public Anabul dequeueAnabul() {
        Anabul anabulKeluar = Lanabul.poll();

        // Jika ada elemen yang keluar maka jumlah elemen berkurang
        if (anabulKeluar != null) {
            nbelm -= 1;
        }

        return anabulKeluar;
    }

    // Method
    // Menampilkan seluruh nama panggilan Anabul dalam antrean
    public void showAnabul() {
        for (Anabul anabul : Lanabul) {
            System.out.println("Panggilan Anabul : " + anabul.getPanggilan());
        }
    }

    // Method
    // Menghitung jumlah objek yang bertipe Kucing
    public Integer countKucing() {
        Integer counter = 0;

        for (Anabul anabul : Lanabul) {
            if (anabul.getClass().getName() == "Kucing") {
                counter += 1;
            }
        }

        return counter;
    }

    // Method
    // Menghitung total bobot seluruh objek Kucing
    public Double bobotKucing() {
        Double totalBobot = 0.0;

        for (Anabul anabul : Lanabul) {
            if (anabul.getClass().getName() == "Kucing") {
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }

        return totalBobot;
    }

    // Method
    // Menampilkan nama panggilan dan jenis/class dari setiap Anabul
    public void showJenisAnabul() {
        for (Anabul anabul : Lanabul) {
            System.out.println(
                "Panggilan Anabul : " + anabul.getPanggilan() +
                " yang merupakan " + anabul.getClass().getName()
            );
        }
    }
}