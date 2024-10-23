package Usm.TugasAlgoritma.Tugas5;
/*
Nama : Muhammad Firdan Azhari
NIM : G.111.24.0033
Prodi : Sistem Informasi
*/

import java.util.Scanner;

public class ProgramKonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            konversiSuhu(scanner);
            System.out.print("Apakah Anda ingin mencoba program ini lagi? (ya/tidak): ");
            ulangi = scanner.next().toUpperCase();

        } while (ulangi.equalsIgnoreCase("YA"));

        System.out.println("===== Selesai =====");
        scanner.close();
    }

    private static void konversiSuhu(Scanner scanner) {
        System.out.print("Masukkan nilai suhu dalam Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;
        double reamur = celcius * 4/5;

        System.out.println("Hasil konversi ke Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Hasil konversi ke Reamur: " + reamur + "°Ré");
    }
 }
