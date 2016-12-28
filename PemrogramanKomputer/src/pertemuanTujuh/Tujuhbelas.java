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
public class Tujuhbelas {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,c;
        do {
            System.out.print("Masukkan bilangan genap awal : ");
            a=z.nextInt();
            if ((a%2)==0){
                System.out.print(a);
                c=a;
                for (int b=1;b<5;b++){
                    a+=2;
                    System.out.print(" + "+a);
                    c=c+a;}
                System.out.print(" = "+c);
            }
            else if ((a%2)!=0)
                System.out.println("Angka salah.");
        }while ((a%2)!=0);
    }
}
