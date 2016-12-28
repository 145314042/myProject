/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latUAS;

/**
 *
 * @author Kirizu
 */
public class Rekening {
    private String noRekening;
    private Mahasiswa pemilik;
    private double ukt;
    private double spp;

    public Rekening(String noRekening, Mahasiswa pemilik) {
        this.noRekening = noRekening;
        this.pemilik = pemilik;
    }
    
    public double hitTotal(){
        return (getUkt()+getSpp());
    }

    /**
     * @return the noRekening
     */
    public String getNoRekening() {
        return noRekening;
    }

    /**
     * @param noRekening the noRekening to set
     */
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    /**
     * @return the pemilik
     */
    public Mahasiswa getPemilik() {
        return pemilik;
    }

    /**
     * @param pemilik the pemilik to set
     */
    public void setPemilik(Mahasiswa pemilik) {
        this.pemilik = pemilik;
    }

    /**
     * @return the ukt
     */
    public double getUkt() {
        return ukt;
    }

    /**
     * @param ukt the ukt to set
     */
    public void setUkt(double ukt) {
        this.ukt = ukt;
    }

    /**
     * @return the spp
     */
    public double getSpp() {
        return spp;
    }

    /**
     * @param spp the spp to set
     */
    public void setSpp(double spp) {
        this.spp = spp;
    }
}
