/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UKM3;

import UKM2.*;
import UKM.*;

/**
 *
 * @author admin
 */
public class UKM {

    private String namaUnit;
    private Mahasiswa ketua;
    private Mahasiswa sekretaris;
    private Penduduk[] anggota;

    public UKM() {
        this.namaUnit = "undefined";
        anggota = new Penduduk[20];
    }

    public UKM(String namaUnit) {
        this.namaUnit = namaUnit;
        anggota = new Penduduk[20];
    }

    /**
     * @return the namaUnit
     */
    public String getNamaUnit() {
        return namaUnit;
    }

    /**
     * @param namaUnit the namaUnit to set
     */
    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    /**
     * @return the ketua
     */
    public Mahasiswa getKetua() {
        return ketua;
    }

    /**
     * @param ketua the ketua to set
     */
    public void setKetua(Mahasiswa ketua) {
        this.ketua = ketua;
    }

    /**
     * @return the sekretaris
     */
    public Mahasiswa getSekretaris() {
        return sekretaris;
    }

    /**
     * @param sekretaris the sekretaris to set
     */
    public void setSekretaris(Mahasiswa sekretaris) {
        this.sekretaris = sekretaris;
    }

    /**
     * @return the anggota
     */
    public Penduduk[] getAnggota() {
        return anggota;
    }

    /**
     * @param anggota the anggota to set
     */
    public void setAnggota(Penduduk[] anggota) {
        this.anggota = anggota;
    }

}
