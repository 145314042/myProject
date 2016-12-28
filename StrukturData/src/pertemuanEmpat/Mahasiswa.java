/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanEmpat;

/**
 *
 * @author Lycorice
 */
public class Mahasiswa implements Comparable{
    private String NIM;
    private String nama;
    private double IPK;
    public Mahasiswa(String NIM, String nama, double IPK) {
        this.NIM = NIM;
        this.nama = nama;
        this.IPK = IPK;
    }
    @Override
    public int compareTo(Object o) {
        Mahasiswa mhs=(Mahasiswa) o;
        if (Integer.parseInt(this.getNIM())==Integer.parseInt(mhs.getNIM())) return 0;
        else if (Integer.parseInt(this.getNIM())>Integer.parseInt(mhs.getNIM())) return 1;
        else return -1;
    }
    //method set get
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
     * @return the IPK
     */
    public double getIPK() {
        return IPK;
    }
    /**
     * @param IPK the IPK to set
     */
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
}
