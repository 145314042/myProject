/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Kirizu
 */
public class Kalkulator {
    private double bil1;
    private double bil2;
    String operasi;

    /**
     * @return the bil1
     */
    public double getBil1() {
        return bil1;
    }

    /**
     * @param bil1 the bil1 to set
     */
    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    /**
     * @return the bil2
     */
    public double getBil2() {
        return bil2;
    }

    /**
     * @param bil2 the bil2 to set
     */
    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }
    
    /**
     * @return the operasi
     */
//    public String getOperasi() {
//        return operasi;
//    }
//
//    /**
//     * @param operasi the operasi to set
//     */
//    public void setOperasi(String operasi) {
//        this.operasi = operasi;
//    }
    
//    public void op(){
//        if ("+".equals(operasi))double jumlah = getBil1() + getBil2();
//        else if ("-".equals(operasi))double jumlah = getBil1() - getBil2();
//        else if ("*".equals(operasi))double jumlah = getBil1() * getBil2();
//        else if ("/".equals(operasi))double jumlah = getBil1() / getBil2();
//        double hasil=jumlah;
//        return hasil
//    }
    public double penjumlahan(){
        double jumlah = getBil1() + getBil2();
        return jumlah;
    }
    public double pengurangan(){
        double jumlah = getBil1() - getBil2();
        return jumlah;
    }
    public double perkalian(){
        double jumlah = getBil1() * getBil2();
        return jumlah;
    }
    public double pembagian(){
        double jumlah = getBil1() / getBil2();
        return jumlah;
    }

    
}