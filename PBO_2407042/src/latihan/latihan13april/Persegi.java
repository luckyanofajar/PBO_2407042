package latihan.latihan13april;

public class Persegi extends BangunDatar {
    
    // Constructor: Panggil constructor induk yang 1 parameter
    // Karena persegi cuma butuh 1 sisi (varA = sisi)
    public Persegi(double sisi) {
        super(sisi); // super() panggil constructor BangunDatar(double varA)
    }

    // OVERRIDE method hitungLuas
    @Override
    public double hitungLuas() {
        // Rumus persegi: sisi × sisi = varA × varA
        return getVarA() * getVarA();
    }

    // OVERRIDE method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
        System.out.println();
    }
}