/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractSecond;

/**
 *
 * @author Kirizu
 */
public class Pemasaran extends Pegawai{
    private double tunjTransport;
    //// constructor
    public Pemasaran (String nip,String nama){
        super(nip, nama);
    }
    public Pemasaran(){
        super();
    }
    //// methode
    @Override
    public double TunLai(){
        return gajiLembur()+tunjangan()+getTunjTransport();
    }
    @Override
    public double gajiTotal(){
        return getGaji_pokok() + gajiLembur() + tunjangan()+getTunjTransport();
    }
    //// get and set
    /**
     * @return the tunjTransport
     */
    public double getTunjTransport() {
        return tunjTransport;
    }
    /**
     * @param tunjTransport the tunjTransport to set
     */
    public void setTunjTransport(double tunjTransport) {
        this.tunjTransport = tunjTransport;
    }
}
