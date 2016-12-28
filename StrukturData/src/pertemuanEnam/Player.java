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
public class Player implements Comparable{
    private String nama;
    private int score;

    public Player(String nama, int score) {
        this.nama = nama;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Player other=(Player) o;
        if (this.getScore()>other.getScore()) return 1;
        else if (this.getScore()<other.getScore()) return -1;
        else return 0;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
}
