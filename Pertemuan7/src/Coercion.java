/* Nama File    : Coercion.java
 * Deskripsi    : Konversi tipe data, yaitu parsing, castin, dan konversi ke string
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 24 April 2026 - 21.58
 */

public class Coercion {
    public static void main(String[] args) {
        // Konversi int ke char dan double 
        int exampleValueA = 65;
        System.out.println("Konversi " + exampleValueA + " menjadi char : " + (char) exampleValueA);
        System.out.println("Konversi " + exampleValueA + " menjadi double : " + (double) exampleValueA);

        // parseInt, parseDouble, dan toString 
        double exampleValueB = (double) exampleValueA;

        // b. double ke int (casting)
        int doubleToInt = (int) exampleValueB;
        System.out.println("Konversi double ke int : " + doubleToInt);

        // c. String X dan Y
        String X = "1234";
        String Y = "5678";

        // konkatenasi
        String S = X + Y; 
        // penjumlahan
        int Z = Integer.parseInt(X) + Integer.parseInt(Y); 

        System.out.println("S (konkatenasi) : " + S);
        System.out.println("Z (penjumlahan) : " + Z);

        // d. String P dan Q (double)
        String P = "12.34";
        String Q = "56.78";

        // konkatenasi
        String R = P + Q; 
        // penjumlahan
        double D = Double.parseDouble(P) + Double.parseDouble(Q); 

        System.out.println("R (konkatenasi) : " + R);
        System.out.println("D (penjumlahan) : " + D);

        // e. Konversi S ke Integer A
        Integer A = Integer.parseInt(S);
        System.out.println("A (Integer dari S) : " + A);

        // f. Konversi A ke String T
        String T = A.toString();
        System.out.println("T (String dari A) : " + T);
    }
}