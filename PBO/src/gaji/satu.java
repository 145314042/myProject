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
public class satu {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Jumlah pegawai : ");
        int n=z.nextInt();
        
        String nama[]=new String[n];
        String alamat[]=new String[n];
        int masuk[]=new int[n];
        int masa[]=new int[n];
        double gpokok[]=new double[n];
        double gtotal[]=new double[n];
        double tunjangan[]=new double[n];
                
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nama                 : ");
            nama[i]=z.next();
            System.out.print("Masukkan Alamat               : ");
            alamat[i]=z.next();
            System.out.print("Masukkan Tahun Masuk (yyyy)   : ");
            masuk[i]=z.nextInt();
            System.out.print("Masukkan Gaji Pokok           : ");
            gpokok[i]=z.nextInt();
            masa[i]=2015-masuk[i];
            System.out.println("");}
        
        for (int i = 0; i < n; i++) {
            if (masa[i]<5) tunjangan[i]=gpokok[i]*0.25;
            else if (5<=masa[i]&&masa[i]<10) tunjangan[i]=gpokok[i]*0.50;
            else if (10<=masa[i]&&masa[i]<20) tunjangan[i]=gpokok[i]*0.75;
            else if (masa[i]>=20) tunjangan[i]=gpokok[i]*1;
            else System.out.println("data salah");
            gtotal[i]=tunjangan[i]+gpokok[i];}
        
        System.out.println("Daftar Gaji Karyawan Perusahaan DIY (Do It Yourself)\n");
        System.out.println("No. Nama        Alamat      Thn Masuk       Gaji Pokok         Tunjangan        Gaji Total\n"
                +"-------------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+"   "+nama[i]+"\t"+alamat[i]+"\t"+masuk[i]+"\t"+(int)gpokok[i]+"\t"+(int)tunjangan[i]+"\t"+(int)gtotal[i]+"\n");
//            System.out.printf("%2d",i+1);System.out.print("  ");
//            System.out.printf("%12s",nama[i]);
//            System.out.printf("%12s",alamat[i]);
//            System.out.printf("%16d",masuk[i]);
//            System.out.printf("%19d",gpokok[i]);
//            System.out.printf("%17d",tunjangan[i]);
//            System.out.printf("%10d",gtotal[i]);
        }
        
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
