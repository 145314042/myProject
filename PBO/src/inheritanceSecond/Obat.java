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
public class Obat extends DataBarang{
    private String exp;
    private String dosis;
    
    public Obat(){
        super();
    }
    public Obat (String kode,String nama){
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
     * @return the dosis
     */
    public String getDosis() {
        return dosis;
    }

    /**
     * @param dosis the dosis to set
     */
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}
