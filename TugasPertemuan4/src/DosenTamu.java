/*
 * Nama File   : DosenTamu.java
 * Deskripsi   : Kelas DosenTamu merupakan turunan dari kelas Dosen
 *               yang merepresentasikan dosen dengan status kontrak
 *               beserta NIDK dan tanggal berakhir kontraknya.
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 15 Maret 2026 - 09.14
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {

    /*************** ATRIBUT ***************/
    private String NIDK;
    private LocalDate tanggalberakhirkontrak;

    /*************** KONSTRUKTOR ***************/

    // Konstruktor default
    DosenTamu() {
        super();
        this.NIDK = "";
        this.tanggalberakhirkontrak = LocalDate.now();
    }

    // Konstruktor dengan parameter
    DosenTamu(String nip, String nama, LocalDate tanggallahir, LocalDate terhitungmulaitanggal,
              String jabatan, double gajipokok, String fakultas,
              String NIDK, LocalDate tanggalberakhirkontrak) {

        super(nip, nama, tanggallahir, terhitungmulaitanggal, jabatan, gajipokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalberakhirkontrak = tanggalberakhirkontrak;
    }

    /*************** GETTER ***************/

    // Mengambil NIDK dosen tamu
    public String getNIDK() {
        return NIDK;
    }

    // Mengambil tanggal berakhir kontrak
    public LocalDate getTanggalberakhirkontrak() {
        return tanggalberakhirkontrak;
    }

    /*************** SETTER ***************/

    // Mengatur NIDK dosen tamu
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    // Mengatur tanggal berakhir kontrak
    public void setTanggalberakhirkontrak(LocalDate tanggalberakhirkontrak) {
        this.tanggalberakhirkontrak = tanggalberakhirkontrak;
    }

    /*************** METHOD ***************/

    // Menampilkan informasi dosen tamu
    @Override
    void printInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("NIP                     : " + getNip());
        System.out.println("NIDK                    : " + getNIDK());
        System.out.println("Nama                    : " + getNama());
        System.out.println("Tanggal Lahir           : " + getTanggallahir().format(format));
        System.out.println("TMT                     : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan                 : " + getJabatan());
        System.out.println("Fakultas                : " + getFakultas());
        System.out.println("Masa Kerja              : " + getMasaKerja());
        System.out.println("Tanggal Berakhir Kontrak: " + getTanggalberakhirkontrak().format(format));
        System.out.println("Gaji Pokok              : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan               : " + formatRupiah.format(getTunjangan()));
    }
}