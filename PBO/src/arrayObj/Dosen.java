/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayObj;

/**
 *
 * @author Kirizu
 */
public class Dosen {
    private String nip;
    private String nama;
    private  Mahasiswa[]  bimbingan;
  
    public Dosen(String no, String nm)  {
        nip=no;
        nama=nm;
    }
    public String getNip() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    public Mahasiswa[] getMahasiswa() {
        return bimbingan;
    }
    public void setMahasiswa(Mahasiswa[] mhs) {
        this.bimbingan= mhs;
    }

}
