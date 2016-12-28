/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latUAS;

/**
 *
 * @author Kirizu
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private double us1;
    private double us2;
    private double uas;
    double Final;
    
    public Mahasiswa(String nim,String nama){
        this.nim=nim;
        this.nama=nama;
    }
    
    public double hitFinal(){
        return Final=((0.3*getUs1())+(0.3*getUs2())+(0.4*getUas()));
    }
    
    public String konversi(){
        String konversi = null;
        if (80<=Final&&Final<=100)konversi="A";
        else if (65<=Final&&Final<80)konversi="B";
        else if (55<=Final&&Final<65)konversi="C";
        else if (40<=Final&&Final<55)konversi="D";
        else if (0<=Final&&Final<40)konversi="E";
        else konversi = "error";
        return konversi;
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
     * @return the us1
     */
    public double getUs1() {
        return us1;
    }

    /**
     * @param us1 the us1 to set
     */
    public void setUs1(double us1) {
        this.us1 = us1;
    }

    /**
     * @return the us2
     */
    public double getUs2() {
        return us2;
    }

    /**
     * @param us2 the us2 to set
     */
    public void setUs2(double us2) {
        this.us2 = us2;
    }

    /**
     * @return the uas
     */
    public double getUas() {
        return uas;
    }

    /**
     * @param uas the uas to set
     */
    public void setUas(double uas) {
        this.uas = uas;
    }
}
