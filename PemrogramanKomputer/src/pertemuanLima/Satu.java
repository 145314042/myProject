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
public class Satu {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String as;
        System.out.print("Masukkan sebuah karakter : ");
        as=z.next();
        switch (as) {
            case "a" :
                System.out.println("Vokal");
                break;
            case "i" :
                System.out.println("Vokal");
                break;
            case "u" :
                System.out.println("Vokal");
                break;
            case "e" :
                System.out.println("Vokal");
                break;
            case "o" :
                System.out.println("Vokal");
                break;
            case "A" :
                System.out.println("Vokal");
                break;
            case "I" :
                System.out.println("Vokal");
                break;
            case "U" :
                System.out.println("Vokal");
                break;
            case "E" :
                System.out.println("Vokal");
                break;
            case "O" :
                System.out.println("Vokal");
                break;            
            default :
                System.out.println("Konsonan");
        }
    }
}
