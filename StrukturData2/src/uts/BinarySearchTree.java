package uts;

/**
 *
 * @author Lycorice
 */
public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public void insert(int id) {
        TreeNode newNode = new TreeNode(id);
        TreeNode helpNode = new TreeNode();
        TreeNode helpParent = new TreeNode();
        if (getRoot() != null) {
            helpNode = getRoot();
            while (true) {
                if (helpNode.getiData() < newNode.getiData()) {
                    if (helpNode.getRightChild() != null) {
                        helpNode = helpNode.getRightChild();
                    } else if (helpNode.getRightChild() == null) {
                        helpParent=helpNode;
                        helpNode.setRightChild(newNode);
                        break;
                    }
                } else if (helpNode.getiData() >= newNode.getiData()) {
                    if (helpNode.getLeftChild() != null) {
                        helpNode = helpNode.getLeftChild();
                    } else if (helpNode.getLeftChild() == null) {
                        helpParent=helpNode;
                        helpNode.setLeftChild(newNode);
                        break;
                    }
                }
            }
        } else if (getRoot() == null) {
            setRoot(new TreeNode(id));
            getRoot().setLeftChild(null);
            getRoot().setRightChild(null);
        }
    }
    public void find(int data) {
        TreeNode helpNode = new TreeNode();
        helpNode = getRoot();
        while (helpNode != null && helpNode.getiData() != data) {
            if (data <= helpNode.getiData()) {
                helpNode = helpNode.getLeftChild();
            } else if (data > helpNode.getiData()) {
                helpNode = helpNode.getRightChild();
            }
        }
        if (helpNode == null) {
            System.out.println("Data has not found.");
        } else if (helpNode.getiData() == data) {
            System.out.println("Data has found.");
        }
    }

    public void preOrder(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getiData() + " ");
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());
        }
    }

    public void inOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getRightChild());
        }
    }

    public void postOrder(TreeNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            System.out.print(localRoot.getiData() + " ");
        }
    }

//    public void delete(int data) {
//        TreeNode helpNode = new TreeNode();
//        TreeNode parrent = new TreeNode();
//        TreeNode successor = new TreeNode();
//        helpNode = getRoot();
//        while (helpNode != null && helpNode.getiData() != data) {
//            if (data <= helpNode.getiData()) {
//                helpNode = helpNode.getLeftChild();
//            } else if (data > helpNode.getiData()) {
//                helpNode = helpNode.getRightChild();
//            }
//        }
//        if (helpNode == null) {
//            System.out.println("Data has not found.");
//        } else if (helpNode.getiData() == data) {
//            if (helpNode.getLeftChild()==null&&helpNode.getRightChild()==null) {
//                parrent=helpNode.getParent();
//                if (parrent.getLeftChild().getiData()==helpNode.getiData()) {
//                    parrent.setLeftChild(null);
//                }
//                else if (parrent.getRightChild().getiData()==helpNode.getiData()){
//                    parrent.setRightChild(null);
//                }
//            }
//            else if (helpNode.getLeftChild()!=null&&helpNode.getRightChild()==null) {
//                successor=helpNode.getLeftChild();
//                parrent=helpNode.getParent();
//                if (parrent.getLeftChild()==helpNode) {
//                    parrent.setLeftChild(successor);
//                }
//                else if (parrent.getRightChild()==helpNode){
//                    parrent.setRightChild(successor);
//                }
//                helpNode=null;
//            }
//            else if (helpNode.getLeftChild()==null&&helpNode.getRightChild()!=null) {
//                successor=helpNode.getRightChild();
//                parrent=helpNode.getParent();
//                if (parrent.getLeftChild()==helpNode) {
//                    parrent.setLeftChild(successor);
//                }
//                else if (parrent.getRightChild()==helpNode){
//                    parrent.setRightChild(successor);
//                }
//                helpNode=null;
//            }
//            else if (helpNode.getLeftChild()!=null&&helpNode.getRightChild()!=null) {
//                parrent=helpNode.getParent();
//                if (helpNode.getRightChild().getLeftChild()!=null) {
//                    successor=helpNode.getRightChild().getLeftChild();
//                }
//                else if (helpNode.getRightChild().getLeftChild()!=null) {
//                    successor=helpNode.getLeftChild().getRightChild();
//                }
//                
//            }
//        }
//    }

    public TreeNode parent(int data){
        TreeNode nodeCurrent = getRoot();
        TreeNode nodeHelp = new TreeNode();
        if (data==getRoot().getiData()){
            System.out.println("Parrent tidak ada");
            return nodeHelp=null;
        }
        while (nodeCurrent != null && nodeCurrent.getiData() != data) {
            if (data <= nodeCurrent.getiData()) {
                nodeHelp=nodeCurrent;
                nodeCurrent = nodeCurrent.getLeftChild();
            } else if (data > nodeCurrent.getiData()) {
                nodeHelp=nodeCurrent;
                nodeCurrent = nodeCurrent.getRightChild();
            }
        }
        return nodeHelp;
    }
    
    public int sibling(int data){
        TreeNode nodeCurrent = getRoot();
        TreeNode nodeHelp = new TreeNode();
        
            if (data==getRoot().getiData()){
            System.out.println("Sibling tidak ditemukan ");
            nodeHelp=null;
            return nodeHelp.getiData();
        }
        while (nodeCurrent != null && nodeCurrent.getiData() != data) {
            if (data <= nodeCurrent.getiData()) {
                nodeHelp=nodeCurrent;
                nodeCurrent = nodeCurrent.getLeftChild();
                if (nodeHelp.getRightChild()!=null) nodeHelp=nodeHelp.getRightChild();
                else if (nodeHelp.getRightChild()==null) {
                    nodeHelp=null;
                    System.out.println("tidak punya sibling");
                }
            } else if (data > nodeCurrent.getiData()) {
                nodeHelp=nodeCurrent;
                nodeCurrent = nodeCurrent.getRightChild();
                if (nodeHelp.getLeftChild()!=null) nodeHelp=nodeHelp.getLeftChild();
                else if (nodeHelp.getLeftChild()==null) {
                    nodeHelp=null;
                    System.out.println("tidak punya sibling");
                }
            }
        }
        
        return nodeHelp.getiData();
    }
    
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
