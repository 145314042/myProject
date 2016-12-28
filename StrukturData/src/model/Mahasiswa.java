/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Mahasiswa implements Comparable {

    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    @Override
    public int compareTo(Object o) {
        Mahasiswa mhs = (Mahasiswa) o;
        if (this.getIpk() == mhs.getIpk()) {
            return 0;
        } else if (this.getIpk() > mhs.getIpk()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

}
