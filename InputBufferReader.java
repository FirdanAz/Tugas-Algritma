package Usm.TugasAlgoritma.Tugas5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferReader {
    public static void main(String[] args) {
        try {
            double jariJari, tinggi;
            double phi;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Menghitung Luas Lingkaran dan Volume Tabung");
            System.out.print("Masukkan JariJari : ");
            jariJari = Double.parseDouble(reader.readLine());
            System.out.print("Masukkan Tinggi : ");
            tinggi = Double.parseDouble(reader.readLine());

            if (jariJari % 7 ==0){
                phi = 22.0/7.0;
            } else {
                phi = 3.14;
            }

            // Menampilkan Hasil
            double luasLingkaran = phi * jariJari * jariJari;
            double volumeSilinder = phi * jariJari * jariJari * tinggi;
            System.out.println("Hasil Luas Lingkaran : "+ luasLingkaran);
            System.out.println("Hasil Volume Silinder : " + volumeSilinder);
        } catch (IOException e) {
            e.printStackTrace();  // Menangani kesalahan input/output
        }
    }

}
