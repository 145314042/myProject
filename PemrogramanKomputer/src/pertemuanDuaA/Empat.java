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
public class Empat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=8000; //Makan 1 piring nasi dengan sayuran
        int b=3000; //Semua lauk
        int c=2000; //Semua minuman
        int d,e,f,g; //jumlah a,b,dan c, dan g = total harga
        System.out.println("WARUNG MAKAN RAPAYUPAYU");
        System.out.println("");
        System.out.print("  JumlahMakan     : ");
        d=z.nextInt();
        System.out.print("  JumlahLauk      : ");
        e=z.nextInt();
        System.out.print("  JumlahMinum     : ");
        f=z.nextInt();
        g=(a*d)+(b*e)+(c*f);
        System.out.println("_______________________");
        System.out.println("  HargaTotal      :     "+g );
    }
}
