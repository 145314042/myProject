/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanTujuh;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Sepuluh {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a,b,c=1,d,e,f=0,g,h,i;
        do {
            System.out.print("Masukkan lama lagu ke-"+(int)c+" (menit<sepasi>detik): ");
            a=z.nextDouble();b=z.nextDouble();
            d=a*60;
            e=d+b;
            if (e>540){
                System.out.println("Ulangi, lama lagu lebih dari 9 menit");
                e=0;
                c--;}
            else {e=e;c=c;}
            f=f+e;
            c++;
        }while (f<=2700);
        c-=2;
        f=f-e;
        System.out.println("\nJumlah lagu yang masuk adalah "+(int)c);
        g=2700-f;
        h=(int)g/60;
        i=g%60;
        System.out.println("Sisa waktu : "+(int)h+" menit dan "+(int)i+" detik.");
    }
}
