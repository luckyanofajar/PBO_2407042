package latihan.tugas_oop_bangun_datar;

public class persegi extends bangunDatar {
    private double sisi;

    public persegi(String nama, double sisi) {
        super("PERSEGI");
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
    
}
