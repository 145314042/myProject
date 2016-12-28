/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanLima;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Enam {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String a;
        System.out.print("Masukkan agama anda : ");
        a=z.next();
        switch (a){
            case "Hindu" :
                System.out.println("Nama Kitab Suci : Veda");
                System.out.println("Nama Nabi : -");
                break;
            case "Budha" :
                System.out.println("Nama Kitab Suci : Tripitaka");
                System.out.println("Nama Nabi : Sidarta Gautama");
                break;
            case "Yahudi" :
                System.out.println("Nama Kitab Suci : Taurat");
                System.out.println("Nama Nabi : Musa");
                break;
            case "Katolik" :
                System.out.println("Nama Kitab Suci : Injil");
                System.out.println("Nama Nabi : Yesus");
                break;
            case "Kristen" :
                System.out.println("Nama Kitab Suci : Injil");
                System.out.println("Nama Nabi : Yesus");
                break;
            case "Islam" :
                System.out.println("Nama Kitab Suci : Alquran");
                System.out.println("Nama Nabi : Mohammad");
                break;
            default :
                System.out.println("Tidak terdaftar");
        }
    }
}
