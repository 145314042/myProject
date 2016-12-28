/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanEnam;

/**
 *
 * @author Lycorice
 */
public class Desc_No_02a {
    public static void main(String[] args) {
        Desc_Penduduk[] data={
            new Desc_Penduduk("Jakarta Pusat", 889448),
            new Desc_Penduduk("Yogyakarta", 433539),
            new Desc_Penduduk("Surakarta", 506397),
            new Desc_Penduduk("Bogor", 891467),
            new Desc_Penduduk("Medan", 2029797),
            new Desc_Penduduk("Bandung", 2288570)
        };
        
        for (int iterasi = 0; iterasi <= data.length-1; iterasi++) {
            for (int element = 0; element < data.length-1-iterasi; element++) {
                if (data[element].compareTo(data[element+1])>0) {
                    Desc_Penduduk temp = data[element];
                    data[element]=data[element+1];
                    data[element+1]=temp;
                }
            }
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("#"+(i+1)+" "+data[i].getDaerah()+" "+data[i].getJumlah());
        }
    }
}
