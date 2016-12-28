/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismeDanAbstract;

/**
 *
 * @author Kirizu
 */
public abstract class Penduduk {
    protected String nama;
    protected String tempatTglLahir;
    //Costructor
    public Penduduk() {
        this.nama = nama;
        this.tempatTglLahir = tempatTglLahir;
    }
    public Penduduk(String nama, String tempatTglLahir) {
        this.nama = nama;
        this.tempatTglLahir = tempatTglLahir;
    }
    //Method Abstract
    public abstract double hitungIuran();
    //Method Set dan Get
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
     * @return the tempatTglLahir
     */
    public String getTempatTglLahir() {
        return tempatTglLahir;
    }
    /**
     * @param tempatTglLahir the tempatTglLahir to set
     */
    public void setTempatTglLahir(String tempatTglLahir) {
        this.tempatTglLahir = tempatTglLahir;
    }
}
