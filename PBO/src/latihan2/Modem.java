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
public class Modem extends Alat{
    private double jumlahKBps;

    public Modem(double jumlahKBps, String noAlat) {
        super(noAlat);
        this.jumlahKBps = jumlahKBps;
    }

    public Modem(double jumlahKBps) {
        this.jumlahKBps = jumlahKBps;
    }
    @Override
    public double hitungBiaya() {
        return getJumlahKBps() * 3000;
    }

    /**
     * @return the jumlahKBps
     */
    public double getJumlahKBps() {
        return jumlahKBps;
    }

    /**
     * @param jumlahKBps the jumlahKBps to set
     */
    public void setJumlahKBps(double jumlahKBps) {
        this.jumlahKBps = jumlahKBps;
    }
}
