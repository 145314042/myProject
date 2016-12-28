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
public class TSebelas {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a;
        System.out.print("Masukkan bilangan awal : ");
        a=z.nextInt();
        System.out.print("Deret yang terbentuk : "+a);
        if ((a%2)==0) a=a/2;
        else a=3*a+1;
        while (a>0) {
            System.out.print(", "+a);
            a=a/2;
        }
        System.out.println("\nTerima kasih telah menggunakan program ini.");
    }
}
