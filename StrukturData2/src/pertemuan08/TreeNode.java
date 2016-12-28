package pertemuan08;
import javax.swing.JTree;
public class TreeNode {
    private char iData;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode parent;
    

    public TreeNode(char iData) {
        this.iData = iData;
        setLeftChild(null);
        setRightChild(null);
    }

    public TreeNode() {
        setiData('0');
        setLeftChild(null);
        setRightChild(null);
    }

    public TreeNode(char iData, TreeNode leftChild, TreeNode rightChild) {
        setiData(iData);
        setLeftChild(leftChild);
        setRightChild(rightChild);
    }
    public char getiData() {
        return iData;
    }

    public void setiData(char iData) {
        this.iData = iData;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
}
