/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanSepuluh;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class TugasEnam {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
//        TugasEnam panggil = new TugasEnam();
        int x = 1;
        int y = 1;
        int minFaktorial;
        int simpan;
        int hasil;
        System.out.print("Batas Segitiga : ");
        int batas = z.nextInt();
        for (int i = 0; i <= batas; i++) {
            x *= TugasEnam.A(i);
//            for (int j = batas; j >= i; j--) {
//                System.out.print(" ");
//            }
            for (int j = 0; j <= i; j++) {
                y *= TugasEnam.A(j);
                minFaktorial = TugasEnam.B(i, j);
                simpan = TugasEnam.faktorial(minFaktorial);
                hasil = x / (y * (simpan));
                System.out.print(hasil + " ");
            }
            y = 1;
            System.out.println("");
        }
    }
    static int A(int angka) {
        if (angka == 0) {
            return 1;
        } else {
            return angka;
        }
    }

    static int B(int x, int y) {
        if (x - y == 0) {
            return 1;
        } else {
            return x - y;
        }
    }

    static int faktorial(int angka) {
        int faktorial = 1;
        for (int x = 1; x <= angka; x++) {
            faktorial *= x;
        }
        return faktorial;
    }
}
