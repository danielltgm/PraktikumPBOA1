/*
 * Nama File   : Pegawai.java
 * Deskripsi   : Kelas Pegawai merepresentasikan data dasar pegawai
 *               seperti NIP, nama, tanggal lahir, jabatan, gaji pokok,
 *               serta perhitungan tunjangan dan masa kerja.
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 15 Maret 2026 - 10.21 
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {

    /*************** ATRIBUT ***************/
    private String nip;
    private String nama;
    private LocalDate tanggallahir;
    private LocalDate terhitungmulaitanggal;
    private String jabatan;
    private double gajipokok;

    /*************** KONSTRUKTOR ***************/

    // Konstruktor default
    Pegawai() {
        this.nip = "";
        this.nama = "";
        this.tanggallahir = LocalDate.now();
        this.terhitungmulaitanggal = LocalDate.now();
        this.jabatan = "";
        this.gajipokok = 0;
    }

    // Konstruktor dengan parameter
    Pegawai(String nip, String nama, LocalDate tanggallahir,
             LocalDate terhitungmulaitanggal, String jabatan, double gajipokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
        this.terhitungmulaitanggal = terhitungmulaitanggal;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
    }

    /*************** SETTER ***************/

    // Mengatur NIP pegawai
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Mengatur nama pegawai
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengatur tanggal lahir pegawai
    public void setTanggallahir(LocalDate tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    // Mengatur tanggal mulai bekerja (TMT)
    public void setTerhitungmulaitanggal(LocalDate terhitungmulaitanggal) {
        this.terhitungmulaitanggal = terhitungmulaitanggal;
    }

    // Mengatur jabatan pegawai
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Mengatur gaji pokok pegawai
    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    /*************** GETTER ***************/

    // Mengambil NIP pegawai
    public String getNip() {
        return nip;
    }

    // Mengambil nama pegawai
    public String getNama() {
        return nama;
    }

    // Mengambil tanggal lahir
    public LocalDate getTanggallahir() {
        return tanggallahir;
    }

    // Mengambil tanggal mulai bekerja
    public LocalDate getTerhitungmulaitanggal() {
        return terhitungmulaitanggal;
    }

    // Mengambil jabatan pegawai
    public String getJabatan() {
        return jabatan;
    }

    // Mengambil gaji pokok
    public double getGajipokok() {
        return gajipokok;
    }

    /*************** METHOD ***************/

    // Menghitung tunjangan berdasarkan jabatan dan masa kerja
    public double getTunjangan() {
        if (jabatan.equals("Dosen Tetap")) {
            return getGajipokok() * 0.02 * getTahunMasaKerja();
        } else if (jabatan.equals("Dosen Tamu")) {
            return getGajipokok() * 0.025;
        } else if (jabatan.equals("Tenaga Didik")) {
            return getGajipokok() * 0.01 * getTahunMasaKerja();
        } else {
            return 0;
        }
    }

    // Menghitung masa kerja dalam tahun
    int getTahunMasaKerja() {
        int bulan = (LocalDate.now().getYear() - terhitungmulaitanggal.getYear()) * 12;
        bulan += LocalDate.now().getMonthValue() - terhitungmulaitanggal.getMonthValue();
        return bulan / 12;
    }

    // Menghitung masa kerja dalam format tahun dan bulan
    String getMasaKerja() {
        int bulan = (LocalDate.now().getYear() - terhitungmulaitanggal.getYear()) * 12;
        bulan += LocalDate.now().getMonthValue() - terhitungmulaitanggal.getMonthValue();

        return bulan / 12 + " Tahun " + bulan % 12 + " Bulan";
    }

    // Menampilkan informasi pegawai
    void printInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggallahir().format(format));
        System.out.println("TMT             : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Gaji Pokok      : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan       : " + formatRupiah.format(getTunjangan()));
    }
}