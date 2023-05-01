package transactionbst.rightskewedtree;

import transactionbst.treedef.Node;

public class SkewedTree {
    public Node node;
    public Node prevNode = null;
    public Node headNode = null;

    public void convertBSTToRightSkewedTree(Node root){
        if(root==null){
            return;
        }
        convertBSTToRightSkewedTree(root.left);
        Node rightNode = root.right;
        if(headNode==null){
            headNode =root;
            root.left = null;
            prevNode = root;
        }
        else{
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
        convertBSTToRightSkewedTree(rightNode);
    }

    public void traverseSkewedTree(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        traverseSkewedTree(root.right);
    }
}
