package pertemuanSepuluh;
/**
 *
 * @author Lycorice
 */
public class StaticQueue{
    private int[] element;
    private int front;
    private int rear;
    private int size;
    public StaticQueue() {}
    public StaticQueue(int ukuran) {
        element = new int[ukuran];
        front = 0;
        rear = 0;
        size = 0;
    }
    public boolean enQueue(int data){
        try {
            if (size < element.length){
                element[rear] = data;
                if (rear == element.length-1) rear = 0;
                else rear++;
                size++;
            }
            else System.out.println("Queue is Full");
            return true;
        } catch (Exception ex){
            System.out.println("Queue is full!");
            return false;
        }
    }
    public int deQueue(){
        int keluar = element[front];
        if (front == element.length-1) front = 0;
        else front++;
        size--;
        return keluar;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        if (this.size > 0) return false;
        else return true;
    }
}
