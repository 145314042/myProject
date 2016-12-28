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
public class Delapanbelas {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int d=0;
        System.out.print("Masukkan nilai investasi awal : ");
        double a=z.nextDouble();
        System.out.print("Masukkan persentase kenaikan (%) : ");
        double b=z.nextDouble();
        System.out.print("Masukkan lama investasi (bulan) : ");
        double c=z.nextDouble();
        double e=b/100;
        double f=a;
        do {
            d++;
            f=f+(f*e);
        }while (d<c);
        System.out.println("Nilai investasi setelah 10 bulan : "+(double)f);
    }
}
//Masukkan nilai investasi awal : 10000000
//Masukkan persentase kenaikan (%) : 2
//Masukkan lama investasi (bulan) : 10
//Nilai investasi setelah 10 bulan : 12189944.2