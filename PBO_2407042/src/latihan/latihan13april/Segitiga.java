package latihan.latihan13april;

public class Segitiga extends BangunDatar {
    
    // Constructor: Panggil constructor induk yang 2 parameter
    // Segitiga butuh alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi); // varA = alas, varB = tinggi
    }

    @Override
    public double hitungLuas() {
        // Rumus: ½ × alas × tinggi = 0.5 × varA × varB
        return 0.5 * getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println();
    }
}