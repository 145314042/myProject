/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayObj;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class PerusahaanMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        Pegawai ga;
        System.out.print("Kode Perusahaan : ");
        String code=z.next();
        System.out.print("Nama Perusahaan : ");
        String namap=z.next();
        
        Perusahaan pr=new Perusahaan(code,namap);
        
        System.out.print("NIP Kepala Perusahaan  : ");
        String nip=z.next();
        System.out.print("Nama Kepala Perusahaan : ");
        String nama=z.next();
        System.out.print("Gaji Pokok      : ");
        double gaji=z.nextDouble();
        
        if (nama.equals("-"))ga=new Pegawai(nip);
        else if (nip.equals("-"))ga=new Pegawai();
        else if (!"-".equals(nip)&&!"-".equals(nama)&&gaji==1000000)ga=new Pegawai(nip,nama);
        else ga=new Pegawai(nip,nama,gaji);
        
        System.out.print("Jam Lembur      : ");
        ga.setJam_lembur(z.nextDouble());
        System.out.print("Jumlah Anak     : ");
        ga.setJumlah_anak(z.nextInt());
        ga.gajiLembur();
        ga.tunjangan();
    
        System.out.println("Data");
        System.out.println("ID : "+pr.getKodePerusahaan());
        System.out.println("Nama Perusahaan : "+pr.getNamaPerusahaan());
        System.out.println("NIP Kepala Perusahaan : "+ga.getNIP());
        System.out.println("Nama Kepala Perusahaan : "+ga.getNama());
        System.out.println("TOTAL GAJI = "+ga.gajiTotal());  
    }
}





//        System.out.println("NIP Kepawal Perusahaan : "+pr.getKepalaPerusahaan().getNIP());
//        System.out.println("Nama Kepawal Perusahaan : "+pr.getKepalaPerusahaan().getNama());