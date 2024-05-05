package pkg152011513020_node;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Node");
        System.out.println("-------------------------------------------------");
        
        Node x = new Node(5);
        Node y = new Node(10);
        Node z = new Node(15);
        
        x.setInfo(8);
        
        x.print();
        y.print();
        z.print();

        x.setNext(y);
        y.setNext(z);

        System.out.println(x.getInfo());
        System.out.println(x.getNext().getInfo());
        System.out.println(x.getNext().getNext().getInfo());
        
        System.out.print("\n\n");
        System.out.println("-------------------------------------------------");
        System.out.println("List");
        System.out.println("-------------------------------------------------");
        
        List a;

        a = new List();

        a.addFront(5);
        a.addFront(10);
        a.addFront(15);
        a.addFront(20);
        
        a.addRear(25);
        a.addRear(30);
        a.addRear(35);
        a.addRear(40);

        a.print();

        a.delFront();
        a.print();
        
        a.delFront();
        a.print();

        a.delRear();
        a.print();
        
        a.delRear();
        a.print();

        System.out.print("\n");
        System.out.println("Found       = " + a.found(5));
        System.out.println("Found       = " + a.found(10));
        System.out.println("Found       = " + a.found(15));
        
        System.out.print("\n");
        System.out.println("Position    = " + a.getPosition(1));
        
        System.out.print("\n");
        System.out.println("Delete      = " + a.getPosition(3));
    }   
}