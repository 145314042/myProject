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
public class TTiga {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1,b,c,d=0;
        System.out.print("Jumlah bilangan yang akan dimasukkan : ");
        b=z.nextInt();
        while (a<=b){
            System.out.print("Bilangan ke-"+a+" : ");
            c=z.nextInt();
            d=d+c;
            a=a+1;
        }
        System.out.println("Jumlah total bilangan adalah : "+d);
    }
}
