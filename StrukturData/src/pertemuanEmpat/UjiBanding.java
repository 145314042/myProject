/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanEmpat;

/**
 *
 * @author Lycorice
 */
public class UjiBanding {
    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa("101","Yuuki",3.5);
        Mahasiswa mhs2=new Mahasiswa("102","Asuna",4.0);
        
        if (mhs1.compareTo(mhs2)==0) System.out.println("IPK "+mhs1.getNama()+" ("+
                mhs1.getNIM()+") sama dengan "+mhs2.getNama()+" ("+mhs2.getNIM()+")");
        else if (mhs1.compareTo(mhs2)>0) System.out.println("IPK "+mhs1.getNama()+" ("+
                mhs1.getNIM()+") lebih besar dari "+mhs2.getNama()+" ("+mhs2.getNIM()+")");
        else System.out.println("IPK "+mhs1.getNama()+" ("+mhs1.getNIM()+") lebih kecil dari "+
                mhs2.getNama()+" ("+mhs2.getNIM()+")");
    }
}
