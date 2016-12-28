/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDuaA;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Dua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R, H;
        double I;
        double phi=3.14;
        System.out.print("Masukkan jari-jari alas kerucut:");
        R=sc.nextInt();
        System.out.print("Masukkan tinggi kerucut: ");
        H=sc.nextInt();
        I = 1/3.0 * phi * Math.pow(R,2) * H;
        System.out.println("Isi kerucut : "+I);
    }
}
// R=5 H=13 I=340.1667