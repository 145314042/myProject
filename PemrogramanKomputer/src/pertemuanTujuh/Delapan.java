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
public class Delapan {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,b=0;
        do {
            System.out.print("Masukkan bilangan tebakan anda : ");
            a=z.nextInt();
            if (a!=18){
                System.out.println("Salah");
                b++;}
            else if (a==18){
                System.out.println("Anda berhasil menebak.");
                System.out.println("Terima kasih sudah bermain.");}
            if (b==10){
                a=18;
                System.out.println("Anda belum beruntung.");
                System.out.println("Terima kasih sudah bermain.");}
        }while (a!=18);
    }
}
