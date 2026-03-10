package latihan.latihan3;

public class Main {
    public static void main(String[] args) {

        BangunRuang bangunRuang = new BangunRuang();

        System.out.println("===SISI1 BANGUN RUANG===");
        bangunRuang.setSisi(25);
        System.out.println(bangunRuang.getSisi());
        
        System.out.println("===SISI2 BANGUN RUANG===");
        bangunRuang.alas = 27;
        System.out.println(bangunRuang.alas);

        System.out.println("===PANJANG BANGUN RUANG===");
        bangunRuang.setPanjang(5);
        System.out.println(bangunRuang.getPanjang());


    }
}