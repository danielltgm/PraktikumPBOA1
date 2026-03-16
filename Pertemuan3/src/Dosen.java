/*
 * Nama File   : Dosen.java
 * Deskripsi   : berisi atribut dan method dalam class Dosen
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 05/03/2026 - 13.11 PM
 */

public class Dosen {

    /*************** ATRIBUT *****************/
    private String nip;   // Atribut yang merepresentasikan NIP dari seorang dosen
    private String nama;  // Atribut yang merepresentasikan nama dosen
    private String prodi; // Atribut yang merepresentasikan program studi dosen

    // Konstruktor tanpa parameter
    public Dosen(){

    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter
    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    // Setter
    public void setNIP(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    /*************** METHOD *****************/
    // METHOD CETAK
    public void printDetail(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

}