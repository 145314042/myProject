/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Select;

import java.io.File;

/**
 *
 * @author Kirizu
 */
public class Select {

    public boolean selectFile(String name, File file) {
        //String name = nama file yang dicari
        //File file = nama direktori
        File[] list = file.listFiles();// melakukan list pada semua file di direktori
        if (list != null) {//cek isi array dengan file yang dicari
            for (File a : list) {
                if (a.getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }
    //contoh main class
    public static void main(String[] args) {
        Select s = new Select();
        boolean stat = s.selectFile("a.jpg"/*<nama file>.<ekstensi file>*/,
                new File("Picture"/*<nama folder didalam project>*/));
        if (stat = false) {
            System.out.println("tidak ada");
        }
        else System.out.println("ada");
    }
}
