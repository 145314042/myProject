/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanTigaB;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Empat {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        double j,k,t;
        System.out.print("Masukkan besar penjualan : ");
        j=z.nextDouble();
        if (j>50000000){
            k=(3.00/100)*j;
            System.out.println("Besar komisi : "+k);}
        else if (j>10000000 && j<50000000){
            k=(2.00/100)*j;
            System.out.println("Besar komisi : "+k);}
        else if (j<10000000){
            k=0;
            System.out.println("Besar komisi : "+k);}
    }
}
