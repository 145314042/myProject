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
public class TLima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,b,c,d=1;double e;
        System.out.print("Banyak derajat yang akan ditampilkan : ");
        a=z.nextInt();
        System.out.print("Berapa nilai awal suhu yang akan ditampilkan : ");
        b=z.nextInt();
        System.out.print("Berapa perubahan suhu setiap kali ditampilkan : ");
        c=z.nextInt();
        System.out.println("Celcius         Fahrenheit");
        while (d<=a){
            e=41+(1.8*c*d);
            System.out.println(b+"                "+e);
            b=b+c;
            d=d+1;
        }
    }
}
