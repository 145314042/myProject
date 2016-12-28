/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A102215;

/**
 *
 * @author Lycorice
 */
public class Mahasiswa implements Comparable{
    private String NIM;
    private String nama;

    public Mahasiswa(String NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
    }

    @Override
    public int compareTo(Object o) {
        return (this.nama).compareTo(((Mahasiswa)o).getNama());
//        return (this.nama).compareTo(((Mahasiswa)o).getNIM());
    }

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
}
