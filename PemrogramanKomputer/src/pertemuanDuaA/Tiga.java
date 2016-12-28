/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDuaA;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tiga {
    public static void main(String[] args) {
        int mm,m,h;
        Scanner z=new Scanner(System.in);
        System.out.print("Masukan jumlah menit : ");
        m=z.nextInt();
        h=m/60;
        mm=m%60; //m% adalah modulus
        System.out.println(m+" menit adalah "+h+" jam "+mm+" menit");
    }
}
