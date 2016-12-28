/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO1;

/**
 *
 * @author Kirizu
 */
public abstract class Dimensi3 extends Bangun{
    private String warna;
    private double panjang;
    private double lebar;
    private double tinggi;
    //
    public Dimensi3() {
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public Dimensi3(double panjang) {
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public Dimensi3(double panjang,double lebar,double tinggi) {
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    //
    public abstract double Volume();
    public abstract double Luas();
    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
