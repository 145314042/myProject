/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanTigaA;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Delapan {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a;
        System.out.print("Masukkan Tinggi : ");
        a=z.nextDouble();
        if (100<=a&&a<=150)
            System.out.println("Anak memiliki tinggi normal");
        else System.out.println("Anak memiliki tinggi tidak normal");
    }
}
