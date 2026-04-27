/* Nama File : Dosen.java
Deskripsi : Subclass Civitas Akademika yang merepresentasikan data dosen dengan identitas NIP
Pembuat : Daniel Lamganda Tua Gultom - 24060124120048
Tanggal : 25 April 2026 - 01.46
*/

public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}