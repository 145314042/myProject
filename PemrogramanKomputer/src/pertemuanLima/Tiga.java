/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanLima;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tiga {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String j;
        int k;
        double h,d;
        System.out.print("Jenis : ");
        j=z.next();
        System.out.print("Kode  : ");
        k=z.nextInt();
        switch (k) {
            case 10 :
                if ("a".equals(j)||"A".equals(j)) {
                    d=10.0/100*10000;
                    h=10000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 10%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("b".equals(j)||"B".equals(j)) {
                    d=15.0/100*10000;
                    h=10000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 15%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("c".equals(j)||"C".equals(j)) {
                    d=20.0/100*10000;
                    h=10000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 20%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                break;
            case 20 :
                if ("a".equals(j)||"A".equals(j)) {
                    d=10.0/100*23000;
                    h=23000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 10%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("b".equals(j)||"B".equals(j)) {
                    d=15.0/100*23000;
                    h=23000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 15%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("c".equals(j)||"C".equals(j)) {
                    d=20.0/100*23000;
                    h=23000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 20%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                break;
            case 30 :
                if ("a".equals(j)||"A".equals(j)) {
                    d=10.0/100*30000;
                    h=30000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 10%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("b".equals(j)||"B".equals(j)) {
                    d=15.0/100*30000;
                    h=30000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 15%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("c".equals(j)||"C".equals(j)) {
                    d=20.0/100*30000;
                    h=30000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 20%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                break;
            case 40 :
                if ("a".equals(j)||"A".equals(j)) {
                    d=10.0/100*67000;
                    h=67000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 10%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("b".equals(j)||"B".equals(j)) {
                    d=15.0/100*67000;
                    h=67000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 15%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("c".equals(j)||"C".equals(j)) {
                    d=20.0/100*67000;
                    h=67000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 20%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                break;
            case 50 :
                if ("a".equals(j)||"A".equals(j)) {
                    d=10.0/100*204000;
                    h=204000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 10%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("b".equals(j)||"B".equals(j)) {
                    d=15.0/100*204000;
                    h=204000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 15%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                else if ("c".equals(j)||"C".equals(j)) {
                    d=20.0/100*20400;
                    h=204000-d;
                    System.out.println("Jenis pembeli A dengan kode barang 10 mendapat diskon = 20%");
                    System.out.println("Harga setelah didiskon = "+(int)h);}
                break;
        }
    }
}
