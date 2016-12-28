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
public abstract class Pegawai {
    protected String NIP;
    protected String nama; 
    protected double gaji_pokok; 
    protected double jam_lembur; 
    protected int jumlah_anak;
    protected final double honor_lembur=100000;
    ////
    public Pegawai() {
        this.NIP = "No Nip";
        this.nama = "No Name";
        this.gaji_pokok = 1000000;
    }
    public Pegawai(String nip,String nama) {
        this.NIP = nip;
        this.nama = nama;
        this.gaji_pokok = gaji_pokok;
    }
    ////
    public double gajiLembur(){
        return (getJam_lembur() * honor_lembur);
    }
    public double tunjangan(){
        return (0.1 * getJumlah_anak() * getGaji_pokok());
    }
    //// abstract methode
    public abstract double gajiTotal();
    public abstract double TunLai();
    ////
    /**
     * @return the NIP
     */
    public String getNIP() {
        return NIP;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the gaji_pokok
     */
    public double getGaji_pokok() {
        return gaji_pokok;
    }

    /**
     * @return the jam_lembur
     */
    public double getJam_lembur() {
        return jam_lembur;
    }

    /**
     * @return the jumlah_anak
     */
    public int getJumlah_anak() {
        return jumlah_anak;
    }

        /**
     * @param NIP the NIP to set
     */
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param gaji_pokok the gaji_pokok to set
     */
    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    /**
     * @param jam_lembur the jam_lembur to set
     */
    public void setJam_lembur(double jam_lembur) {
        this.jam_lembur = jam_lembur;
    }

    /**
     * @param jumlah_anak the jumlah_anak to set
     */
    public void setJumlah_anak(int jumlah_anak) {
        this.jumlah_anak = jumlah_anak;
    }
}
