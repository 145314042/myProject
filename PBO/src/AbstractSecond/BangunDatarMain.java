/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractSecond;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class BangunDatarMain {
    public static void main(String[] args) {
        int jum=Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bangun ruang :"));
        BangunDatar[] bd=new BangunDatar[jum];
        //input
        for (int i = 0; i < bd.length; i++) {
            String jenis;
            int j;
            do{
                jenis=JOptionPane.showInputDialog("Pilih : (A)Segi Empat, (B)Segitiga, (C)Lingkaran",null);
                switch (jenis){
                    case "A" :case "a" :
                        double panjang=Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang Segi empat :"));
                        double lebar=Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar Segi empat :"));
                        bd[i]=new SegiEmpat(panjang,lebar);j=1;break;
                    case "B" :case "b" :
                        double sisi1=Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi 1 Segitiga :"));
                        double sisi2=Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi 2 Segitiga :"));
                        double sisi3=Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi 3 Segitiga :"));
                        bd[i]=new Segitiga(sisi1,sisi2,sisi3);j=1;break;
                    case "C" :case "c" :
                        double range=Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari Lingkaran :"));
                        bd[i]=new Lingkaran(range);j=1;break;
                    default:JOptionPane.showMessageDialog(null,"Pilihan Salah");j=0;}
            }while (j!=1);
        }
        //output
        System.out.println("===============================================================");
        System.out.println("No. Bangun datar        Keliling        Luas");
        System.out.println("===============================================================");
        for (int i = 0; i < bd.length; i++) {
            String j1=(bd[i].getClass().getName());
            String[] jen=j1.split("[.]");
            System.out.printf("%-4d"+"%-20s"+"%-16.2f"+"%.2f\n",(1+i),jen[1],bd[i].Keliling(),bd[i].Luas());
        }
        System.out.println("===============================================================");
    }
}
