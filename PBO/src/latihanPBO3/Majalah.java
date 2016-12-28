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
public class Majalah extends Koleksi{
    private int tahun;

    public Majalah(String noRef,String judul) {
        super(noRef, judul);
    }

    @Override
    public double biaya() {
        return getLama()*(1500*(getTahun()/1900));
    }
    
    /**
     * @return the tahun
     */
    public int getTahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
