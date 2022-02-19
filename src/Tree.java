public class Tree {
    Node root;

    public void voegToe(Node huidig, int waarde){
        Node wait;

        if(root == null){
            root = huidig;
            wait = root;
        }
        else{
            wait = huidig;
        }

        if(wait.left == null){
            wait.left = huidig;
        }
        else{
            wait.right = huidig;
        }

    }

    public String toString(){
        return root.toString();

    }

}

