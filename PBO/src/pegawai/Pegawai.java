/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;
import hitung.HitungGaji;


/**
 *
 * @author Kirizu
 */
public class Pegawai {
    private String NIP;
    private String nama; 
    private double gaji_pokok; 
    private double jam_lembur; 
    private int jumlah_anak;
    private double honor_lembur=500000;
    hitung.HitungGaji hhg=new hitung.HitungGaji();
    
    public Pegawai(String NIP, String nama) {
        this.NIP = NIP;
        this.nama = nama;
    }
    
//    String NIP;
//    String nama; 
//    double gaji_pokok; 
//    double jam_lembur; 
//    int jumlah_anak;
//    double honor_lembur=500000;

//    public Pegawai(String NIP, String nama, double gaji_pokok, double jam_lembur, int jumlah_anak) {
//        this.NIP = NIP;
//        this.nama = nama;
//        this.gaji_pokok = gaji_pokok;
//        this.jam_lembur = jam_lembur;
//        this.jumlah_anak = jumlah_anak;
//    }


    
    
    public double gajiLembur(){
        int jamDefault=8;
        
        return hitung.HitungGaji.HitungGajiLembur((int) getJam_lembur(),jamDefault,getHonor_lembur());
    }
    
    public double tunjangan(){
        return (0.1 * getJumlah_anak() * getGaji_pokok());
    }
    
    public double gajiTotal(){
        return getGaji_pokok() + gajiLembur() + tunjangan();
    }
//    public double gajiLembur(){
//        return (jam_lembur() * honor_lembur());
//    }
//    
//    public double tunjangan(){
//        return (0.1 * jumlah_anak() * gaji_pokok());
//    }
//    
//    public double gajiTotal(){
//        return gaji_pokok() + gajiLembur() + tunjangan();
//    }
///////////////////////
//    public void Over(){
//        System.out.println("Not happen anything..??");
//    }
//    public void Over(String nim){
//        System.out.print("NIM   : "+nim);
//    }
//    public void Over(String nim,String nama){
//        System.out.print("NIM   : "+nim);
//        System.out.print("Nama  : "+nama);
//    }
//    public void Over(String nim,String nama,double gaji_pokok){
//        System.out.print("NIM         : "+nim);
//        System.out.print("Nama        : "+nama);
//        System.out.print("Gaji Pokok  : "+gaji_pokok);
//    }
    
    
    
    
//    /**
//     * @return the NIP
//     */
//    public String getNIP() {
//        return NIP;
//    }
//
//    /**
//     * @return the nama
//     */
//    public String getNama() {
//        return nama;
//    }
//
//    /**
//     * @param gaji_pokok the gaji_pokok to set
//     */
//    public void setGaji_pokok(double gaji_pokok) {
//        this.gaji_pokok = gaji_pokok;
//    }
//
//    /**
//     * @param jam_lembur the jam_lembur to set
//     */
//    public void setJam_lembur(double jam_lembur) {
//        this.jam_lembur = jam_lembur;
//    }
//
//    /**
//     * @return the jumlah_anak
//     */
//    public int getJumlah_anak() {
//        return jumlah_anak;
//    }
//
//    /**
//     * @param jumlah_anak the jumlah_anak to set
//     */
//    public void setJumlah_anak(int jumlah_anak) {
//        this.jumlah_anak = jumlah_anak;
//    }
////////////////////////////
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

    /**
     * @return the honor_lembur
     */
    public double getHonor_lembur() {
        return honor_lembur;
    }

    /**
     * @param honor_lembur the honor_lembur to set
     */
    public void setHonor_lembur(double honor_lembur) {
        this.honor_lembur = honor_lembur;
    }
    
    
}
