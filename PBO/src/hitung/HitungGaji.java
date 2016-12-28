/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author Kirizu
 */
public class HitungGaji {
    public static double HitungGajiLembur(int JumlahJamKerja,int jamDefault, double upahPerJam){
        return (JumlahJamKerja-jamDefault) * upahPerJam; 
    }
}
