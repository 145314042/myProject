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
public class contoh {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=0,b,c=0;
        System.out.print("Nilai max : ");
        b=z.nextInt();
        System.out.print("Bilangan prima dibawah : "+b+" adalah : ");
        while (a<=b){
            a=a+1;
            c=a/a;
            if (c==1) System.out.print(a+",");
        }
//
    }
}
