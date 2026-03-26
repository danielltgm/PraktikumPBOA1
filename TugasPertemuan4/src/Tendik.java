/*
 * Nama File   : Tendik.java
 * Deskripsi   : Kelas Tendik merupakan turunan dari kelas Pegawai
 *               yang merepresentasikan tenaga kependidikan dengan
 *               bidang kerja, batas usia pensiun (BUP), dan tanggal pensiun.
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 15 Maret 2026 - 12.12
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Tendik extends Pegawai {

    /*************** ATRIBUT ***************/
    private String bidang;
    private int BUP;
    private LocalDate tanggalpensiun;

    /*************** KONSTRUKTOR ***************/

    // Konstruktor default
    Tendik() {
        super();
        this.bidang = "";
        this.BUP = 55;
        this.tanggalpensiun = LocalDate.now();
    }

    // Konstruktor dengan parameter
    Tendik(String nip, String nama, LocalDate tanggallahir,
           LocalDate terhitungmulaitanggal, String jabatan,
           double gajipokok, String bidang) {

        super(nip, nama, tanggallahir, terhitungmulaitanggal, jabatan, gajipokok);

        this.bidang = bidang;
        this.BUP = 55;

        // Perhitungan tanggal pensiun yang aman
        this.tanggalpensiun = tanggallahir.plusYears(BUP).withDayOfMonth(1);
    }

    /*************** GETTER ***************/

    // Mengambil bidang tendik
    public String getBidang() {
        return bidang;
    }

    // Mengambil batas usia pensiun (BUP)
    public int getBUP() {
        return BUP;
    }

    // Mengambil tanggal pensiun
    public LocalDate getTanggalpensiun() {
        return tanggalpensiun;
    }

    /*************** SETTER ***************/

    // Mengatur bidang tendik
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // Mengatur batas usia pensiun
    public void setBUP(int BUP) {
        this.BUP = BUP;
    }

    // Mengatur tanggal pensiun
    public void setTanggalpensiun(LocalDate tanggalpensiun) {
        this.tanggalpensiun = tanggalpensiun;
    }

    /*************** METHOD ***************/

    // Menampilkan informasi tendik
    @Override
    void printInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggallahir().format(format));
        System.out.println("TMT             : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Tanggal Pensiun : " + getTanggalpensiun().format(format));
        System.out.println("Gaji Pokok      : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan       : " + formatRupiah.format(getTunjangan()));
    }
}