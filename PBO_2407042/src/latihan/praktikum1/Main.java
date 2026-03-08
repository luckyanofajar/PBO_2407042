package latihan.praktikum1;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   PRAKTIKUM OOP - CLASS & OBJECT       ║");
        System.out.println("║   NIM: 2407042                         ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // Objek 1: Menggunakan constructor dengan parameter
        System.out.println(">>> OBJEK 1: Constructor dengan Parameter");
        Mahasiswa mhs1 = new Mahasiswa("Lucyanofajarna", "2407042", "SIKC-2B", 3.95);
        mhs1.tampilkanData();
        mhs1.belajar();
        mhs1.tugas();
        System.out.println("Status: " + mhs1.cekKelulusan());
        
        System.out.println("\n" + "═".repeat(50) + "\n");
        
        // Objek 2: Menggunakan constructor default + setter
        System.out.println(">>> OBJEK 2: Constructor Default + Setter");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Budi");
        mhs2.setNim("2407050");
        mhs2.setKelas("TI-2B");
        mhs2.setIpk(2.85);
        
        mhs2.tampilkanData();
        mhs2.ujian();
        System.out.println("Status: " + mhs2.cekKelulusan());
        
        System.out.println("\n" + "═".repeat(50) + "\n");
        
        // Objek 3: Mahasiswa dengan IPK rendah
        System.out.println(">>> OBJEK 3: Mahasiswa IPK Rendah");
        Mahasiswa mhs3 = new Mahasiswa(" Wisnu ", "2407060", "TI-2A", 1.95);
        mhs3.tampilkanData();
        mhs3.belajar();
        System.out.println("Status: " + mhs3.cekKelulusan());
        
        System.out.println("\n" + "═".repeat(50));
        System.out.println("Praktikum selesai!");
    }
}