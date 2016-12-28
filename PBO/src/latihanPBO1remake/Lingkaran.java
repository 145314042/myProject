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
public class Lingkaran extends DuaD {
    private double range;

    public Lingkaran(double range) {
        this.range = range;
    }
    @Override
    public double Luas(){
        return 3.14*getRange()*getRange();
    }
    @Override
    public double Keliling(){
        return 3.14*getRange()*2;
    }

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
