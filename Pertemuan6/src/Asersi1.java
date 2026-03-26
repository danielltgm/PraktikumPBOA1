/*
 * Nama File   : Asersi1.java
 * Deskripsi   : program untuk menunjukkan asersi
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 26/03/2026 - 13.50
 */

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

/*Belajar asersi dari kode yang ada di modul*/
// Kalau misalkan kode di atas dijalankan hanya dengan compile javac src/Asersi1.java kemudian di jalankan dengan java Asersi1 maka akan mengeluarkan "x bilangan negatif"
// Tapi kalau dijalankan menggunakan java -enableassertions Asersi1 maka akan muncul error
    // Kenapa bisa muncul error? -> karena penggunaan asersi (assert) sebagai logika utama untuk menentukan apakah x adalah bilangan negatif
    // assert yang digunakan di modul dan di kode atas itu terletak di kondisi else (selain x>0)
    // Apabila kita menggunakan logika x = 0 (masuk ke kondisi else), kondisi tersebut tidak akan terpenuhi sehingga program melempar ke AssertionError
    // Padahal, asersi itu digunakan bukan untuk menggantikan si kondisi if dan else, tapi untuk verifikasi asumsi yang ada
    // sehingga, program akan langsung berhenti dengan output error ketika nilai x itu tidak sesuai dengan kondisi assertnya

    // Alternatif penyelesaiannya gimana? bisa dengan perubahan logika assertnya, yaitu:
    //     public class Asersi1 {
    //     public static void main(String[] args) {
    //         int x = 0;

    //         if (x > 0) {
    //             System.out.println("x bilangan positif");
    //         } else if (x < 0) {
    //             // Asersinya untuk memastikan bahwa x memang negatif
    //             assert (x < 0) : "ada kesalahan kode";
    //             System.out.println("x bilangan negatif");
    //         } else {
    //             // Menangani kasus x = 0
    //             System.out.println("x bernilai nol");
    //         }
    //     }
    // }