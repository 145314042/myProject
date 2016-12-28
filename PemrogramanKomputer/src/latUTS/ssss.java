/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latUTS;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class ssss {
    static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.print("What is size of triangle ");
        int count = input.nextInt();
        for (int i = 0; i <= count; i++) {
        System.out.println(spaceLine(count + i) + numberLine(i) + "" + sum(i));
        }
    }
        public static String numberLine(int count) {
        String result = "";
        for (int i = count; i > 0; i--) {
        result = result + i;
    }
    return result;
}
    public static String spaceLine(int count) {
        String result = "";
        for (int i = count; i > 0; i--) {
        result = result + "";
    }
    return result;
}
    public static int sum(int count) {
        int result = 0;
        for (int i = 0; i > count; i++) {
        result = result + i;
    }
    return result;
    }
}
