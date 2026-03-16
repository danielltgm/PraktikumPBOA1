/*
 * Nama File   : Mahasiswa.java
 * Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 05/03/2026 15.16 PM
 */

import java.util.ArrayList;

public class Mahasiswa {

    /*************** ATRIBUT *****************/
    private String nim; // Atribut yang merepresentasikan NIM mahasiswa
    private String nama; // Atribut yang merepresentasikan nama mahasiswa
    private String prodi; // Atribut yang merepresentasikan program studi mahasiswa
    private ArrayList<MataKuliah> listMatKul; // Atribut yang menyimpan daftar mata kuliah
    private Dosen dosenWali; // Atribut yang merepresentasikan dosen wali mahasiswa
    private Kendaraan kendaraan; // Atribut yang merepresentasikan kendaraan mahasiswa

    // Konstruktor tanpa parameter
    public Mahasiswa(){
        listMatKul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatKul = new ArrayList<>();
    }

    /*************** GETTER *****************/
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    /*************** SETTER *****************/
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    /*************** METHOD *****************/

    // Menambahkan mata kuliah
    public void addMatKul(MataKuliah matkul){
        listMatKul.add(matkul);
    }

    // Menghitung total SKS
    public int getJumlahSKS(){
        int total = 0;

        for(MataKuliah mk : listMatKul){
            total += mk.getSKS();
        }

        return total;
    }

    // Menghitung jumlah mata kuliah
    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    // Menampilkan data mahasiswa
    public void printMhs(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // Menampilkan detail mahasiswa
    public void printDetailMhs(){
        printMhs();

        System.out.println("\nDaftar Mata Kuliah:");
        for(MataKuliah mk : listMatKul){
            mk.printDetail();
        }

        System.out.println("\nDosen Wali:");
        dosenWali.printDetail();

        System.out.println("\nKendaraan:");
        kendaraan.printDetail();

        System.out.println("\nTotal SKS : " + getJumlahSKS());
    }

}