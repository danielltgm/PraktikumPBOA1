/**
 * Nama File: DiskonLambda.java
 * Deskripsi: Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 * Nama Pembuat: Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal: 25/05/2026
 */

// Interface (functional)
interface IDiskon {

    // Method abstrak untuk menghitung harga setelah diskon
    double hitungDiskon(int harga);
}

public class DiskonLambda {

    // Main Method
    public static void main(String[] args) {

        // Tanpa Lambda (Anonymous Class)
        IDiskon diskonMerdeka = new IDiskon() {

            // Override
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Dengan Lambda Expression
        IDiskon diskonLebaran =
                (harga) -> harga - (harga * 0.4);

        // Lambda dengan Block Statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // Output hasil perhitungan diskon
        System.out.println(
                "Diskon Merdeka : " +
                diskonMerdeka.hitungDiskon(45000));

        System.out.println(
                "Diskon Lebaran : " +
                diskonLebaran.hitungDiskon(45000));

        System.out.println(
                "Diskon Biasa : " +
                diskonBiasa.hitungDiskon(45000));
    }
}

// Jawaban Pertanyaan
// diskonBiasa menggunakan lembda dengan block statement yang memungkinkan penulisan beberapa pernyataan dan memerlukan return.
// diskonLebaran menggunakan lambda sederhana dengan satu ekspresi sehingga lebih ringkas.
// Keduanya ama-sama mengimplementasikan method hitungDiskon() dari interface IDiskon.