/**
 * Nama File   : Petani.java
 * Deskripsi   : Kelas Petani merupakan turunan dari kelas Manusia
 *               dan mengimplementasikan interface Pajak.
 *               Kelas ini merepresentasikan data petani beserta asal kotanya.
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 23 Maret 2026 - 05.10
 */

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    /* Atribut */
    private String asal_kota;
    static int counterPetani = 0;

    /* Method */
    // Konstruktor untuk petani default
    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    // Konstruktor untuk petani dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Mengembalikan asal kota petani
    public String getAsal_kota() {
        return asal_kota;
    }

    // Mengembalikan jumlah petani yang telah dibuat
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Mengeset asal kota petani dengan variable asal_kota
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    
    // Menghitung masa kerja petani
    // NIM = 24060124120048 (Digit ke-12 = 0)
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        return sekarang.getYear() - this.tgl_mulai_kerja.getYear() + 0;
    }
    
    // Menghitung pajak petani
    @Override
    public double hitungPajak() {
        return 0;
    }
    
    // Menampilkan informasi petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + this.asal_kota);
        System.out.println("Masa kerja: " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak : " + this.hitungPajak());
    }
}