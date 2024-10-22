package Usm.TugasAlgoritma.Tugas5;
/*
Nama : Muhammad Firdan Azhari
NIM : G.111.24.0033
*/

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            if (angka1 > angka2) {
                System.out.println(angka1 + " lebih besar dari " + angka2);
            } else if (angka2 > angka1) {
                System.out.println(angka2 + " lebih besar dari " + angka1);
            } else {
                System.out.println(angka1 + " dan " + angka2 + " adalah sama.");
            }

            System.out.print("Apakah Anda ingin mencoba lagi? (ya/tidak): ");
            ulangi = scanner.next();

        } while (ulangi.equalsIgnoreCase("ya"));

        System.out.println("=====Selesai.=====");
        scanner.close();
    }
}
