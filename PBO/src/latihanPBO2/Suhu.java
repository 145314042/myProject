/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO2;

/**
 *
 * @author Kirizu
 */
public class Suhu {
    private double[] su;

    public Suhu() {
        this.su = su;
    }
    
    //method
    public double ctr(double suhu){
        return 4/5.0*suhu;
    }
    public double ctf(double suhu){
        return (9/5.0*suhu)+32;
    }
    public double rtc(double suhu){
        return 5/4.0*suhu;
    }
    public double rtf(double suhu){
        return (9/4.0*suhu)+32;
    }
    public double ftc(double suhu){
        return 5/9.0*(suhu-32);
    }
    public double ftr(double suhu){
        return 4/9.0*(suhu-32);
    }    
}
