package latihan.latihan6;

public abstract class BangunDatar {
    protected String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void tampilkanHasil() {
        System.out.println("Nama Bangun Datar : " + nama);
        System.out.println("Luas              : " + hitungLuas());
        System.out.println("Keliling          : " + hitungKeliling());
    }
}
