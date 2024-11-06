package Usm.TugasAlgoritma.Tugas5;
/*
Nama : Muhammad Firdan Azhari
NIM : G.111.24.0033
*/

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.print("Masukkan bilangan bulat: ");
            int angka = scanner.nextInt();

            if (angka % 5 == 0) {
                System.out.println(angka + " : habis dibagi 5.");
            } else {
                System.out.println(angka + " : tidak habis dibagi 5.");
            }

            System.out.print("Apakah kamu ingin mencoba lagi? (ya/tidak): ");
            ulangi = scanner.next();

        } while (ulangi.equalsIgnoreCase("ya"));

        System.out.println("=====Selesai.=====");
        scanner.close();
    }
}
