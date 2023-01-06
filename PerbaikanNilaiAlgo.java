/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perbaikannilaialgo;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PerbaikanNilaiAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);

        String jurusan = null;

        System.out.print("Masukan NIM : ");
        String nama = masukan.nextLine();

        System.out.println();

        System.out.print("Masukan NAMA : ");
        String nim = masukan.nextLine();

        System.out.println();

        String[] codes = nim.split("\\.");

        int tahun = Integer.parseInt(codes[0]);
        String tahunAjaran = "20" + tahun + " - 20" + (tahun + 1);

        System.out.println("Tahun Ajaran = " + tahunAjaran);

        switch (codes[1]) {
            case "31" -> jurusan = "D3 - Sistem Informasi";
            case "51" -> jurusan = "S1 - Sistem Informasi";
            case "52" -> jurusan = "S1 - Teknologi Informasi";
            default -> throw new Exception("Jurusan tidak ditemukan");
        }

        System.out.println("Jurusan - " + jurusan);
        System.out.println("No urut masuk = " + codes[2]);

    }
    
}
