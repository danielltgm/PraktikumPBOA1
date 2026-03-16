/*
 * Nama File   : Kendaraan.java
 * Deskripsi   : berisi atribut dan method dalam class Kendaraan
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 05/03/2026 - 12.18 PM
 */

public class Kendaraan {
    
    /*************** ATRIBUT *****************/
    private String jenis; // Atribut yang merepresentasikan jenis dari sebuah kendaraan
    private String noPlat; // Atribut yang merepresentasikan platnomor dari sebuah kendaraan

    // Konstruktor tanpa parameter
    public Kendaraan(){

    }

    // Konstruktor dengan parameter
    public Kendaraan(String jenis, String noPlat){
        this.jenis = jenis;
        this.noPlat = noPlat;
    }

    // Getter
    public String getJenis(){
        return jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    // Setter
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // METHOD YANG DIGUNAKAN
        // METHOD CETAK 
    public void printDetail(){
    System.out.println("Jenis : " + jenis);
    System.out.println("NoPlat : " + noPlat);
    }

}
