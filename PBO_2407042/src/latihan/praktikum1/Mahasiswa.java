package latihan.praktikum1;

public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private String kelas;
    private double ipk;
    
    // Constructor default
    public Mahasiswa() {
        this.nama = "Belum diisi";
        this.nim = "0000000";
        this.kelas = "Belum diisi";
        this.ipk = 0.0;
    }
    
    // Constructor dengan parameter
    public Mahasiswa(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public double getIpk() {
        return ipk;
    }
    
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    // Method 1: Belajar
    public void belajar() {
        System.out.println(nama + " sedang belajar dengan giat");
    }
    
    // Method 2: Mengerjakan tugas
    public void tugas() {
        System.out.println(nama + " sedang mengerjakan tugas PBO");
    }
    
    // Method 3: Ujian
    public void ujian() {
        System.out.println(nama + " sedang mengikuti ujian semester");
    }
    
    // Method 4: Tampilkan data lengkap
    public void tampilkanData() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║      DATA MAHASISWA            ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ Nama  : " + String.format("%-22s", nama) + "║");
        System.out.println("║ NIM   : " + String.format("%-22s", nim) + "║");
        System.out.println("║ Kelas : " + String.format("%-22s", kelas) + "║");
        System.out.println("║ IPK   : " + String.format("%-22.2f", ipk) + "║");
        System.out.println("╚════════════════════════════════╝");
    }
    
    // Method 5: Cek status kelulusan
    public String cekKelulusan() {
        if (ipk >= 3.0) {
            return "Lulus dengan prestasi baik";
        } else if (ipk >= 2.0) {
            return "Lulus";
        } else {
            return "Tidak lulus";
        }
    }
}