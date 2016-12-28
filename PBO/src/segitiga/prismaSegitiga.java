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
public class prismaSegitiga {
    public static void main(String[] args) {
        double h= 10;
        double luas;
        //buat obyek segitiga
        Segitiga s1=new Segitiga();
        //set nilai tiga titik
        s1.x1=0;s1.y1=0;
        s1.x2=5;s1.y2=4;
        s1.x3=8;s1.y3=2;
        //buat tiga obyek persegi
        Persegi1 p1=new Persegi1();   
        Persegi1 p2=new Persegi1();   
        Persegi1 p3=new Persegi1();   
        //set panjang dari tiga obyek persegi
        p1.panj=h;
        p2.panj=h;
        p3.panj=h;
        //set lebar dari tiga obyek persegi, masing-masing a,b dan c
        p1.lebar=s1.hitungSisi(s1.x1,s1.y1,s1.x2,s1.y2);
        p2.lebar=s1.hitungSisi(s1.x2,s1.y2,s1.x3,s1.y3);
        p3.lebar=s1.hitungSisi(s1.x1,s1.y1,s1.x3,s1.y3);
        //hitung luas : 2 luas segitiga dan 3 luas persegi
        luas = (2*s1.hitungLuas()) +p1.luas() +p2.luas() +p3.luas();
        System.out.println("p1 "+p1.lebar);
        System.out.println("p2 "+p2.lebar);
        System.out.println("p3 "+p3.lebar);
        System.out.println("Titik 1 segitiga = "+s1.x1+","+s1.y1);
        System.out.println("Titik 1 segitiga = "+s1.x2+","+s1.y2);
        System.out.println("Titik 1 segitiga = "+s1.x3+","+s1.y3);
        System.out.println("Tinggi prisma    = "+h);
        System.out.println("Luas prisma segitiga adalah "+luas);
    }
}
