public class MGaris {

    public static void main(String[] args) {

        // Assign dulu banyak titik
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Titik C = new Titik(1, 1);
        Titik D = new Titik(3, 5);

        // Dengan 4 Titik (A,B,C,D) ---> Assign 2 Garis G1(A,B) dan G2(C,D)
        Garis G1 = new Garis(A, B);
        Garis G2 = new Garis(C, D);

        System.out.println("=== Garis G1 ===");
        G1.printGaris();
        System.out.println("Panjang: " + G1.getPanjang());
        System.out.println("Gradien: " + G1.getGradien());
        System.out.print("Titik Tengah: ");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan: " + G1.getPersamaan());

        System.out.println("\n=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Gradien: " + G2.getGradien());

        System.out.println("\nApakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("\nJumlah objek Garis = " + Garis.getCounterGaris());
    }
}