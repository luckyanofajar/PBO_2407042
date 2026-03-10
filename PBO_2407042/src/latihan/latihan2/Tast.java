package latihan.latihan2;

public class Tast {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(10);
        System.out.println("==== Persegi =====");
        System.out.println("Sisi Persegi: " + persegi1.getSisi());
        System.out.println("Keliling Persegi: " + persegi1.kelilingPersegi());
        System.out.println("==== Lingkaran =====");
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setJariJari(100);
        System.out.println("Jari-jari Lingkaran: " + lingkaran1.getJariJari());
        System.out.println("Luas Lingkaran: " + lingkaran1.luasLingkaran());
        System.out.println("==== Segitiga =====");
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Luas Segitiga: " + segitiga1.luasSegitiga());
    }
    
}
