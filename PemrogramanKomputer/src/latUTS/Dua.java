/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latUTS;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Dua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1,b,c,d=0,e=0,f=0;
        System.out.print("Jumlah mangga yang akan diproses : ");
        b=z.nextInt();
        while (a<=b){
            System.out.print("Berat Mangga ke "+a+" : ");
            c=z.nextInt();
            a++;
            if (500>c) d++;
            else if (500<=c&&c<=750) e++;
            else if (750<c) f++;
        }
        System.out.println("Jumlah mangga dengan kualitas BIASA ada "+d+" buah");
        System.out.println("Jumlah mangga dengan kualitas BAGUS ada "+e+" buah");
        System.out.println("Jumlah mangga dengan kualitas UNGGUL ada "+f+" buah");
    }
}
