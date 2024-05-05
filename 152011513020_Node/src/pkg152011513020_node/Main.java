package pkg152011513020_node;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Node");
        System.out.println("-------------------------------------------------");
        
        Node x = new Node(5);
        Node y = new Node(10);
        Node z = new Node(15);
        
        x.print();
        y.print();
        z.print();

        x.setNext(y);
        y.setNext(z);

        System.out.println(x.getInfo());
        System.out.println(x.getNext().getInfo());
        System.out.println(x.getNext().getNext().getInfo());
    }   
}