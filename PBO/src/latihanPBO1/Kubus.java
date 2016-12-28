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
public class Kubus extends Dimensi3 {
    public Kubus(){
        super();
    }
    public Kubus(double panjang){
        super(panjang);
    }
    @Override
    public double Volume() {
        return Math.pow(getPanjang(), 3);
    }

    @Override
    public double Luas() {
        return 6*getPanjang()*getPanjang();
    }
}
