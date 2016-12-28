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
public class Desc_No_02b{
    public static void main(String[] args) {
        Desc_Penduduk[] data={
            new Desc_Penduduk("Jakarta Pusat", 889448),
            new Desc_Penduduk("Yogyakarta", 433539),
            new Desc_Penduduk("Surakarta", 506397),
            new Desc_Penduduk("Bogor", 891467),
            new Desc_Penduduk("Medan", 2029797),
            new Desc_Penduduk("Bandung", 2288570)
        };
        
        for (int iterasi = 0; iterasi <= data.length-2; iterasi++) {
            int minIndex=iterasi;
            for (int element = iterasi+1; element <=data.length-1; element++) {
                if (data[element].compareTo(data[minIndex])<0) {
                    minIndex=element;
                }
            }
            Desc_Penduduk temp = data[iterasi];
            data[iterasi]=data[minIndex];
            data[minIndex]=temp;
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("#"+(i+1)+" "+data[i].getDaerah()+" "+data[i].getJumlah());
        }
    }
}
