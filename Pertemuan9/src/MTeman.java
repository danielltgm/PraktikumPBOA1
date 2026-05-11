/* Nama File    : MTeman.java
 * Deskripsi    : Class aplikasi untuk menguji seluruh operasi pada class Teman
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 8 Mei 2026 - 12.55
 */

public class MTeman {
    public static void main(String[] args) {

        // Kamus
        Teman T;

        String Teman1;
        String Teman2;
        String Teman3;
        String Teman4;
        String Teman5;
        String Teman5_rename;
        String Teman6;

        // Algoritma
        T = new Teman();

        // Inisialisasi nama teman
        Teman1 = "Budi";
        Teman2 = "Andi";
        Teman3 = "Salsa";
        Teman4 = "Rina";
        Teman5 = "Dimas";
        Teman5_rename = "Dimas Saputra";
        Teman6 = "Andi";

        // Menampilkan jumlah elemen awal
        System.out.println("NBElement : " + T.getNbelm());

        // Menambahkan data teman
        T.addNama(Teman1);
        T.addNama(Teman2);
        T.addNama(Teman3);
        T.addNama(Teman4);
        T.addNama(Teman5);

        // Menampilkan nama teman pertama
        System.out.println("Nama Teman 1 : " + T.getNama(1));

        // Mengecek apakah nama tertentu merupakan member
        System.out.println("Apakah Dimas merupakan teman : " + T.isMember("Dimas"));

        // Menampilkan jumlah elemen sekarang
        System.out.println("NBElement Sekarang : " + T.getNbelm());

        // Menambahkan data teman baru
        T.addNama(Teman6);

        System.out.println("Setelah Add Teman 6 : " + T.getNbelm());

        // Menghitung jumlah nama yang sama
        System.out.println("Count Nama Andi : " + T.countNama(Teman6));

        // Mengubah nama pada indeks tertentu
        System.out.println("Set Nama Teman ke-2 menjadi 'Andi (Update)'");
        T.setNama(2, "Andi (Update)");

        // Mengganti nama tertentu menjadi nama baru
        System.out.println("Ganti Nama Dimas Menjadi Dimas Saputra");
        T.gantiNama(Teman5, Teman5_rename);

        // Menampilkan seluruh data teman
        System.out.println("Seluruh teman sekarang : ");
        T.showTeman();

        // Menghapus nama tertentu
        System.out.println("Delete Andi");
        T.delNama("Andi");

        // Menampilkan data setelah delete
        System.out.println("Seluruh teman setelah delete : ");
        T.showTeman();

        // Menampilkan jumlah elemen akhir
        System.out.println("NBElement Akhir : " + T.getNbelm());
    }
}