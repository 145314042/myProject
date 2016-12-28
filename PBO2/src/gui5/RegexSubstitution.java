/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui5;

/**
 *
 * @author Lycorice
 */
public class RegexSubstitution {
    public static void main(String args[]) {
        String firstString = "Every day is sunday";
        String secondString = "Vini pergi ke pasar 3 jam lalu, bersama 4 temannya";
        System.out.printf("Original String 1: %s\n", firstString);
        firstString = firstString.replaceAll("\\bday\\b", "week there"); // jelaskan
        System.out.printf(
                "Original string 1 become : %s\n", firstString);
        System.out.printf("Original String 2: %s\n", secondString);
        secondString = secondString.replaceAll("[a]", "o");//jelaskan
        System.out.printf(
                "Original string 2 become : %s\n", secondString);
        System.out.printf("Every word replaced by \"word\": %s\n\n",
                firstString.replaceAll("\\w+", "word")); // jelaskan
        secondString = secondString.replaceFirst("\\d", "digit");// jelaskan
        System.out.printf("?? %s\n", secondString); //isilah ?? dengan kalimat yang sesuai
        String output = "String split at commas: [";
        String[] results = secondString.split(",\\s*"); // jelaskan
        for (String string : results) // jelaskan sintaks ini
        {
            output += "\"" + string + "\", ";
        }
        System.out.println("Hasil split : " + output);
        output = output.substring(0, output.length() - 2) + "]";
        System.out.println(output);
    } // end main
} // end class RegexSubstitution

