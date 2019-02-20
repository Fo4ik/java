package cl8;

public class Main {


    public static void main(String[] args) {
        Node root = new Node(3);
        Node node2 = new Node(2);
        Node node1 = new Node(1);
        Node node5 = new Node(5);

        root.left = node2;
        root.right = node1;

        node2.right = node5;
    }

    public static boolean isSame(Node root) {

        return false;
    }
}
