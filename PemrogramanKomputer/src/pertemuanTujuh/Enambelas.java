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
public class Enambelas {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,b=0,c=0;
        do{
            b++;
            System.out.print("Masukkan bilangan ke-"+b+" : ");
            a=z.nextInt();
            if ((a%2)==0) c=c;
            else if ((a%2)!=0) c=c+a;
        }while (b<5);
        System.out.println("Jumlah total bilangan ganjil masukan anda adalah : "+c);
    }
}
