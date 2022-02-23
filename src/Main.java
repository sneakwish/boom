public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree boom = new Tree();

        boom.insert(8);
        boom.insert(3);
        boom.insert(10);
        boom.insert(1);
        boom.insert(5);
        boom.insert(11);
        boom.insert(9);
//        boom.toStringCall();
        System.out.println(boom.toString(boom.root));
//        boom.printTree(boom.root);

//        boom.zoek(3);


    }
}
