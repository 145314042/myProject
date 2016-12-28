/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSatu;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Dua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Masukkan jumlah Array : ");
        int[] array=new int[z.nextInt()];
        System.out.println("Masukkan nilai array");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nilai Array ke-"+(i+1)+" : ");
            array[i]=z.nextInt();
        }
        System.out.print("Menampilkan array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
