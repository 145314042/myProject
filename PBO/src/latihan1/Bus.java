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
public class Bus extends Kendaraan{
    private double jumlahPenumpang;
    public Bus(String noPlat) {
        super(noPlat);
    }
    @Override
    public double hitungTarif() {
        return getJumlahPenumpang()*2000;
    }
    /**
     * @return the jumlahPenumpang
     */
    public double getJumlahPenumpang() {
        return jumlahPenumpang;
    }
    /**
     * @param jumlahPenumpang the jumlahPenumpang to set
     */
    public void setJumlahPenumpang(double jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
