package latihan.latihan13april;

public class PersegiPanjang extends BangunDatar {
    
    // Constructor: Panggil constructor induk yang 2 parameter
    // Persegi panjang butuh panjang dan lebar
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar); // Panggil BangunDatar(double varA, double varB)
    }

    @Override
    public double hitungLuas() {
        // Rumus: panjang × lebar = varA × varB
        return getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println();
    }
}
