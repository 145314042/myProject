/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UKM4;

import UKM3.*;
import UKM2.*;
import UKM.*;

/**
 *
 * @author admin
 */
public class MasyarakatSekitar extends Penduduk {

    private String nomor;

    public MasyarakatSekitar() {
    }

    public MasyarakatSekitar(String nomor, String nama, String TempatTanggalLahir) {
        super(nama, TempatTanggalLahir);
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    @Override
    public double hitungIuran() {
        return Double.parseDouble(nomor) * 100;
    }

}
