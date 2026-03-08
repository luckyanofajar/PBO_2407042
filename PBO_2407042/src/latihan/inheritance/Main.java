package latihan.inheritance;

public class Main {

    public static void main(String[] args) {

        PersegiPanjang pp = new PersegiPanjang(10, 5);

        System.out.println("Luas Persegi Panjang : " + pp.luas());
        System.out.println("Keliling Persegi Panjang : " + pp.keliling());
    }
}