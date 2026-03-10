package latihan.latihan6;

public class persegi extends BangunDatar {
    private double sisi;

    public persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
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
