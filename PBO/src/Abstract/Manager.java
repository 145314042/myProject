/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Kirizu
 */
public class Manager extends Pegawai{
    private double tunjJabatan;
    //// constructor
    public Manager (String nip,String nama){
        super(nip, nama);
    }
    public Manager (){
        super();
    }
    /// methode
    @Override
    public double TunLai(){
        return gajiLembur()+tunjangan()+getTunjJabatan();
    }
    @Override
    public double gajiTotal(){
        return getGaji_pokok() + gajiLembur() + tunjangan()+getTunjJabatan();
    }
    //// get and set
    /**
     * @return the tunjJabatan
     */
    public double getTunjJabatan() {
        return tunjJabatan;
    }
    /**
     * @param tunjJabatan the tunjJabatan to set
     */
    public void setTunjJabatan(double tunjJabatan) {
        this.tunjJabatan = tunjJabatan;
    }
}
