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
public class Enam {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,b,c,rata2; 
        System.out.println("SD BHINNEKA");
        System.out.println("");
        System.out.print("Tugas 1     : ");
        a=z.nextInt();
        System.out.print("Tugas 2     : ");
        b=z.nextInt();
        System.out.print("Tugas 3     : ");
        c=z.nextInt();
        rata2=(a+b+c)/3;
        System.out.println("_______________________");
        System.out.println("Nilai rata-rata : "+rata2);
    }
}
