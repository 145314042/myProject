/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class GajiMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        Gaji ga=new Gaji();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Pegawai "+(i+1)+"\n");
            System.out.print("NIP             : ");
            ga.setNIP(z.next());
            System.out.print("Nama            : ");
            ga.setNama(z.next());
            System.out.print("Gaji Pokok      : ");
            ga.setGaji_pokok(z.nextDouble());
            System.out.print("Jam Lembur      : ");
            ga.setJam_lembur(z.nextDouble());
            System.out.print("Jumlah Anak     : ");
            ga.setJumlah_anak(z.nextInt());
            ga.gajiLembur();
            ga.tunjangan();
            System.out.println("TOTAL GAJI = "+ga.gajiTotal());
        }
    }
}