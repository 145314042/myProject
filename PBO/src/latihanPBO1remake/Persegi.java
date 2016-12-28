/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO1remake;

/**
 *
 * @author Kirizu
 */
public class Persegi extends DuaD{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double Luas(){
        return getSisi()*getSisi();
    }
    @Override
    public double Keliling(){
        return 4*getSisi();
    }

    /**
     * @return the sisi
     */
    public double getSisi() {
        return sisi;
    }

    /**
     * @param sisi the sisi to set
     */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
