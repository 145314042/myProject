/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author Kirizu
 */
public class Truck extends Kendaraan {
    private double beratTotal;
    public Truck(String noPlat) {
        super(noPlat);
    }
    @Override
    public double hitungTarif() {
        return getBeratTotal()*2500;
    }
    /**
     * @return the beratTotal
     */
    public double getBeratTotal() {
        return beratTotal;
    }
    /**
     * @param beratTotal the beratTotal to set
     */
    public void setBeratTotal(double beratTotal) {
        this.beratTotal = beratTotal;
    }
}
