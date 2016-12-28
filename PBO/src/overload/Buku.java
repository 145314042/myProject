/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author Kirizu
 */
public class Buku {
    private String kode;
    private String peminjam;
    private int hari;
    final double bayar=2000;
    final int harip=6;
    final double denda=500;
    
    public double biaya(int h){
        return bayar+((hari-harip)*denda);
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the peminjam
     */
    public String getPeminjam() {
        return peminjam;
    }

    /**
     * @param peminjam the peminjam to set
     */
    public void setPeminjam(String peminjam) {
        this.peminjam = peminjam;
    }

    /**
     * @return the hari
     */
    public int getHari() {
        return hari;
    }

    /**
     * @param hari the hari to set
     */
    public void setHari(int hari) {
        this.hari = hari;
    }
}
