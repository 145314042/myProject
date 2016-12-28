/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui5;

import java.util.*;

/**
 *
 * @author Lycorice
 */
public class StringConstructors {
    public static void main(String args[]) {
        char charArray[] = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        if (s.equals("hello")) System.out.println("s is equals as \"hello\"");
        else System.out.println("s is not equals as \"hello\"");
        if (s.equalsIgnoreCase("HELLO")) System.out.println("s is equals as \"hello\"");
        else System.out.println("s is not equals as \"hello\"");
        if (s3.contains("day")) System.out.println("s3 contains \"day\"");
        else System.out.println("s3 do not contains \"day\"");
        String s5 = s.concat(" " + s3);
        System.out.println(s5);
        String s6 = s5.replaceAll("hello", "happy");
        System.out.println(s6);
        String[] s7 = new String[3];
        s7 = s6.split(" ");
        for (int i = 0; i < s7.length; i++) {
            System.out.println(s7[i]);
        }
        StringTokenizer tokens = new StringTokenizer(s6);
        System.out.println("Number of Token =" + tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
