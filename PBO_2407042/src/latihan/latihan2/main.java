package latihan.latihan2;

//acsess modifer (public, private, protected)
class Persegi{
    private int sisi;

    public int getSisi() {
        return sisi*sisi;
    }
    public int kelilingPersegi(){
        return sisi+sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}

class Lingkaran{
    private int jariJari;

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    public double luasLingkaran(){
        return Math.PI * jariJari * jariJari;
    }
}
class Segitiga{
    private int alas;
    private int tinggi;
    public double luasSegitiga(){
        return 0.5 * alas * tinggi;
    }
}
public class main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(5);
        System.out.println("==== Persegi =====");
        System.out.println("Sisi Persegi: " + persegi1.getSisi());
        System.out.println("Keliling Persegi: " + persegi1.kelilingPersegi());
        System.out.println("==== Lingkaran =====");
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setJariJari(5);
        System.out.println("Jari-jari Lingkaran: " + lingkaran1.getJariJari());
        System.out.println("Luas Lingkaran: " + lingkaran1.luasLingkaran());
        System.out.println("==== Segitiga =====");
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Luas Segitiga: " + segitiga1.luasSegitiga());
        
    }
}

