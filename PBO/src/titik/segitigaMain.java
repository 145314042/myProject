/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titik;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class segitigaMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        //set nilai tiga titik
        System.out.println("Masukkan nilai titik : ");
        Titik titik1=new Titik();
        System.out.print("Titik x1 : ");
        titik1.setX(z.nextDouble());
        System.out.print("Titik y1 : ");
        titik1.setY(z.nextDouble());
        System.out.println("");
        
        Titik titik2=new Titik();
        System.out.print("Titik x2 : ");
        titik2.setX(z.nextDouble());
        System.out.print("Titik y2 : ");
        titik2.setY(z.nextDouble());
        System.out.println("");
        
        Titik titik3=new Titik();
        System.out.print("Titik x3 : ");
        titik3.setX(z.nextDouble());
        System.out.print("Titik y3 : ");
        titik3.setY(z.nextDouble());
        System.out.println("");
        
        Segitiga sg=new Segitiga(titik1, titik2, titik3);
        //hitung luas dan keliling segitiga
        
        System.out.println("Luas Segitiga : "+sg.hitungLuas());
        System.out.println("Keliling Segitiga : "+sg.hitungKeliling());
    }
}
