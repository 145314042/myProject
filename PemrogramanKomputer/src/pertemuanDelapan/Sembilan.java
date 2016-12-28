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
public class Sembilan {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Tanda yang akan dilukis (+,-,x): "); 
        String a=z.next();
        switch (a) {
            case "+" :
                for(int b=1;b<=4;b++){
                    for(int c=1;c<=10;c++){
                        if ((c==5)||(c==6))System.out.print("x ");
                        else System.out.print("0 ");}
                    System.out.println("");}
                for(int d=5;d<=6;d++){
                    for(int e=1;e<=10;e++){
                        System.out.print("x ");}
                    System.out.println("");}
                for(int f=1;f<=4;f++){
                    for(int g=1;g<=10;g++){
                        if ((g==5)||(g==6))System.out.print("x ");
                        else System.out.print("0 ");}
                    System.out.println("");}
                break;
            case "-" :
                for(int h=1;h<=10;h++){
                    for(int i=1;i<=10;i++){
                        if ((h==5)||(h==6))System.out.print("x ");
                        else System.out.print("0 ");}
                    System.out.println("");}
                break;
            case "x" :
            case "X" :
                int l=1;
                int m=10;
                for(int j=1;j<=10;j++){
                    for(int k=1;k<=10;k++){
                        if (k==l)System.out.print("x ");
                        else if (k==m)System.out.print("x ");
                        else System.out.print("0 ");}
                    l++;
                    m--;
                    System.out.println("");}
                break;
            default :System.out.println("Perintah salah.");
        }
    }
}
