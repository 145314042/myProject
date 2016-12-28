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
public class TSepuluh {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1,c=0;double b=0,d = 0;
        while (a>0&&a<100){
            System.out.print("Masukkan nilai : ");
            a=z.nextInt();
            if (a>=0&&a<=100) {
                b=b+a;
                d=b/c;
            }
            else d=b/c;
            c=c+1;
        }
        c=c-1;
        System.out.println("Rata-rata "+c+" nilai adalah : "+d);
    }
}
