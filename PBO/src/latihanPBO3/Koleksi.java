/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO3;

/**
 *
 * @author Kirizu
 */
public abstract class Koleksi {
    protected String noRef;
    protected String judul;
    protected int lama;

    public Koleksi(String noRef,String judul) {
        this.noRef = noRef;
        this.judul = judul;
        this.lama = lama;
    }
    
    public abstract double biaya();

    /**
     * @return the noRef
     */
    public String getNoRef() {
        return noRef;
    }

    /**
     * @param noRef the noRef to set
     */
    public void setNoRef(String noRef) {
        this.noRef = noRef;
    }

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the lama
     */
    public int getLama() {
        return lama;
    }

    /**
     * @param lama the lama to set
     */
    public void setLama(int lama) {
        this.lama = lama;
    }
}
