/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO2;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class SuhuMain {
    public static void main(String[] args) {
        Suhu[] temp=new Suhu[9999];
        
        int k1=0,k2=0,jum=-1;
        double[] suhu=new double[9999];
        double[] konversi=new double[9999];
        String[] jenis1=new String[9999];
        String[] jenis2=new String[9999];
        //input
        do{
            jum++;
            double su=Double.parseDouble(JOptionPane.showInputDialog("Masukkan suhu awal :"));
            suhu[jum]=su;
            do{
                jenis1[jum]=JOptionPane.showInputDialog("Pilih suhu awal : (C)Celcius,(R)Reamur,(F)Fahrenheit");
                switch (jenis1[jum]){
                    case "C":case "c":case "R":case "r":case "F":case "f":k1=0;break;
                    default :JOptionPane.showMessageDialog(null, "Pilihan Salah!");k1=1;
                }
            }while(k1==1);
            do{
                switch (jenis1[jum]){
                    case "C":case "c":
                        do{
                            jenis2[jum]=JOptionPane.showInputDialog("Pilih suhu konversi : (R)Reamur,(F)Fahrenheit");
                            switch (jenis2[jum]){
                                case "R":case "r":k1=0;konversi[jum]=temp[jum].ctr(su);break;
                                case "F":case "f":k1=0;konversi[jum]=temp[jum].ctf(su);break;
                                default :JOptionPane.showMessageDialog(null, "Pilihan Salah!");k1=1;
                            }
                        }while(k1==1);
                        break;
                    case "R":case "r":
                        do{
                            jenis2[jum]=JOptionPane.showInputDialog("Pilih suhu konversi : (C)Celcius,(F)Fahrenheit");
                            switch (jenis2[jum]){
                                case "C":case "c":k1=0;konversi[jum]=temp[jum].rtc(su);break;
                                case "F":case "f":k1=0;konversi[jum]=temp[jum].rtf(su);break;
                                default :JOptionPane.showMessageDialog(null, "Pilihan Salah!");k1=1;
                            }
                        }while(k1==1);
                        break;
                    case "F":case "f":
                        do{
                            jenis2[jum]=JOptionPane.showInputDialog("Pilih suhu konversi : (C)Celcius,(R)Reamur");
                            switch (jenis2[jum]){
                                case "C":case "c":k1=0;konversi[jum]=temp[jum].ftc(su);break;
                                case "R":case "r":k1=0;konversi[jum]=temp[jum].ftr(su);break;
                                default :JOptionPane.showMessageDialog(null, "Pilihan Salah!");k1=1;
                            }
                        }while(k1==1);
                        break;
                    default :JOptionPane.showMessageDialog(null, "Pilihan Salah!");k1=1;
                }
            }while(k1==1);
            do{
                String ulang=JOptionPane.showInputDialog("Apakah ingin memasukkan konversi baru? (Y/N)");
                switch (ulang){
                    case "Y":case "y":k1=1;k2=0;break;
                    case "N":case "n":k1=0;k2=0;break;
                    default :JOptionPane.showMessageDialog(null, "Pilihan Salah!");k2=1;
                }
            }while(k2==1);
        }while(k1==1);
        //output
        System.out.println("Data Konversi");
        for (int i = 0; i < (jum+1); i++) {
            System.out.println("========================================================================");
            System.out.println("No. Besar suhu       Suhu awal        Suhu konversi    Suhu akhir");
            System.out.println("========================================================================");
            System.out.printf("%-3d %-17s%-17.2f%-17.2f",(i+1),suhu[i],jenis1[i],jenis2[i],konversi[i]);
            System.out.println("========================================================================");
        }
    }
}
