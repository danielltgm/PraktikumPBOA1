/* Nama File    : Mahasiswa.java
 * Deskripsi    : Class Mahasiswa dengan konstruktor default, parameter, dan clone serta overloading setProgramStudi.
 * Pembuat      : Daniel Lamganda Tua Gultom
 * Tanggal      : 24 April 2026 - 23.49
 */

public class Mahasiswa {
    // Atribut
    String NIM;
    String Nama;
    String ProgramStudi;
    
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // Konstruktor dengan 3 parameter
    public Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = Prodi;
    }

    // Konstruktor cloning
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    // Overloading Method setProgramStudi

    // Varian 1: tanpa parameter
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // Varian 2: parameter String
    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    // Varian 3: parameter objek Mahasiswa
    public void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.ProgramStudi;
    }

    // Method bantu untuk menampilkan data
    public void display() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
        System.out.println();
    }
}