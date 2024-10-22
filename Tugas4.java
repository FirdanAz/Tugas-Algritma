package Usm.TugasAlgoritma.Tugas5;
/*
Nama : Muhammad Firdan Azhari
NIM : G.111.24.0033
*/

import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        final int GAJI_PER_HARI = 75000;
        final int UPAH_LEMBUR_PER_HARI = 80000;
        final int HARI_KERJA_NORMAL = 5;

        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.print("Masukkan jumlah hari kerja karyawan dalam seminggu: ");
            int jumlahHariKerja = scanner.nextInt();

            int hariLembur = jumlahHariKerja > HARI_KERJA_NORMAL ? jumlahHariKerja - HARI_KERJA_NORMAL : 0;
            int hariKerja = Math.min(jumlahHariKerja, HARI_KERJA_NORMAL);

            int gajiNormal = hariKerja * GAJI_PER_HARI;
            int gajiLembur = hariLembur * UPAH_LEMBUR_PER_HARI;
            int gajiBersih = gajiNormal + gajiLembur;

            System.out.println("Jumlah hari kerja: " + jumlahHariKerja
                    + "\nJumlah hari lembur: " + hariLembur
                    + "\nGaji bersih yang diterima: Rp. " + gajiBersih);

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            ulangi = scanner.next();

        } while (ulangi.equalsIgnoreCase("ya"));

        System.out.println("=====Terima kasih telah menggunakan program ini.=====");
        scanner.close();
    }
}
