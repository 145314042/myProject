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
public class Segitiga {
    double x1,y1,x2,y2,x3,y3;
    
    // Hitung panjang sisi
    public double hitungSisi(double xa, double ya, double xb, double yb){
        return Math.sqrt( Math.pow(xa-xb, 2) + Math.pow(ya-yb,2));
    }
    // Hitung keliling segitiga
    public double hitungKeliling(){
        return hitungSisi(x1,y1,x2,y2)+
        hitungSisi(x2,y2,x3,y3)+hitungSisi(x3,y3,x1,y1);
    }
    // Hitung luas segitiga
    public double hitungLuas(){
        double s = hitungKeliling()/2;
        return Math.sqrt(s * (s-hitungSisi(x1,y1,x2,y2)) * (s-hitungSisi(x2,y2,x3,y3)) * (s-hitungSisi(x3,y3,x1,y1)));
    }
}
