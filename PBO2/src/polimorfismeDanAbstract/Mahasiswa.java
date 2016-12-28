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
public class Mahasiswa extends Penduduk{
    private String NIM;
    //Constructor
    public Mahasiswa() {
        super();
    }
    public Mahasiswa(String NIM, String nama, String tempatTglLahir) {
        super(nama, tempatTglLahir);
        this.NIM = NIM;
    }
    //Method override
    @Override
    public double hitungIuran() {
        return Double.parseDouble(getNIM())/10000;
    }
    //Method set dan get
    /**
     * @return the NIM
     */
    public String getNIM() {
        return NIM;
    }
    /**
     * @param NIM the NIM to set
     */
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
}
