/* Nama File    : MAnabul.java
 * Deskripsi    : Main program mengilustrasikan konsep generik (Datum, OperatorGenerik, Bobot2, Data) pada keluarga kelas Anabul.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 1 Mei 2026 - 16.22
*/

import java.util.ArrayList;
import java.util.List;

public class MAnabul {
    public static void main(String[] args) {
        // Kamus
        Datum<Kucing> a1 = new Datum<>();

        // Jawaban untuk Nomor 1
        // Isi a1 dengan objek Kembangtelon
        a1.setIsi(new Kembangtelon("Miko", 5.1));
        System.out.println(a1.getIsi());
        
        // Isi a1 dengan objek Anggora
        a1.setIsi(new Anggora("Cici", 4.6));
        System.out.println(a1.getIsi());


        // Jawaban untuk Nomor 2
        Datum<Integer> int1 = new Datum<>(3);
        Datum<Integer> int2 = new Datum<>(6);
        OperatorGenerik<Integer> tukarInt = new OperatorGenerik<>();

        System.out.println("Sebelum ditukar");
        System.out.println("int1 : " + int1.getIsi());
        System.out.println("int2 : " + int2.getIsi());

        System.out.println("Setelah ditukar");
        tukarInt.Tukar(int1, int2);
        System.out.println("int1 : " + int1.getIsi());
        System.out.println("int2 : " + int2.getIsi());

        Datum<String> str1 = new Datum<>("Daniel");
        Datum<String> str2 = new Datum<>("Lamganda");
        OperatorGenerik<String> tukarStr = new OperatorGenerik<>();

        System.out.println("Sebelum ditukar");
        System.out.println("str1 : " + str1.getIsi());
        System.out.println("str2 : " + str2.getIsi());

        System.out.println("Setelah ditukar");
        tukarStr.Tukar(str1, str2);
        System.out.println("str1 : " + str1.getIsi());
        System.out.println("str2 : " + str2.getIsi());

        Datum<Anabul> anabul1 = new Datum<>(new Kucing("Jenggot", 2.7));
        Datum<Anabul> anabul2 = new Datum<>(new Anjing("Bobby"));
        OperatorGenerik<Anabul> tukarAnabul = new OperatorGenerik<>();

        System.out.println("Sebelum ditukar");
        System.out.println("anabul1 : " + anabul1.getIsi());
        System.out.println("anabul2 : " + anabul2.getIsi());

        System.out.println("Setelah ditukar");
        tukarAnabul.Tukar(anabul1, anabul2);
        System.out.println("anabul1 : " + anabul1.getIsi());
        System.out.println("anabul2 : " + anabul2.getIsi());

        // Jawaban untuk Nomor 3c: Bobot2 untuk menjumlahkan bobot dua keturunan kucing
        Bobot2 bobot2 = new Bobot2();
        Kucing k1 = new Anggora("Kumis", 3.3);
        Kucing k2 = new Kembangtelon("Gultom", 3.9);
        System.out.println("Jumlah bobot dua kucing: " + bobot2.jumlahBobot(k1, k2) + "kg");

        // Konsep generik adalah cara membuat wadah yang fleksibel sehingga dapat menampung berbagai tipe data. 
        // Dengan menggunakan generik, sebuah kelas memiliki placeholder yang memungkinkan menerima beragam jenis input, selama tipe tersebut memiliki method yang diperlukan untuk dipanggil.
        // Contoh penerapannya terdapat pada struktur data seperti list, misalnya ArrayList, yang dirancang agar bisa menyimpan objek dari berbagai jenis kelas.

        Data<Anabul> d = new Data<>();

        System.out.println(d.getSize());
        d.setIsi(1, new Anjing("Oma"));
        d.setIsi(2, new Kucing("Opa", 2.9));
        System.out.println(d.getSize());
        System.out.println(d.getIsi(1));
        System.out.println(d.getIsi(2));

        // Contoh tambahan: penerapan List dengan kelas generik (Datum)
        List<Datum<? extends Anabul>> listDatum = new ArrayList<>();
        listDatum.add(new Datum<>(new Burung("Mitty")));
        listDatum.add(new Datum<>(new Anggora("Pitty", 3.9)));
        System.out.println("Isi List<Datum<? extends Anabul>>:");
        for (Datum<? extends Anabul> item : listDatum) {
            System.out.println(item.getIsi());
        }
        
        
    }
}