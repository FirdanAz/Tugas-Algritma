package Usm.TugasAlgoritma.Tugas5;

import java.util.Scanner;

/*
Nama : Muhammad Firdan Azhari
NIM : G.111.24.0033
*/

public class TugasTabelLingkaranSilinder {

    public static void main(String[] args) {

        int[] jariJariArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] tinggiArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.println("====TABEL LUAS LINGKARAN DAN VOLUME SILINDER====");
        System.out.printf("%-5s %-10s %-10s %-10s %-15s%n", "NO", "JARI-JARI", "TINGGI", "LUAS", "VOLUME SILINDER\n------------------------------------------------------");

        for (int i = 0; i < jariJariArray.length; i++) {
            double luas = hitungLuasLingkaran(jariJariArray[i]);
            double volume = hitungVolumeSilinder(jariJariArray[i], tinggiArray[i]);

            System.out.printf("%-5d %-10d %-10d %-10.2f %-15.2f%n", (i + 1), jariJariArray[i], tinggiArray[i], luas, volume);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Akan Melihat Lagi (Y/T)? ");
        String pilihan = scanner.nextLine();

        if (pilihan.equalsIgnoreCase("Y")) {
            main(args);
        } else {
            System.out.println("Terima kasih!");
        }
    }

    public static double hitungLuasLingkaran(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double hitungVolumeSilinder(int radius, int height) {
        return hitungLuasLingkaran(radius) * height;
    }

}
