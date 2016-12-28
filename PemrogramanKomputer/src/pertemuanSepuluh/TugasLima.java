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
public class TugasLima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int deret[][];
        int tingkat;
        System.out.print("Tingkat segitiga pascal : ");
        tingkat=z.nextInt();
        deret = new int[tingkat + 1][];

        deret[0] = new int[tingkat + 1];
        for (int i = 0; i < deret.length; i++) {
            deret[0][i] = 0;
        }
        deret[0][0] = 1;
        System.out.printf("%1$5d", 1);
        System.out.println("");

        for (int i = 1; i <= tingkat; i++) {
            deret[i] = new int[tingkat + 1];
            deret[i][0] = 1;
            System.out.printf("%1$5d", deret[i][0]);

            for (int j = 1; j <= tingkat; j++) {
                deret[i][j] = deret[i - 1][j - 1] + deret[i - 1][j];
                if (deret[i][j] > 0) {
                    System.out.printf("%1$5d", deret[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
