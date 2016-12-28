package pertemuanSembilan;
/**
 * @author Lycorice
 */
public class StaticStack {
    int[] element;//data stack
    int front;//yg paling atas
    int size;//ukuran stack
    public StaticStack() {
        element = new int[100];
        size = 0;
        front = -1;
    }
    public StaticStack(int ukuran) {
        element = new int[ukuran];
        size = 0;
        front = -1;
    }
    public boolean push(int data){//memasukkan data
        try {
            element[front+1]=data;
            front++;
            size++;
            return true;            
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public int pop(){
        try {
            int keluar =element[front];
            front--;
            size--;
            return keluar;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        if (this.size==0) return true;
        else return false;
    }
}
