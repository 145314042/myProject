/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class TabungMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        
        Tabung tb=new Tabung();
        Lingkaran lk=new Lingkaran();
        tb.setR(lk);
        
        System.out.print("Masukkan jari-jari : ");
        lk.r=z.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tb.setT(z.nextDouble());
        
        System.out.println("Luas Permukaan Tabung adalah : "+tb.luas());
    }
}
