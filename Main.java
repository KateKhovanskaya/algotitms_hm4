public class Main {
    public static void main (String [] args){
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(5);
        tree.add(9);
        // tree.add(7);
        tree.add(13);
        tree.add(15);
        tree.add(17);
        tree.add(7);
        tree.add(14);

        tree.print();
    }
}
