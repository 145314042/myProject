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
public class SatuTugas {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1,b;
        double c=0,d;
        do{
            System.out.print("Data ke "+a+" : ");
            b=z.nextInt();
            a++;
            c=c+b;
        }while (b>0);
        a=a-2;
        d=c/a;
        System.out.println("Rata-rata data adalah "+d);
    }
}
