package pertemuanSembilan;
import java.util.LinkedList;
/**
 * @author Lycorice
 */
public class DinamicStack {
    LinkedList tumpukan;
    public DinamicStack(){
        tumpukan = new LinkedList();
    }
    public void push(int data){
        tumpukan.addFirst(data);
    }
    public int pop(){
        return (int) tumpukan.removeFirst();
    }
    public int size(){
        return tumpukan.size();
    }
    public boolean isEmpty(){
        if (this.size()==0) return true;
        else return false;
    }
}
