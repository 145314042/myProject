/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;

/**
 *
 * @author Kirizu
 */
public class Gaji {
    private String NIP; 
    private String nama; 
    private double gaji_pokok; 
    private double jam_lembur; 
    private int jumlah_anak;
    final double honor_lembur=500000;
    
    public double gajiLembur(){
        return (jam_lembur * honor_lembur);
    }
    
    public double tunjangan(){
        return (0.1 * jumlah_anak * gaji_pokok);
    }
    
    public double gajiTotal(){
        return gaji_pokok + gajiLembur() + tunjangan();
    }
    
    /**
     * @return the NIP
     */
    public String getNIP() {
        return NIP;
    }

    /**
     * @param NIP the NIP to set
     */
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the gaji_pokok
     */
    public double getGaji_pokok() {
        return gaji_pokok;
    }

    /**
     * @param gaji_pokok the gaji_pokok to set
     */
    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    /**
     * @return the jam_lembur
     */
    public double getJam_lembur() {
        return jam_lembur;
    }

    /**
     * @param jam_lembur the jam_lembur to set
     */
    public void setJam_lembur(double jam_lembur) {
        this.jam_lembur = jam_lembur;
    }

    /**
     * @return the jumlah_anak
     */
    public int getJumlah_anak() {
        return jumlah_anak;
    }

    /**
     * @param jumlah_anak the jumlah_anak to set
     */
    public void setJumlah_anak(int jumlah_anak) {
        this.jumlah_anak = jumlah_anak;
    }
}
