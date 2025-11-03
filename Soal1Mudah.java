/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal.mudah;

/**
 *
 * @author Faiq
 */
import java.util.Scanner;
public class Soal1Mudah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double tarifPerKg;
        if (jarak <= 10) {
            tarifPerKg = 4250;
        } else {
            tarifPerKg = 6000;
        }

        double biayaBerat = berat * tarifPerKg;

        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        double totalBiaya = biayaBerat + biayaVolume;

        System.out.println("\n===== RINCIAN BIAYA PENGIRIMAN =====");
        System.out.println("Berat paket: " + berat + " kg");
        System.out.println("Jarak tempuh: " + jarak + " km");
        System.out.println("Volume paket: " + volume + " cm^3");
        System.out.println("Biaya berdasarkan berat: Rp " + biayaBerat);
        System.out.println("Biaya tambahan volume: Rp " + biayaVolume);
        System.out.println("------------------------------------");
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);

        

    }
}
