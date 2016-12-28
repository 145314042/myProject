/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO3;

/**
 *
 * @author Kirizu
 */
public class Buku extends Koleksi{
    private int tebal;

    public Buku(String noRef,String judul) {
        super(noRef, judul);
    }

    @Override
    public double biaya() {
        return getLama()*(500*(getTebal()/100));
    }

    /**
     * @return the tebal
     */
    public int getTebal() {
        return tebal;
    }

    /**
     * @param tebal the tebal to set
     */
    public void setTebal(int tebal) {
        this.tebal = tebal;
    }
}
