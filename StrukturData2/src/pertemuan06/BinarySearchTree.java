package pertemuan06;

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
                        helpNode.getRightChild().setParent(helpNode);
                        helpNode = helpNode.getRightChild();
                    } else if (helpNode.getRightChild() == null) {
                        helpParent=helpNode;
                        helpNode.setRightChild(newNode);
                        helpNode.setParent(helpParent);
                        break;
                    }
                } else if (helpNode.getiData() >= newNode.getiData()) {
                    if (helpNode.getLeftChild() != null) {
                        helpNode.getLeftChild().setParent(helpNode);
                        helpNode = helpNode.getLeftChild();
                    } else if (helpNode.getLeftChild() == null) {
                        helpParent=helpNode;
                        helpNode.setLeftChild(newNode);
                        helpNode.setParent(helpParent);
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

//    public boolean find(int data){
//        TreeNode helpNode = new TreeNode();
//        helpNode=getRoot();
//        while(helpNode!=null){
//            if(data==helpNode.getiData())return true;
//            else if(data>helpNode.getiData())helpNode=helpNode.getRightChild();
//            else if(data<=helpNode.getiData())helpNode=helpNode.getLeftChild();
//        }
//        return false;
//    }
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

    public void delete(int data) {
        TreeNode helpNode = new TreeNode();
        TreeNode parrent = new TreeNode();
        TreeNode successor = new TreeNode();
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
            if (helpNode.getLeftChild()==null&&helpNode.getRightChild()==null) {
                parrent=helpNode.getParent();
                if (parrent.getLeftChild().getiData()==helpNode.getiData()) {
                    parrent.setLeftChild(null);
                }
                else if (parrent.getRightChild().getiData()==helpNode.getiData()){
                    parrent.setRightChild(null);
                }
            }
            else if (helpNode.getLeftChild()!=null&&helpNode.getRightChild()==null) {
                successor=helpNode.getLeftChild();
                parrent=helpNode.getParent();
                if (parrent.getLeftChild()==helpNode) {
                    parrent.setLeftChild(successor);
                }
                else if (parrent.getRightChild()==helpNode){
                    parrent.setRightChild(successor);
                }
                helpNode=null;
            }
            else if (helpNode.getLeftChild()==null&&helpNode.getRightChild()!=null) {
                successor=helpNode.getRightChild();
                parrent=helpNode.getParent();
                if (parrent.getLeftChild()==helpNode) {
                    parrent.setLeftChild(successor);
                }
                else if (parrent.getRightChild()==helpNode){
                    parrent.setRightChild(successor);
                }
                helpNode=null;
            }
            else if (helpNode.getLeftChild()!=null&&helpNode.getRightChild()!=null) {
                parrent=helpNode.getParent();
                if (helpNode.getRightChild().getLeftChild()!=null) {
                    successor=helpNode.getRightChild().getLeftChild();
                }
                else if (helpNode.getRightChild().getLeftChild()!=null) {
                    successor=helpNode.getLeftChild().getRightChild();
                }
                
            }
        }
    }
//    public boolean delete(int value) {
//        TreeNode parrent=new TreeNode();
//        TreeNode currnet=new TreeNode();
//        TreeNode bantu=new TreeNode();
//        boolean isLeftChild = true;
//        currnet=root;
//        parrent=root;
//        while (currnet.getiData()!=value){
//            currnet=parrent;
//            if (value<=currnet.getiData()) {
//                isLeftChild=true;
//                currnet=currnet.getLeftChild();
//            }
//            else if (value>currnet.getiData()) {
//                isLeftChild=false;
//                currnet=currnet.getRightChild();
//            }
//        }
//        if (currnet.getLeftChild()==null&&currnet.getRightChild()==null) {
//            if (currnet==root) {
//                root=null;
//            }
//            else if (isLeftChild){
//                currnet.setLeftChild(null);
//            }
//            
//        }
//    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

}
