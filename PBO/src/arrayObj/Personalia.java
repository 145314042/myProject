/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayObj;

import hitung.HitungGaji;

/**
 *
 * @author Kirizu
 */
public class Personalia {
    private int jumlah_pegawai[];
    private String nama;

    private String NIP;
    private String alamat;
    private int umur;
    private int jumlah_anak;
    private int jam_lembur;
    private double gaji_pokok;
    
    public Personalia(String nama, String NIP) {
        this.nama = nama;
        this.NIP = NIP;
    }
    
    public double gajiLembur(){
        return HitungGaji.HitungGajiLembur((int) jam_lembur, 8, 100000);
    }
    
    public double tunjangan(){
        return (0.1 * getJumlah_anak() * getGaji_pokok());
    }
    
    public double gajiTotal(){
        return getGaji_pokok() + gajiLembur() + tunjangan();
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
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
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

    /**
     * @return the jam_lembur
     */
    public int getJam_lembur() {
        return jam_lembur;
    }

    /**
     * @param jam_lembur the jam_lembur to set
     */
    public void setJam_lembur(int jam_lembur) {
        this.jam_lembur = jam_lembur;
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
     * @return the jumlah_pegawai
     */
    public int[] getJumlah_pegawai() {
        return jumlah_pegawai;
    }

    /**
     * @param jumlah_pegawai the jumlah_pegawai to set
     */
    public void setJumlah_pegawai(int[] jumlah_pegawai) {
        this.jumlah_pegawai = jumlah_pegawai;
    }

    
}



//public  Personalia(Pegawai nama,Pegawai NIP,Pegawai alamat,Pegawai umur,Pegawai jumlah_anak,Pegawai jam_lembur,Pegawai gaji_pokok){
//        
//    }