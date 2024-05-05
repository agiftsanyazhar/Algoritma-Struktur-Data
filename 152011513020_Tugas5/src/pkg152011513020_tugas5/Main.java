package pkg152011513020_tugas5;

public class Main {
    public static void main(String[] args) {
        nodeTest();
        listTest();
        dNodeTest();
        dListTest();
        CListTest();
        CdListTest();
    }
    
    public static void nodeTest(){
        Node n;
        n = new Node(15);
        
        n.disp();
        System.out.print("\n\n");
       
        Node t;
        t = new Node(20);
        n.setNext(t);
        
        t = n;
        t.disp();
        
        
        t = t.getNext();
        t.disp();
        System.out.print("\n\n");
    }
    
    public static void listTest(){
        List l;
        l = new List();
        l.addFront(30);
        l.addFront(20);
        l.addFront(10);
        l.addRear(40);
        l.addRear(50);
        l.addRear(60);
        l.addRear(70);
        l.disp();
       
        l.delFront();
        l.disp();
        
        l.delFront();
        l.disp();
        
        l.delRear();
        l.disp();
        
        l.delRear();
        l.disp();
        
        l.delInfo(40);
        l.disp();
    }
    
    public static void dNodeTest(){
        Double_Node n,t;
        n = new Double_Node(30);
        
        t = new Double_Node(10);
        
        t.setNext(n);
        
        n.setPrev(t);
        
        n = t;
        
        t.print();
        
        t = t.getNext();
        t.print();
    }
    
    public static void dListTest(){
        Double_Linked_List a;
        
        a = new Double_Linked_List();
        
        a.addFront(3);
        a.addFront(2);
        a.addFront(1);
        a.addRear(4);
        a.addRear(5);
        a.printMaju();
        a.delFront();
        a.printMaju();
        a.delRear();
        a.printMaju();
        a.delInfo(3);
        a.printMaju();
        a.printMundur();
    }
    
    public static void CListTest(){
        Circular_Linked_List a;
        
        a = new Circular_Linked_List();
        
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.print();
        a.delFront();
        a.print();
        a.delRear();
        a.print();
        a.delInfo(3);
        a.print();
    }
    
    public static void CdListTest(){
        Circular_Double_Linked_List a;
        
        a = new Circular_Double_Linked_List();
        
        a.addFront(1);
        a.addFront(2);
        a.addFront(3);
        a.addFront(4);
        a.addFront(5);
        a.print();
        a.delFront();
        a.print();
        a.delRear();
        a.print();
        a.delInfo(3);
        a.print();
    }
}