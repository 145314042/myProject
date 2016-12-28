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
public class TDuabelas {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1,b,c;double d=0,e=0,f=0,g=0,h=0,i=Double.MAX_VALUE,j=0,k=0;
        System.out.print("Masukkan banyak data yang akan diproses : ");
        b=z.nextInt();
        while (a<=b){
            System.out.print("Data ke "+a+" : ");
            c=z.nextInt();
            d=d+c; //rata rata
            e=d/a; //rata rata
            f=f+Math.pow(c,2); //variasi
            g=f-(a*2*e)/a; //variasi
            if (h<=c) h=c; //nilai max
            if (i>=c) i=c; //nilai min
            j=h-i; //rentan data
            k=Math.sqrt(g); //deviasi standard
            a=a+1;
        }
        System.out.println("======================================");
        System.out.println("Nilai terbesar : "+h);
        System.out.println("Nilai terkecil : "+i);
        System.out.println("Rentan data : "+j);
        System.out.println("Rata-rata data : "+e);
        System.out.println("Variasi data : "+g);
        System.out.println("deviasi standard : "+k);
    }
}
