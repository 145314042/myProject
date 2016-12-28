package pertemuanSepuluh;
import java.util.LinkedList;
/**
 *
 * @author Lycorice
 */
public class DinamicQueue {
    LinkedList queue;

    public DinamicQueue() {
        queue = new LinkedList();
    }
    public void enQueue(int data){
        queue.addLast(data);
    }
    public int deQueue(){
        return (int )queue.removeFirst();
    }
    public int size(){
        return queue.size();
    }
    public boolean isEmpty(){
        if (this.size() > 0) return false;
        else return true;
    } 
}
