/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Kirizu
 */
public abstract class Alat implements Biaya{
    protected String noAlat;

    public Alat(String noAlat) {
        this.noAlat = noAlat;
    }

    public Alat() {
    }

    /**
     * @return the noAlat
     */
    public String getNoAlat() {
        return noAlat;
    }

    /**
     * @param noAlat the noAlat to set
     */
    public void setNoAlat(String noAlat) {
        this.noAlat = noAlat;
    }
}
