/* Nama File    : MAnabul.java
 * Deskripsi    : Main program mengilustrasikan konsep generik (Datum, OperatorGenerik, Bobot2, Data) pada keluarga kelas Anabul.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 27 April 2026
*/

public class MAnabul {
    public static void main(String[] args) {

        Anggora a1 = new Anggora("Cici", 4.6);
        Kembangtelon k1 = new Kembangtelon("Miko", 5.1);

        Datum<Anabul> d1 = new Datum<>(a1);
        Datum<Anabul> d2 = new Datum<>(k1);

        d1.getIsi().bersuara();
        d2.getIsi().bersuara();

        d1.setIsi(k1);
        d1.getIsi().gerak();

        OperatorGenerik.Wrapper<Integer> i1 = new OperatorGenerik.Wrapper<>(3);
        OperatorGenerik.Wrapper<Integer> i2 = new OperatorGenerik.Wrapper<>(6);
        OperatorGenerik.Tukar(i1, i2);
        System.out.println(i1.value + " " + i2.value);

        OperatorGenerik.Wrapper<String> s1 = new OperatorGenerik.Wrapper<>("A");
        OperatorGenerik.Wrapper<String> s2 = new OperatorGenerik.Wrapper<>("B");
        OperatorGenerik.Tukar(s1, s2);
        System.out.println(s1.value + " " + s2.value);

        OperatorGenerik.Wrapper<Anabul> x = new OperatorGenerik.Wrapper<>(new Kucing("Jenggot", 2.5));
        OperatorGenerik.Wrapper<Anabul> y = new OperatorGenerik.Wrapper<>(new Anjing("Bobby"));
        OperatorGenerik.Tukar(x, y);
        System.out.println(x.value.nama + " " + y.value.nama);

        Anggora k2 = new Anggora("Kumis", 3.3);
        Kembangtelon k3 = new Kembangtelon("Gultom", 3.9);
        System.out.println(OperatorGenerik.Bobot2(k2, k3));

        Data<Anabul> data = new Data<>();

        data.setIsi(1, new Kucing("Pitty", 2.0));
        data.setIsi(2, new Anjing("Oma"));
        data.setIsi(3, new Burung("Mitty"));
        
        for (int i = 1; i <= data.getSize(); i++) {
            Anabul a = data.getIsi(i);
            System.out.println(a.nama);
        }

        System.out.println(data.getSize());
    }
}

//Renungan
//Konsep generik memungkinkan satu kelas atau metode digunakan untuk berbagai 
// tipe data tanpa perlu menulis ulang kode yang sama. Dengan parameter tipe seperti <T>, 
// tipe data bisa ditentukan saat digunakan, sehingga lebih fleksibel dan tetap aman 
// karena dicek saat compile-time.