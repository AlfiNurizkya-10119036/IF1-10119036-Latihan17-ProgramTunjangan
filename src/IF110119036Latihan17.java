/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Menentukan Tunjangan
 */

import java.util.Scanner;

public class IF110119036Latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Menikah;
        double GajiPokok, Tunjangan, TotalGaji;
        
        
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?: Rp. ");
        GajiPokok = input.nextDouble();
        input.nextLine();
        System.out.print("Status Anda? (Menikah/Belum) : " );
        Menikah = input.nextLine();
        
        Tunjangan=0.35 * GajiPokok;
        TotalGaji=GajiPokok + Tunjangan;
  
        
        System.out.println();
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok : Rp. " + GajiPokok);
        System.out.println("Tunjangan  : Rp. " + Tunjangan);
        System.out.println("Total Gaji : Rp. " + TotalGaji);
    }
    
}
