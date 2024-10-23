package Usm.TugasAlgoritma.Tugas5;

import javax.swing.*;

public class JOptionsPane {
    public static void main(String[] args) {
        double jariJari, tinggi, phi;

        try {
            JOptionPane.showMessageDialog(null, "Menghitung Luas Lingkaran dan Volume Tabung");
            String inputJariJari = JOptionPane.showInputDialog("Masukkan Jari Jari");
            // Mengonversi input string menjadi double
            jariJari = Double.parseDouble(inputJariJari);

            String inputTinggi = JOptionPane.showInputDialog("Masukkan Tinggi");
            // Mengonversi input string menjadi double
            tinggi = Double.parseDouble(inputTinggi);

            if (jariJari % 7 ==0){
                phi = 22.0/7.0;
            } else {
                phi = 3.14;
            }

            // Menampilkan Hasil
            double luasLingkaran = phi * jariJari * jariJari;
            double volumeSilinder = phi * jariJari * jariJari * tinggi;

            String hasil = String.format("Luas Lingkaran: %.2f\nVolume Silinder: %.2f", luasLingkaran, volumeSilinder);
            JOptionPane.showMessageDialog(null, hasil);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Harap masukkan angka.");
        }
    }
}
