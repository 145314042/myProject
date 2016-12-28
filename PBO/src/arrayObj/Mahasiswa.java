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
public class Mahasiswa {
    private String nama;
    private String nim;
    private String alamat;
    private int umur;
    private float ipk;
    private double uts1;
    private double uts2;
    private double uas;
    private double nilaiakhir;
    private String tertua;
    private String termuda;

//    public Mahasiswa(String nama, String nim, String alamat) {
//        this.nama = nama;
//        this.nim = nim;
//        this.alamat = alamat;
//    }
    
    public Mahasiswa (String nim,String nama){
        this.nama=nama;
        this.nim=nim;
    }

//    Mahasiswa() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public double HitFinal(){
        double hasil=(0.3*getUts1())+(0.3*getUts2())+(0.4*getUas());
        return hasil;
    }
    public String hitHuruf(){
        String h = null;
        if (80<=getNilaiakhir()&&getNilaiakhir()<=100)h="A";
        else if (65<=getNilaiakhir()&&getNilaiakhir()<80)h="B";
        else if (55<=getNilaiakhir()&&getNilaiakhir()<65)h="C";
        else if (45<=getNilaiakhir()&&getNilaiakhir()<55)h="D";
        else if (0<=getNilaiakhir()&&getNilaiakhir()<45)h="E";
        else h="Data salah";
        return h;
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
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the ipk
     */
    public float getIpk() {
        return ipk;
    }

    /**
     * @param ipk the ipk to set
     */
    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    /**
     * @return the uts1
     */
    public double getUts1() {
        return uts1;
    }

    /**
     * @param uts1 the uts1 to set
     */
    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    /**
     * @return the uts2
     */
    public double getUts2() {
        return uts2;
    }

    /**
     * @param uts2 the uts2 to set
     */
    public void setUts2(double uts2) {
        this.uts2 = uts2;
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

    /**
     * @return the nilaiakhir
     */
    public double getNilaiakhir() {
        return nilaiakhir;
    }

    /**
     * @param nilaiakhir the nilaiakhir to set
     */
    public void setNilaiakhir(double nilaiakhir) {
        this.nilaiakhir = nilaiakhir;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the tertua
     */
    public String getTertua() {
        return tertua;
    }

    /**
     * @param tertua the tertua to set
     */
    public void setTertua(String tertua) {
        this.tertua = tertua;
    }

    /**
     * @return the termuda
     */
    public String getTermuda() {
        return termuda;
    }

    /**
     * @param termuda the termuda to set
     */
    public void setTermuda(String termuda) {
        this.termuda = termuda;
    }
}
