/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author Kirizu
 */
public class Perusahaan {
    private String kodePerusahaan;
    private String namaPerusahaan;
    private Pegawai kepalaPerusahaan;

    public Perusahaan(String kodePerusahaan, String namaPerusahaan) {
        this.kodePerusahaan = kodePerusahaan;
        this.namaPerusahaan = namaPerusahaan;
    }

    /**
     * @return the kodePerusahaan
     */
    public String getKodePerusahaan() {
        return kodePerusahaan;
    }

    /**
     * @return the namaPerusahaan
     */
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    /**
     * @return the kepalaPerusahaan
     */
    public Pegawai getKepalaPerusahaan() {
        return kepalaPerusahaan;
    }

    /**
     * @param kepalaPerusahaan the kepalaPerusahaan to set
     */
    public void setKepalaPerusahaan(Pegawai kepalaPerusahaan) {
        this.kepalaPerusahaan = kepalaPerusahaan;
    }

}
