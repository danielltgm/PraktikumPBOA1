/* Nama File : CivitasAkademika.java
Deskripsi : Superclass Civitas Akademika yang menyimpan atribut nama dan method dasar identity
Pembuat : Daniel Lamganda Tua Gultom - 24060124120048
Tanggal : 25 April 2026 - 01.23
*/

public class CivitasAkademika {
    protected String Nama;

    public CivitasAkademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNomor() {
        return ""; 
    }

    public String getNama() {
        return this.Nama;
    }
}