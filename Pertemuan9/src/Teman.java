/* Nama File    : Teman.java
 * Deskripsi    : Class Teman untuk mengelola koleksi nama teman (List of String)
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 8 Mei 2026 - 09.50
 */

import java.util.*;

public class Teman {
    // Atribut untuk menyimpan jumlah elemen/nama teman
    private Integer nbelm;

    // List untuk menyimpan nama-nama teman
    private List<String> Lnama;
    
    // Konstruktor tanpa parameter
    // Menginisialisasi list kosong dan jumlah elemen = 0
    public Teman() {
        nbelm = 0;
        Lnama = new ArrayList<>();
    }

    // Getter
    // Mengembalikan jumlah elemen/nama teman
    public Integer getNbelm() {
        return nbelm;
    }

    // Getter
    // Mengambil nama berdasarkan indeks (dimulai dari 1)
    public String getNama(Integer indeks) {
        return Lnama.get(indeks - 1);
    }

    // Setter
    // Mengubah nama pada indeks tertentu
    public void setNama(Integer indeks, String nama) {
        Lnama.set(indeks - 1, nama);
    }

    // Method
    // Menambahkan nama baru ke dalam list teman
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm += 1;
    }

    // Method
    // Menghapus nama dari list teman jika ditemukan
    public void delNama(String nama) {
        boolean berhasil = Lnama.remove(nama);

        // Jika penghapusan berhasil maka jumlah elemen berkurang
        if (berhasil) {
            nbelm -= 1;
        }
    }

    // Method
    // Mengecek apakah suatu nama terdapat dalam list teman
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Method
    // Mengganti nama lama menjadi nama baru
    public void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
            }
        }
    }

    // Method
    // Menghitung jumlah kemunculan suatu nama dalam list
    public Integer countNama(String nama) {
        return Collections.frequency(Lnama, nama);
    }

    // Method
    // Menampilkan seluruh daftar nama teman
    public void showTeman() {
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}