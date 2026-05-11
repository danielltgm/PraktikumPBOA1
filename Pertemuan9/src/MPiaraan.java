/* Nama File    : MPiaraan.java
 * Deskripsi    : Class aplikasi untuk menguji seluruh operasi pada class Piaraan
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 8 Mei 2026 - 13.20
 */

public class MPiaraan {
    public static void main(String[] args) {

        // Kamus
        Piaraan P;

        Kucing K1;
        Anggora K2;
        Kembangtelon K3;
        Anjing A1;
        Burung B1;

        // Algoritma
        P = new Piaraan();

        // Inisialisasi objek Anabul
        K1 = new Kucing("Kucing Persia", 5.4);
        K2 = new Anggora("Anggora Putih", 4.1);
        K3 = new Kembangtelon("Kembang Telon Oren", 3.8);
        A1 = new Anjing("Golden Dog");
        B1 = new Burung("Kenari Kuning");

        // Mengatur nama panggilan setiap Anabul
        K1.setPanggilan("Mochi");
        K2.setPanggilan("Luna");
        K3.setPanggilan("Simba");
        A1.setPanggilan("Rocky");
        B1.setPanggilan("Kiki");

        // Menampilkan jumlah elemen awal
        System.out.println("NBElement : " + P.getNbelm());

        // Menambahkan seluruh Anabul ke antrean
        P.enqueueAnabul(K1);
        P.enqueueAnabul(K2);
        P.enqueueAnabul(K3);
        P.enqueueAnabul(A1);
        P.enqueueAnabul(B1);

        // Menampilkan jumlah elemen setelah enqueue
        System.out.println("NBElement Sekarang : " + P.getNbelm());

        // Menampilkan seluruh nama panggilan Anabul
        System.out.println("Seluruh Anabul (panggilan) : ");
        P.showAnabul();

        // Menampilkan Anabul pertama tanpa menghapus dari antrean
        System.out.println(
            "Anabul pertama (tanpa dequeue) : " +
            P.getAnabul().getPanggilan()
        );

        // Mengecek apakah Anabul tertentu ada di antrean
        System.out.println(
            "Apakah 'Mochi' ada di antrean : " +
            P.isMember(K1)
        );

        // Menghitung jumlah keluarga Kucing
        System.out.println(
            "Count Keluarga Kucing : " +
            P.countKucing()
        );

        // Menghitung total bobot keluarga Kucing
        System.out.println(
            "Total Bobot Keluarga Kucing : " +
            P.bobotKucing() + "kg"
        );

        // Menampilkan jenis/class tiap Anabul
        System.out.println("Tampilkan jenis tiap Anabul : ");
        P.showJenisAnabul();

        // Menghapus Anabul pertama dari antrean
        System.out.println(
            "Dequeue 1 Anabul : " +
            P.dequeueAnabul().getPanggilan()
        );

        // Menampilkan jumlah elemen setelah dequeue
        System.out.println(
            "NBElement Setelah Dequeue : " +
            P.getNbelm()
        );

        // Menampilkan seluruh Anabul setelah dequeue
        System.out.println("Seluruh Anabul setelah dequeue : ");
        P.showAnabul();
    }
}