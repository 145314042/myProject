/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanEnam;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class TDua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1,b,c;
        System.out.println("Harga per Liter Rp6500,00");
        System.out.print("Jumlah Liter  : ");
        b=z.nextInt();
        System.out.println("Jumlah Liter        Harga (Rp)");
        System.out.println("=================================");
        while (a<=b) {
            c=a*6500;
            System.out.println(a+"                   "+c);
            a=a+1;
        }
        System.out.println("=================================");
    }
}
