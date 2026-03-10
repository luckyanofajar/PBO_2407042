package latihan.tugas_oop_bangun_datar;

public class lingkaran extends bangunDatar {
    private double jariJari;

    public lingkaran(double jariJari) {
        super("LINGKARAN");
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
    
}
