package latihan.tugas_oop_bangun_datar;

public abstract class bangunDatar {
    protected String nama;

    public bangunDatar(String nama) {
        this.nama = nama;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void tampilkanHasil() {
        System.out.println("==============================");
        System.out.println("Nama Bangun Datar: " + nama);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
    
}
