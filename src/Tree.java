public class Tree {
    Node root;


    public void insert(int waarde) {
        root = addNode(root, waarde);
    }

    public Node addNode(Node node, int waarde) {

        if (node == null) {
            return new Node(waarde);
        }
        else {
            if (waarde < node.waarde) {
                node.left = addNode(node.left, waarde);
            }
            else if(waarde> node.waarde) {
                node.right = addNode(node.right, waarde);
            }
            return node;
        }
    }

    public void zoek(int waarde){
        Node zoek2 = zoekNode(root, waarde);
//        System.out.println(zoek2.toString());

    }

    public Node zoekNode(Node node, int waarde){
        if(root == null || waarde == node.waarde)
            return root;

        if (root.waarde > waarde)
            return zoekNode(root.left, waarde);

        else
        return zoekNode(root.right, waarde);

    }

//    public void toStringCall(){
//        toString(root);
//    }
int i = 0;
    public String toString(Node node){
        String s = "";


        if(node == null)
            return s="";

        s+=node.waarde+"\n";

        if(node.left != null) {
            s += "<";
            i++;
            s += toString(node.left);
            s+="ds"+i;
        }

//        if(node.right != null)
//            s+=right+toString(node.right);

        return s;
    }

}

