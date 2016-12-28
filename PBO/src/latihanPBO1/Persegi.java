/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO1;

/**
 *
 * @author Kirizu
 */
public class Persegi extends Dimensi2{
    public Persegi(){
        super();
    }
    public Persegi(double panjang){
        super(panjang);
    }
    @Override
    public double Luas(){
        return getPanjang()*getPanjang();
    }
    @Override
    public double Keliling(){
        return 4*getPanjang();
    }
}
