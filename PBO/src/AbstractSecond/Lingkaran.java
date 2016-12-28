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
public class Lingkaran extends BangunDatar {
    private double range;
    //constructor
    public Lingkaran(double range) {
        this.range = range;
    }
    //method
    @Override
    public double Luas() {
        return 3.14*Math.pow(getRange(), 2);
    }
    @Override
    public double Keliling() {
        return 3.14*2*getRange();
    }
    //method get dan set
    /**
     * @return the range
     */
    public double getRange() {
        return range;
    }
    /**
     * @param range the range to set
     */
    public void setRange(double range) {
        this.range = range;
    }
}
