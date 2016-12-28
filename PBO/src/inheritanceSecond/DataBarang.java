/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceSecond;

/**
 *
 * @author Kirizu
 */
public class DataBarang {
    protected String kode;
    protected String nama;
    protected double harga;
    
    public DataBarang(){
        this.kode=null;
        this.nama=null;
    }
    public DataBarang(String kode,String nama){
        this.kode=kode;
        this.nama=nama;
    }
    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
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
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
}
