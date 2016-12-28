/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

/**
 *
 * @author Kirizu
 */
public class Tabung {
    private double t;
    private Lingkaran r;
    public double luas(){
        return (getR().hitungLuas()*2)+(getR().hitungLuas()/getR().r*2*getT());
    }

    /**
     * @return the t
     */
    public double getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(double t) {
        this.t = t;
    }

    /**
     * @return the r
     */
    public Lingkaran getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Lingkaran r) {
        this.r = r;
    }
}
