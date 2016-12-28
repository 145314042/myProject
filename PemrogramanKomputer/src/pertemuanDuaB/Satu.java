/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDuaB;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Satu {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a,b,c,n; 
        System.out.println("NILAI  ");
        System.out.println("");
        System.out.print("Ujian Sisipan 1          : ");
        a=z.nextInt();
        System.out.print("Ujian Sisipan 2          : ");
        b=z.nextInt();
        System.out.print("Ujian Akhir Semester     : ");
        c=z.nextInt();
        n=((30.0/100)*a)+((30.0/100)*b)+((40.0/100)*c);
        System.out.println("______________________________");
        System.out.println("Nilai                    : "+n);
    }
}
