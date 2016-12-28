/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class PegawaiMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        
        Pegawai ga=new Pegawai();
        
        
        System.out.println("Pegawai \n");
        System.out.print("NIP             : ");
        String nip=z.next();
        System.out.print("Nama            : ");
        String nama=z.next();
        System.out.print("Gaji");
        //Pegawai ga=new Pegawai(nip,nama);

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