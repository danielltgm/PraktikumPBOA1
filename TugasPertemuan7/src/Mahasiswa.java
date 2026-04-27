/* Nama File : Mahasiswa.java
Deskripsi :Subclass Civitas Akademika yang merepresentasikan data mahasiswa dan dosen wali
Pembuat : Daniel Lamganda Tua Gultom - 24060124120048
Tanggal : 25 April 2026 - 07.18
*/

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
        this.dosenWali = null;
    }

    @Override
    public String getNomor() {
        return this.NIM;
    }

    // i. setWali
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    // j. tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali : Belum ada");
        }
        System.out.println();
    }
}