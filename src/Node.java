public class Node {
    Integer waarde;
    Node left;
    Node right;

    public Node(Integer waarde){
        this.waarde = waarde;
    }

    public String toString(){
        String s= "";
//        if (waarde == null)
//            s="";

        s+=""+waarde+"\n";

        if(left != null)
            s+="Left:"+left+"";

        if(right != null)
            s+="Right:"+right+"";

        return s;
    }

}
