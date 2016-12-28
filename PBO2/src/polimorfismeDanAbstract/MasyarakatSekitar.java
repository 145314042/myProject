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
public class MasyarakatSekitar extends Penduduk{
    private String nomor;
    //Constructor
    public MasyarakatSekitar() {
        super();
    }
    public MasyarakatSekitar(String nomor, String nama, String tempatTglLahir) {
        super(nama, tempatTglLahir);
        this.nomor = nomor;
    }
    //Method Override
    @Override
    public double hitungIuran() {
        return Double.parseDouble(getNomor())*100;
    }
    //Method get dan set
    /**
     * @return the nomor
     */
    public String getNomor() {
        return nomor;
    }
    /**
     * @param nomor the nomor to set
     */
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}
