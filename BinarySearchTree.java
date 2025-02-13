public class BinarySearchTree {

    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;
    public void insert(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        Node current = root;

        while(true){
            if(value < current.data){
                if(current.left == null){
                    current.left = new Node(value);
                    return;
                }
                current = current.left;
            }
            else{
                if(current.right == null){
                    current.right = new Node(value);
                    return;
                }
                current = current.right;
            }
        }
    }

    public void delete(int value){
        while(root != null){
            if(root.right == null && root.left == null){
                if(value == root.data){
                    root = null;
                    return;
                }
            }else{
                Node current = root;
                if(value == current.left.data){
                    current.left = current.left.right;
                    current.left.left = current.left.right.left;
                    return;
                }
                current = current.left;

                if(value == current.right.data){
                    current.right = current.right.right;
                    current.right.left= current.right.right.left;
                    return;
                }
                current = current.right;
            }

        
            
        }
    }

}
