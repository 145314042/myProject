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
public class Dua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double t,b;
        System.out.print("Tinggi badan : ");
        t=z.nextDouble();
        System.out.print("Berat badan  : ");
        b=z.nextDouble();
        if (90<=(t-b) && (t-b)>=110)
            System.out.println("Berat badan ideal");
        else if ((t-b)<90)
            System.out.println("Terlalu kurus");
        else if ((t-b)>110)
            System.out.println("Terlalu gemuk");
    }
}
