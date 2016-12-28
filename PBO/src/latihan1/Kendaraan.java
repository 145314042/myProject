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
public abstract class Kendaraan {
    protected String noPlat;
    public Kendaraan(String noPlat) {
        this.noPlat = noPlat;
    }
    public abstract double hitungTarif();
    /**
     * @return the noPlat
     */
    public String getNoPlat() {
        return noPlat;
    }
    /**
     * @param noPlat the noPlat to set
     */
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
}
