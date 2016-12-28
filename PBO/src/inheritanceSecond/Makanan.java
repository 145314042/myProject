/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceSecond;

/**
 *
 * @author Kirizu
 */
public class Makanan extends DataBarang{
    private String exp;
    private String asal;
    
    public Makanan(){
        super();
    }
    public Makanan (String kode,String nama){
        super(kode,nama);
    }
    
    /**
     * @return the exp
     */
    public String getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(String exp) {
        this.exp = exp;
    }

    /**
     * @return the asal
     */
    public String getAsal() {
        return asal;
    }

    /**
     * @param asal the asal to set
     */
    public void setAsal(String asal) {
        this.asal = asal;
    }
}
