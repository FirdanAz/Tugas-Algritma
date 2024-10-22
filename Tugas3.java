package Usm.TugasAlgoritma.Tugas5;
/*
Nama : Muhammad Firdan Azhari
NIM : G.111.24.0033
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.stream.Collectors;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        List<SaluranModel> saluranModels = new ArrayList<>();

        saluranModels.add(new SaluranModel("A", "TVRI"));
        saluranModels.add(new SaluranModel("B", "RCTI"));
        saluranModels.add(new SaluranModel("C", "SCTV"));
        saluranModels.add(new SaluranModel("D", "ANTV"));
        saluranModels.add(new SaluranModel("E", "TRANS TV"));
        saluranModels.add(new SaluranModel("F", "METRO TV"));

        for (SaluranModel saluranModel : saluranModels) {
            System.out.print("* " + saluranModel.getSaluran());
        }


        do {
            System.out.print("Masukkan huruf saluran TV (A-F): ");
            String inputSaluran = scanner.next().toUpperCase();

            List<SaluranModel> hasilFilter = saluranModels.stream()
                    .filter(saluran -> saluran.getSaluran().equalsIgnoreCase(inputSaluran))
                    .collect(Collectors.toList());

            if (!hasilFilter.isEmpty()) {
                SaluranModel saluran = hasilFilter.get(0);
                System.out.println("Saluran TV: " + saluran.getSaluran() + " Adalah " + saluran.getNamaSaluran());
            } else {
                System.out.println("Saluran tidak ditemukan. Coba masukkan huruf antara A-F.");
            }

            System.out.print("Apakah Anda ingin mencoba lagi? (ya/tidak): ");
            ulangi = scanner.next();

        } while (ulangi.equalsIgnoreCase("ya"));

        System.out.println("=====Terima kasih telah menggunakan program ini.=====");
        scanner.close();
    }
}

class SaluranModel {
    private final String saluran;
    private final String namaSaluran;

    SaluranModel(String saluran, String namaSaluran) {
        this.saluran = saluran;
        this.namaSaluran = namaSaluran;
    }

    public String getSaluran() {
        return saluran;
    }

    public String getNamaSaluran() {
        return namaSaluran;
    }
}
