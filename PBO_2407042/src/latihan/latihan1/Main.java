package latihan.latihan1;

// ini adalah class cuy
class Cafe {

    // Attribute (Encapsulation)
    private String nama;
    private String alamat;

    // Constructor
    public Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method
    public void buka() {
        System.out.println("Cafe " + nama + " di " + alamat + " sedang buka ☕");
    }
}

// ini adalah main
public class Main {

    public static void main(String[] args) {

        // Membuat object dari class Cafe
        Cafe cafe1 = new Cafe("Janji Jiwa", "Indramayu");

        // Menampilkan data awal
        System.out.println("Nama Cafe   : " + cafe1.getNama());
        System.out.println("Alamat Cafe : " + cafe1.getAlamat());

        System.out.println();

        // Mengubah nama cafe
        cafe1.setNama("Kopi Kenangan");

        // Menjalankan method
        cafe1.buka();
    }
}