package pertemuan08;

import java.util.LinkedList;

public class DinamicStack {

    private LinkedList tumpukan = new LinkedList();

    public DinamicStack() {
    }

    public void push(TreeNode node) {
        tumpukan.addFirst(node);
    }

    public TreeNode pop() {
        return (TreeNode) tumpukan.removeFirst();
    }

    public synchronized int size() {
        return tumpukan.size();
    }

    public boolean isEmpty() {
        return tumpukan.isEmpty();
    }
}
