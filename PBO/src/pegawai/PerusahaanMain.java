/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class PerusahaanMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        //Pegawai ga;
        System.out.print("Kode Perusahaan : ");
        String code=z.next();
        System.out.print("Nama Perusahaan : ");
        String namap=z.next();
        
        Perusahaan pr=new Perusahaan(code,namap);
        
        System.out.print("Nama Kepala Perusahaan : ");
        String nama=z.next();
        System.out.print("NIP Kepala Perusahaan  : ");
        String nip=z.next();

        Pegawai ga=new Pegawai(nip,nama);
//        if (nama.equals(""))ga=new Pegawai(nip);
//        else if (nip.equals(""))ga=new Pegawai();
//        else (ga=new Pegawai(nip,name));
        

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
