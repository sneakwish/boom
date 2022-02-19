public class Node {
    Integer waarde;
    Node left;
    Node right;

    public Node(Integer waarde){
        this.waarde = waarde;
        left = null;
        right = null;
    }

    public String toString(){
        return "waarde is " + waarde;
    }

}
