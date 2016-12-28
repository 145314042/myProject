/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO3;

import org.omg.PortableServer.POA;

/**
 *
 * @author Kirizu
 */
public class Prosiding extends Koleksi{
    private int tingkat;

    public Prosiding(String noRef,String judul) {
        super(noRef, judul);
    }
    
    @Override
    public double biaya() {
        return getLama()*(500*getTingkat());
    }

    /**
     * @return the tingkat
     */
    public int getTingkat() {
        return tingkat;
    }

    /**
     * @param tingkat the tingkat to set
     */
    public void setTingkat(int tingkat) {
        this.tingkat = tingkat;
    }
}
