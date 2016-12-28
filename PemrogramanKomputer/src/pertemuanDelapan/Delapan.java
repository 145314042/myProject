/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanDelapan;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Delapan {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Pilih arah (Kanan/Kiri) : ");
        String a=z.next();
        switch (a) {
            case "Kanan" :
            case "kanan" :
                for(int b=1;b<=5;b++){
                    for(int c=1;c<=b;c++){
                        System.out.print("*");}
                    System.out.println("");}
                for(int d=4;d>=1;d--){
                    for(int e=1;e<=d;e++){
                        System.out.print("*");}
                    System.out.println("");}
                break;
            case "kiri" :
            case "Kiri" :
                for(int f=4;f>=1;f--){
                    for(int g=1;g<=f;g++){
                        System.out.print(" ");}
                    for(int h=0;h<=(4-f);h++){
                        System.out.print("*");}
                    System.out.println("");}
                for(int i=1;i<=5;i++){
                    System.out.print("*");}
                System.out.println("");
                for(int j=1;j<=5;j++){
                    for(int k=1;k<=j;k++){
                        System.out.print(" ");}
                    for(int l=1;l<=(5-j);l++){
                        System.out.print("*");}
                    System.out.println("");}
                break;
            default :System.out.println("Perintah salah.");
        }
    }
}

//for(int c=4;c>=1;c--){
//                    for(int d=1;d<=c;d++){
//                        System.out.print(" ");
//                        for(int e=1;e<= ;e++){
//                            System.out.print("*");
//                        }
//                    }
//                    System.out.println();
//                }