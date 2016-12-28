/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Kirizu
 */
public class Computer extends Alat{
    private int jamPinjam;

    public Computer(int jamPinjam, String noAlat) {
        super(noAlat);
        this.jamPinjam = jamPinjam;
    }

    public Computer(int jamPinjam) {
        this.jamPinjam = jamPinjam;
    }
    @Override
    public double hitungBiaya() {
        return getJamPinjam() * 2000;
    }

    /**
     * @return the jamPinjam
     */
    public int getJamPinjam() {
        return jamPinjam;
    }

    /**
     * @param jamPinjam the jamPinjam to set
     */
    public void setJamPinjam(int jamPinjam) {
        this.jamPinjam = jamPinjam;
    }
}
