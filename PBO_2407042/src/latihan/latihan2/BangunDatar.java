package latihan.latihan2;

import java.util.Scanner;

public class BangunDatar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih bangun (1-4): ");

        int pilih = input.nextInt();

        switch (pilih) {

            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();

                double luasPersegi = sisi * sisi;
                double kelilingPersegi = 4 * sisi;

                System.out.println("Luas Persegi = " + luasPersegi);
                System.out.println("Keliling Persegi = " + kelilingPersegi);
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                double luasPP = panjang * lebar;
                double kelilingPP = 2 * (panjang + lebar);

                System.out.println("Luas Persegi Panjang = " + luasPP);
                System.out.println("Keliling Persegi Panjang = " + kelilingPP);
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                double luasSegitiga = 0.5 * alas * tinggi;

                System.out.println("Luas Segitiga = " + luasSegitiga);
                break;

            case 4:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();

                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();

                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();

                double luasBelahKetupat = 0.5 * d1 * d2;
                double kelilingBelahKetupat = 4 * s;

                System.out.println("Luas Belah Ketupat = " + luasBelahKetupat);
                System.out.println("Keliling Belah Ketupat = " + kelilingBelahKetupat);
                break;

            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}