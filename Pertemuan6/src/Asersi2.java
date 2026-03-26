/*
 * Nama File   : Asersi2.java
 * Deskripsi   : program untuk demo asersi, yang menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 26/03/2026 - 14.05
 */

// Class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// Class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*SOAL LATIHAN PRAKTIKUM PERTEMUAN6: ASERSI2*/
// Soal: Secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan pada lembar laporan praktikum!
// Jawaban:
    // Ada yang salah dari kode yang diberikan untuk Class Asersi2 dari modul Pertemuan6 yang diberikan
    // Asersinya digunakan untuk verifikasi asumsi logika internal si program, bukan buat validasi input dari user/pengguna
    // Dalam kode di atas, assert(jariJari > 0) dipakai untuk menolak jari-jari nol. Namun, karena nilai jariJari berasal dari input (atau bisa saja dari luar program), seharusnya validasi dilakukan dengan if else atau mekanisme pengecekan input, bukan dengan assert.
    // Assertionnya cuman aktif jika si program dijalankan dengan perintah di terminal '-enableassertions', sehingga jika dijalankan tanpa opsi tersebut, pengecekan tidak akan dilakukan dan program tetap menerima jari-jari nol (dibuktikan dengan apabila kita jalankan ddengan 'java Asersi2', output yang keluar 'keliling lingkaran = 0.0'. Padahal harusnya nolak kalau input si jari-jari itu nol, tapi ini malah nerima dan outputnya jadi kelilingnya nol)
    // Dampaknya apa kl hal ini dibiarin? dampaknya itu menjadikan outputnya tidak valid (dibuktikan dengan perhitungan keliling lingkaran yang mengeluarkan 0.0 bila dijalankan dengan 'java Asersi2' padahal harusnya nolak input jari-jari lingkaran yang nol)

    // Mau coba, harusnya codingannya seperti apa yang baik?
        // class Lingkaran {
        //     private double jariJari;
        //     public Lingkaran(double jariJari) {
        //         // validasi si input jari-jari tidak boleh nol atau negatif
        //         if (jariJari <= 0) {
        //             throw new IllegalArgumentException("Jari-jari harus lebih besar dari nol!"); // ini pake eksepsi
        //         }
        //         this.jariJari = jariJari;
        //     }
        //     public double hitungKeliling() {
        //         double keliling = 2 * Math.PI * jariJari;
        //         // ini asersinya -> hasil keliling harus positif
        //         assert (keliling > 0) : "Keliling lingkaran tidak valid!";
        //         return keliling;
        //     }
        // }

        // public class Asersi2 {
        //     public static void main(String[] args) {
        //         double jariJari = 5; // contoh input valid
        //         Lingkaran l = new Lingkaran(jariJari);
        //         double kelilingLingkaran = l.hitungKeliling();
        //         System.out.println("Keliling lingkaran = " + kelilingLingkaran);
        //     }
        // }
