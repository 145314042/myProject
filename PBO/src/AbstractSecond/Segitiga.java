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
public class Segitiga extends BangunDatar {
    private double sisi1;
    private double sisi2;
    private double sisi3;
    //constructor
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    //method
    @Override
    public double Luas() {
        return Math.sqrt((Keliling()/2)*((Keliling()/2)-getSisi1())*
                ((Keliling()/2)-getSisi2())*((Keliling()/2)-getSisi3()));
    }
    @Override
    public double Keliling() {
        return getSisi1()+getSisi2()+getSisi3();
    }
    //method get dan set
    /**
     * @return the sisi1
     */
    public double getSisi1() {
        return sisi1;
    }
    /**
     * @param sisi1 the sisi1 to set
     */
    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }
    /**
     * @return the sisi2
     */
    public double getSisi2() {
        return sisi2;
    }
    /**
     * @param sisi2 the sisi2 to set
     */
    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }
    /**
     * @return the sisi3
     */
    public double getSisi3() {
        return sisi3;
    }
    /**
     * @param sisi3 the sisi3 to set
     */
    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }
}
