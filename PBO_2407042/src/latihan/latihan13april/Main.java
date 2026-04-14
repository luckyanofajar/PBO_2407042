package latihan.latihan13april;

public class Main {
    public static void main(String[] args) {
        // a. POLYMORPHISM: Satu tipe referensi (BangunDatar) 
        // bisa nyimpen objek beda jenis!
        
        // Array tipe BangunDatar, isinya objek-objek berbeda
        BangunDatar[] daftarBangun = new BangunDatar[3];
        
        // Isi array dengan objek berbeda
        daftarBangun[0] = new Persegi(5);                    // Sisi 5
        daftarBangun[1] = new PersegiPanjang(4, 6);         // Panjang 4, Lebar 6
        daftarBangun[2] = new Segitiga(3, 8);               // Alas 3, Tinggi 8
        
        // Tampilkan semua dengan 1 loop (keren kan!)
        System.out.println(" TUGAS 13 APRIL \n");
        
        for (BangunDatar bangun : daftarBangun) {
            // Method yang dipanggil otomatis sesuai objek aslinya!
            // Ini yang namanya DYNAMIC METHOD DISPATCH
            bangun.tampilkan();
        }
        
        // Atau bisa juga satu-satu kaya gini:
        System.out.println("--- Contoh Akses Satuan ---");
        BangunDatar p = new Persegi(10);
        System.out.println("Luas persegi dengan sisi 10: " + p.hitungLuas());
    }
}