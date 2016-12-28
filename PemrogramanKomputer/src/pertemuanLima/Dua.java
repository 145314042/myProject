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
public class Dua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int d,m,y;
        System.out.print("Masukkan tanggal (dd/d): ");
        d=z.nextInt();
        System.out.print("Masukkan tanggal (mm/m): ");
        m=z.nextInt();
        System.out.print("Masukkan tanggal (yyyy): ");
        y=z.nextInt();
        switch (m){
            case 1 :
                System.out.println(d+" Januari "+y);
                break;
            case 2 :
                System.out.println(d+" Februari "+y);
                break;
            case 3 :
                System.out.println(d+" April "+y);
                break;
            case 4 :
                System.out.println(d+" Mei "+y);
                break;
            case 5 :
                System.out.println(d+" Juni "+y);
                break;
            case 6 :
                System.out.println(d+" Juli "+y);
                break;
            case 7 :
                System.out.println(d+" Agustus "+y);
                break;
            case 8 :
                System.out.println(d+" September "+y);
                break;
            case 9 :
                System.out.println(d+" Oktober "+y);
                break;
            case 10 :
                System.out.println(d+" November "+y);
                break;
            case 11 :
                System.out.println(d+" Desember "+y);
                break;
            case 12 :
                System.out.println(d+" Januari "+y);
                break;
        }
    }
}
