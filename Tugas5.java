package Usm.TugasAlgoritma.Tugas5;
/*
Nama : Muhammad Firdan Azhari
NIM : G.111.24.0033
*/

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        final int HARGA_PER_KG = 3500;

        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.print("Masukkan berat pakaian (dalam Kg): ");
            double berat = scanner.nextDouble();

            double beratSetelahPotongan = berat;
            if (berat >= 5 && berat < 10) {
                beratSetelahPotongan = berat - 2;
            } else if (berat >= 10) {
                beratSetelahPotongan = berat - 4;
            }

            double biaya = beratSetelahPotongan * HARGA_PER_KG;

            System.out.println("Berat pakaian: " + berat + " Kg");
            System.out.println("Berat setelah potongan: " + beratSetelahPotongan + " Kg");
            System.out.println("Biaya laundry yang harus dibayar: Rp. " + biaya);

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            ulangi = scanner.next();

        } while (ulangi.equalsIgnoreCase("ya"));

        System.out.println("=====Terima kasih telah menggunakan program ini.=====");
        scanner.close();
    }
}
