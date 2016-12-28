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
public abstract class Dimensi2 extends Bangun{
    private double tebal;
    private double panjang;
    private double lebar;
    private double tinggi;
    //
    public Dimensi2() {
        this.tebal = tebal;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public Dimensi2(double panjang) {
        this.tebal = tebal;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public Dimensi2(double panjang,double lebar) {
        this.tebal = tebal;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    //
    public abstract double Luas();
    public abstract double Keliling();
    //
    /**
     * @return the tebal
     */
    public double getTebal() {
        return tebal;
    }

    /**
     * @param tebal the tebal to set
     */
    public void setTebal(double tebal) {
        this.tebal = tebal;
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
