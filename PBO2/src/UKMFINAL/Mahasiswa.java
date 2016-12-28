/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UKMFINAL;


/**
 *
 * @author admin
 */
public class Mahasiswa extends Penduduk {

    private String nim;

    public Mahasiswa() {
        super();
        this.nim = "0";
    }

    public Mahasiswa(String nim, String nama, String TempatTanggalLahir) {
        super(nama, TempatTanggalLahir);
        this.nim = nim;
    }

    @Override
    public double hitungIuran() {
        return Double.parseDouble(nim) / 10000;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

}
