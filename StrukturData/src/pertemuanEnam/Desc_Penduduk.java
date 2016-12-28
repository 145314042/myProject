/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanEnam;

/**
 *
 * @author Lycorice
 */
public class Desc_Penduduk implements Comparable{
    private String daerah;
    private double jumlah;

    public Desc_Penduduk(String daerah, int jumlah) {
        this.daerah = daerah;
        this.jumlah = jumlah;
    }

    @Override
    public int compareTo(Object o) {
        Desc_Penduduk penduduk=(Desc_Penduduk) o;
        if (this.getJumlah()<penduduk.getJumlah()) return 1;
        else if (this.getJumlah()>penduduk.getJumlah()) return -1;
        else return 0;
    }

    /**
     * @return the daerah
     */
    public String getDaerah() {
        return daerah;
    }

    /**
     * @param daerah the daerah to set
     */
    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    /**
     * @return the jumlah
     */
    public double getJumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    
}
