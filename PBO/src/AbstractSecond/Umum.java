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
public class Umum extends Pegawai {
    private double bonus;
    //// constructor
    public Umum (String nip,String nama){
        super(nip, nama);
    }
    public Umum(){
        super();
    }
    //// methode
    @Override
    public double TunLai(){
        return gajiLembur()+tunjangan()+getBonus();
    }
    @Override
    public double gajiTotal(){
        return getGaji_pokok() + gajiLembur() + tunjangan()+getBonus();
    }
    //// get and set
    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }
    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
