package pertemuan05;
/**
 *
 * @author Lycorice
 */
public class TreeNode {
    private int iData;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode() {
    }
    
    public TreeNode(int iData) {
        this.iData = iData;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public TreeNode(int iData, TreeNode leftChild, TreeNode rightChild) {
        this.iData = iData;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
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
