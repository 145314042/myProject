/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titik;

/**
 *
 * @author Kirizu
 */
public class Segitiga {
    Titik titik1;
    Titik titik2;
    Titik titik3;

    public Segitiga(Titik titik1, Titik titik2, Titik titik3) {
        this.titik1 = titik1;
        this.titik2 = titik2;
        this.titik3 = titik3;
    }
    
    
    // Hitung panjang sisi
    public double hitungSisi(Titik titika, Titik titikb){
        return Math.sqrt( Math.pow(titika.getX()-titikb.getX(),2) + 
                          Math.pow(titika.getY()-titikb.getY(),2));
    }
    // Hitung keliling segitiga
    public double hitungKeliling(){
        return hitungSisi(getTitik1(), getTitik2())+
               hitungSisi(getTitik2(), getTitik3())+
               hitungSisi(getTitik3(), getTitik1());
    }
    // Hitung luas segitiga
    public double hitungLuas(){
        double s = hitungKeliling()/2;
        return Math.sqrt(s * (s-hitungSisi(getTitik1(), getTitik2())) * 
              (s-hitungSisi(getTitik2(), getTitik3())) * 
              (s-hitungSisi(getTitik3(), getTitik1())));
    }

    /**
     * @return the titik1
     */
    public Titik getTitik1() {
        return titik1;
    }

    /**
     * @return the titik2
     */
    public Titik getTitik2() {
        return titik2;
    }

    /**
     * @return the titik3
     */
    public Titik getTitik3() {
        return titik3;
    }
}
