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
public class Lingkaran extends Dimensi2 {
    public Lingkaran(){
        super();
    }
    public Lingkaran(double panjang){
        super(panjang);
    }
    @Override
    public double Luas(){
        return 3.14*getPanjang()*getPanjang();
    }
    @Override
    public double Keliling(){
        return 3.14*getPanjang()*2;
    }
}
