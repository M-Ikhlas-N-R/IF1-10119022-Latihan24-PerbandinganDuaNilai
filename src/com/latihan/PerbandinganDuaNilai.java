package com.latihan;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program perbandingan dua buah nilai Latihan 24
 */

public class PerbandinganDuaNilai {
    public static void main(String[] args) throws IOException {
        // deklarasi variabel
        boolean statusUlangi = true;
        int nilai1, nilai2;
        String  ulangi;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        System.out.println("========Program Perbandingan Nilai========");
        while (statusUlangi) {
            // Input memasukkan kedua buah nilai
            System.out.print("Masukkan Nilai Pertama : ");
            nilai1 = keyboard.nextInt();

            System.out.print("Masukkan Nilai Kedua : ");
            nilai2 = keyboard.nextInt();

            // output hasil perbandingan
            if(nilai1 > nilai2) System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
            if(nilai2 > nilai1) System.out.println("Hasil : " + nilai2 + " Lebih besar dari " + nilai1);

            // input ulangi aktifitas
            System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = br.readLine();
            System.out.println("\n");
            ulangi = ulangi.toLowerCase();
            statusUlangi = ulangi.equals("ya");
        }

    }
}
