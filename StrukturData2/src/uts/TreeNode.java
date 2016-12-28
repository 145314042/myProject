package uts;
import javax.swing.JTree;

/**
 *
 * @author Lycorice
 */
public class TreeNode {
    private int iData;
    private TreeNode leftChild;
    private TreeNode rightChild;
    

    public TreeNode(int iData) {
        this.iData = iData;
        setLeftChild(null);
        setRightChild(null);
    }

    public TreeNode() {
        setiData('0');
        setLeftChild(null);
        setRightChild(null);
    }

    public TreeNode(int iData, TreeNode leftChild, TreeNode rightChild) {
        setiData(iData);
        setLeftChild(leftChild);
        setRightChild(rightChild);
    }
    public int getiData() {
        return iData;
    }

    public void setiData(int iData) {
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
}
