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
public abstract class DuaD implements Dimensi{
    protected double tebal;
    public abstract double Keliling();

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
}
