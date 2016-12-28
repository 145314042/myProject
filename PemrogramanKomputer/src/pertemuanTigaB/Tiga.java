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
public class Tiga {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        double g,h,j,t;
        System.out.print("Masukkan golongan pegawai : ");
        g=z.nextDouble();
        System.out.print("Masukkan jumlah jam kerja : ");
        j=z.nextDouble();
        if (g==1){
            h=10000;
            t=h*j;
            System.out.println("Honor lembur : "+t);}
        else if (g==2){
            h=20000;
            t=h*j;
            System.out.println("Honor lembur : "+t);}
        else if (g==3){
            h=30000;
            t=h*j;
            System.out.println("Honor lembur : "+t);}
    }
}
