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
public class Printer extends Alat{
    private int jumlahKertas;

    public Printer(int jumlahKertas, String noAlat) {
        super(noAlat);
        this.jumlahKertas = jumlahKertas;
    }

    public Printer(int jumlahKertas) {
        this.jumlahKertas = jumlahKertas;
    }
    @Override
    public double hitungBiaya() {
        return getJumlahKertas() * 500;
    }

    /**
     * @return the jumlahKertas
     */
    public int getJumlahKertas() {
        return jumlahKertas;
    }

    /**
     * @param jumlahKertas the jumlahKertas to set
     */
    public void setJumlahKertas(int jumlahKertas) {
        this.jumlahKertas = jumlahKertas;
    }
}
