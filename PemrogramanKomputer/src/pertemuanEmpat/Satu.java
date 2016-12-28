/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanEmpat;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Satu {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int x,y;
        System.out.print("Masukkan koordinat x : ");
        x=z.nextInt();
        System.out.print("Masukkan koordinat y : ");
        y=z.nextInt();
        if (x>=0&&y>=0)
            System.out.println("Titik ("+x+","+y+") berada pada kuadran 1");
        else if (x<=0&&y>=0)
            System.out.println("Titik ("+x+","+y+") berada pada kuadran 2");
        else if (x<=0&&y<=0)
            System.out.println("Titik ("+x+","+y+") berada pada kuadran 3");
        else if (x>=0&&y<=0)
            System.out.println("Titik ("+x+","+y+") berada pada kuadran 4");        
    }
}
