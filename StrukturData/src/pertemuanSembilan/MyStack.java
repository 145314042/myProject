package pertemuanSembilan;
/**
 * @author Lycorice
 */
public class MyStack {
    public static void main(String[] args) {
//        StaticStack myStuck = new StaticStack(6);
        DinamicStack myStuck = new DinamicStack();
        myStuck.push(100);
        myStuck.push(200);
        myStuck.push(300);
        myStuck.push(400);
        myStuck.push(500);
        myStuck.push(600);
        while (!myStuck.isEmpty()){
            System.out.println(myStuck.pop());
        }
    }
}
