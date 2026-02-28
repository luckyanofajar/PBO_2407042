package latihan.latihan2;

import java.util.Scanner;

public class KalkulatorBangunDatar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih bangun (1-4): ");

        int pilih = input.nextInt();

        switch (pilih) {

            case 1: // Persegi
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();

                double luasPersegi = sisi * sisi;
                double kelilingPersegi = 4 * sisi;

                System.out.println("Luas = " + luasPersegi);
                System.out.println("Keliling = " + kelilingPersegi);
                break;

            case 2: // Persegi Panjang
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();

                double luasPP = p * l;
                double kelilingPP = 2 * (p + l);

                System.out.println("Luas = " + luasPP);
                System.out.println("Keliling = " + kelilingPP);
                break;

            case 3: // Segitiga
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                double luasSegitiga = 0.5 * alas * tinggi;

                System.out.println("Luas = " + luasSegitiga);
                break;

            case 4: // Belah Ketupat
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();

                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();

                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();

                double luasBK = 0.5 * d1 * d2;
                double kelilingBK = 4 * s;

                System.out.println("Luas = " + luasBK);
                System.out.println("Keliling = " + kelilingBK);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}

