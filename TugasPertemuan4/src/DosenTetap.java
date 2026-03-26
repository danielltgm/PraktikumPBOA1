/*
 * Nama File   : DosenTetap.java
 * Deskripsi   : Kelas DosenTetap merupakan turunan dari kelas Dosen
 *               yang merepresentasikan dosen tetap dengan NIDN,
 *               batas usia pensiun (BUP), dan tanggal pensiun.
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 15 Maret 2026 - 09.54
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class DosenTetap extends Dosen {

    /*************** ATRIBUT ***************/
    private String NIDN;
    private int BUP;
    private LocalDate tanggalpensiun;

    /*************** KONSTRUKTOR ***************/

    // Konstruktor default
    DosenTetap() {
        super();
        this.NIDN = "";
        this.BUP = 65;
        this.tanggalpensiun = LocalDate.now();
    }

    // Konstruktor dengan parameter
    DosenTetap(String nip, String NIDN, String nama, LocalDate tanggallahir,
               LocalDate terhitungmulaitanggal, String jabatan,
               double gajipokok, String fakultas) {

        super(nip, nama, tanggallahir, terhitungmulaitanggal, jabatan, gajipokok, fakultas);

        this.NIDN = NIDN;
        this.BUP = 65;

        // Perhitungan tanggal pensiun (lebih aman & jelas)
        this.tanggalpensiun = tanggallahir.plusYears(BUP).withDayOfMonth(1);
    }

    /*************** GETTER ***************/

    // Mengambil NIDN dosen tetap
    public String getNIDN() {
        return NIDN;
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

    // Mengatur NIDN dosen tetap
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
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
    
    // Menampilkan informasi dosen tetap
    @Override
    void printInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("NIP             : " + getNip());
        System.out.println("NIDN            : " + getNIDN());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggallahir().format(format));
        System.out.println("TMT             : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Tanggal Pensiun : " + getTanggalpensiun().format(format));
        System.out.println("Gaji Pokok      : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan       : " + formatRupiah.format(getTunjangan()));
    }
}