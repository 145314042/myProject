/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UKM;

/**
 *
 * @author admin
 */
public abstract class Penduduk {

    private String nama;
    private String TempatTanggalLahir;

    public Penduduk() {
        this.nama = "noname";
        this.TempatTanggalLahir = "0/0/0";
    }

    public Penduduk(String nama, String TempatTanggalLahir) {
        this.nama = nama;
        this.TempatTanggalLahir = TempatTanggalLahir;
    }

    public abstract double hitungIuran();

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
     * @return the TempatTanggalLahir
     */
    public String getTempatTanggalLahir() {
        return TempatTanggalLahir;
    }

    /**
     * @param TempatTanggalLahir the TempatTanggalLahir to set
     */
    public void setTempatTanggalLahir(String TempatTanggalLahir) {
        this.TempatTanggalLahir = TempatTanggalLahir;
    }

}
