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
public class Duabelas {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Bilangan : ");
        double a=z.nextDouble();
        System.out.print("10 bilangan ganjil setelah "+(int)a+" adalah ");
        int b;
        if ((a%2)==0){
            a=a+1;
            System.out.print((int)a+" ");
            for(b=1;b<=9;b++){
            a=a+2;
            System.out.print((int)a+" ");}
        }
        else if ((a%2)!=0){
            System.out.print((int)a+" ");
            for(b=1;b<=9;b++){
            a=a+2;
            System.out.print((int)a+" ");}
        }
    }
}
