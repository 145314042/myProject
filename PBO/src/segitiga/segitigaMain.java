/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author Kirizu
 */
public class segitigaMain {
    public static void main(String[] args) {
        //buat obyek I
        Segitiga s1=new Segitiga();
        //set nilai tiga titik
        s1.x1=0;s1.y1=0;
        s1.x2=5;s1.y2=4;
        s1.x3=8;s1.y3=2;
        //hitung luas
        System.out.println("Luas segitiga (0,0)(5,4)(8,2) adalah "+s1.hitungLuas());
        //buat obyek II
        Segitiga s2=new Segitiga();
        //set nilai tiga titik
        s2.x1=7;s2.y1=2;
        s2.x2=7;s2.y2=9;
        s2.x3=1;s2.y3=2;
        //hitung luas
        System.out.println("Luas segitiga (7,2)(7,9)(1,2) adalah "+s2.hitungLuas());
    }
}
