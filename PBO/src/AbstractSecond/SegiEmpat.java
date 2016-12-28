/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractSecond;

/**
 *
 * @author Kirizu
 */
public class SegiEmpat extends BangunDatar {
    private double panjang;
    private double lebar;
    //constructor
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //method
    @Override
    public double Luas() {
        return getPanjang()*getLebar();
    }
    @Override
    public double Keliling() {
        return (2*getPanjang())+(2*getLebar());
    }
    //method get dan set
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
}
