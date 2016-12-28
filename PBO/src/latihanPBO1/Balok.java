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
public class Balok extends Dimensi3{
    public Balok(){
        super();
    }
    public Balok(double panjang,double lebar,double tinggi){
        super(panjang,lebar,tinggi);
    }
    @Override
    public double Volume() {
        return getPanjang()*getLebar()*getTinggi();
    }

    @Override
    public double Luas() {
        return (2*getPanjang()*getLebar())+(2*getPanjang()*getTinggi())+(2*getLebar()*getTinggi());
    }
}
