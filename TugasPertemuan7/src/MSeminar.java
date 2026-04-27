/* Nama File : MainSeminar.java
Deskripsi : Main Program simulasi registrasi dan tampiin data peserta seminar.
Pembuat : Daniel Lamganda Tua Gultom - 24060124120048
Tanggal : 25 April 2026 - 10.19
*/

public class MSeminar {
    public static void main(String[] args) {

        Seminar seminar = new Seminar();

        // e. 2 dosen
        Dosen d1 = new Dosen("Bu Khadijah", "DSN001");
        Dosen d2 = new Dosen("Pak Edhy", "DSN002");

        // e. 5 mahasiswa
        Mahasiswa m1 = new Mahasiswa("Daniel", "MHS001");
        Mahasiswa m2 = new Mahasiswa("Jeki", "MHS002");
        Mahasiswa m3 = new Mahasiswa("Derjid", "MHS003");
        Mahasiswa m4 = new Mahasiswa("Elang", "MHS004");
        Mahasiswa m5 = new Mahasiswa("Kak Alan", "MHS005");

        // f. registrasi semua
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // c & g
        seminar.tampilPeserta();
        System.out.println("Total Peserta: " + seminar.countPeserta());

        // h
        System.out.println("Total Mahasiswa: " + seminar.countMahasiswa());
        System.out.println();

        // i. set wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // j. tampil data mahasiswa
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}