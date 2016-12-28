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
public class Kubus extends TigaD {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double Volume() {
        return Math.pow(getSisi(),3);
    }

    @Override
    public double Luas() {
        return 6*getSisi()*getSisi();
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
