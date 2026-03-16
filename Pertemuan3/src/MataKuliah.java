/*
 * Nama File   : MataKuliah.java
 * Deskripsi   : berisi atribut dan method dalam class MataKuliah
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 04/03/2026 - 5.47 PM
 */

public class MataKuliah {
    
    //Atribut
    private String idMatKul; //Atribut yang merepresentasikan kode MataKuliah
    private String nama; //Atribut yang merepresentasikan nama MataKuliah
    private int sks; //Atribut yang merepresentasikan sks dari suatu MataKuliah

    //Konstruktor tanpa parameter
    public MataKuliah(){

    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //Getter
    public String getIDMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    //Setter
    public void setIDMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }

    //Method
    public void printDetail(){
        System.out.println("IDMatKul : " + idMatKul);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
    }
}
