package latihan.latihan13april;

public class BangunDatar {
    // a. ENCAPSULATION: atribut private biar kaga diakses sembarangan
    private double varA;
    private double varB;

    // b.constructor overloading (sama nama, beda parameter)
    
    // Constructor 1: 2 parameter (buat Persegi Panjang, Segitiga)
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 2: 1 parameter (buat Persegi - sisi sama)
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = varA; // Persegi kan sisi A = sisi B, jadi disamain
    }

    // Getter & Setter (wajib ada ini karena private)
    public double getVarA() {
        return varA;
    }

    public void setVarA(double varA) {
        this.varA = varA;
    }

    public double getVarB() {
        return varB;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    // c. Method hitungLuas default return 0
    // Method ini bakal di-OVERRIDE sama class anak
    public double hitungLuas() {
        return 0;
    }

    // d. Method tampilkan (bakal di-override juga)
    public void tampilkan() {
        System.out.println("Ini adalah bangun datar");
    }
}
