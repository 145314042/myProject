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
public class TEmpat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1,b,c;double d=0;
        System.out.print("Masukkan banyak data yang akan diproses : ");
        b=z.nextInt();
        while (a<=b){
            System.out.print("Data ke "+a+" : ");
            c=z.nextInt();
            d=(d+c)/a;
            a=a+1;
        }
        System.out.println("Rata-rata data adalah : "+d);
    }
}
