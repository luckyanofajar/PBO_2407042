package latihan.tugas_oop_bangun_datar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        System.out.println("===KALKULATOR BANGUN DATAR===");
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.print("Masukkan pilihan (1-4): ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                persegi persegi1 = new persegi("PERSEGI", sisi);
                System.out.println("Luas Persegi: " + persegi1.hitungLuas());
                System.out.println("Keliling Persegi: " + persegi1.hitungKeliling());
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                persegiPanjang pp = new persegiPanjang(panjang, lebar);
                System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
                System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                lingkaran lingkaran1 = new lingkaran(jariJari);
                System.out.println("Luas Lingkaran: " + lingkaran1.hitungLuas());
                System.out.println("Keliling Lingkaran: " + lingkaran1.hitungKeliling());
                break;
            case 4:
                System.out.print("Masukkan alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = scanner.nextDouble();
                System.out.print("Masukkan sisi 1 segitiga: ");
                double sisi1 = scanner.nextDouble();
                System.out.print("Masukkan sisi 2 segitiga: ");
                double sisi2 = scanner.nextDouble();
                System.out.print("Masukkan sisi 3 segitiga: ");
                double sisi3 = scanner.nextDouble();
                segiTiga segitiga1 = new segiTiga(alas, tinggi, sisi1, sisi2, sisi3);
                System.out.println("Luas Segitiga: " + segitiga1.hitungLuas());
                System.out.println("Keliling Segitiga: " + segitiga1.hitungKeliling());
                break;    
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
}