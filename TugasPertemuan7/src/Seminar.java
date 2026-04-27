/* Nama File : Seminar.java
Deskripsi : Class untuk kelola peserta seminar, registrasi, dan jumlah peserta
Pembuat : Daniel Lamganda Tua Gultom - 24060124120048
Tanggal : 25 April 2026 - 09.26
*/

public class Seminar {
    private CivitasAkademika[] daftarPeserta;
    private int banyakPeserta;

    public Seminar() {
        this.daftarPeserta = new CivitasAkademika[100];
        this.banyakPeserta = 0;
    }

    // d. registrasi (kontigu)
    public void registrasi(CivitasAkademika peserta) {
        if (banyakPeserta < 100) {
            daftarPeserta[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Peserta penuh!");
        }
    }

    // c. countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // h. countMahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (daftarPeserta[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }

    // g. tampilPeserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(daftarPeserta[i].getNomor() + " - " + daftarPeserta[i].getNama());
        }
        System.out.println();
    }
}