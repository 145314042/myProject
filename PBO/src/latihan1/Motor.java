/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author Kirizu
 */
public class Motor extends Kendaraan {
    public Motor(String noPlat) {
        super(noPlat);
    }
    @Override
    public double hitungTarif() {
        return 3000;
    }
}
