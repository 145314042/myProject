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
public class EmpatB {
    public static void main(String[] args) {
        int putar = 1;
        double jumlah = 0;
        double bilangan;
        Scanner tombol = new Scanner(System.in);
        while ( putar <= 5 ) {
            System.out.print("Masukkan data ke "+putar+ " : ");
            bilangan = tombol.nextDouble();
            jumlah = jumlah + bilangan;
            putar++;
        }
        System.out.println(" Jumlah 5 bilangan tersebut adalah "+ jumlah);
    }
}
