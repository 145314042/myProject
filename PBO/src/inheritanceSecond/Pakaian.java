/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceSecond;

/**
 *
 * @author Kirizu
 */
public class Pakaian extends DataBarang{
    private String ukuran;
    private String warna;
    private double diskon;
    
    public Pakaian(){
        super();
    }
    public Pakaian (String kode,String nama){
        super(kode,nama);
    }
    
    /**
     * @return the ukuran
     */
    public String getUkuran() {
        return ukuran;
    }

    /**
     * @param ukuran the ukuran to set
     */
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * @return the diskon
     */
    public double getDiskon() {
        return diskon;
    }

    /**
     * @param diskon the diskon to set
     */
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
}
