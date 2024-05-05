package pkg152011513020_stack_and_queue_dynamic;

public class Main {
    public static void main(String[] args) {
        nodeTest();
        listTest();
        stackStaticTest();
        queueStaticTest();
        stackDynamicTest();
//        queueDynamicTest();
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
        //l.delInfo(20);
        //l.disp();
    }
    
    public static void stackStaticTest(){
        StackStatic s;
        s = new StackStatic(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
    
    public static void queueStaticTest(){
        QueueStatic q;
        q = new QueueStatic(10);
        
        q.enq(10);
        q.enq(20);
        q.enq(30);
        q.disp();
        
        System.out.println("\n\n\n"+q.deq());
    }
    
    public static void stackDynamicTest(){
        StackDynamic s;
        
        s = new StackDynamic();
        System.out.println(s.empty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
        s.disp();
    }
    
    public static void queueDynamicTest(){
        QueueDynamic a;
        
        a=new QueueDynamic();
        
        a.enq(10);
        a.enq(20);
        a.enq(30);
        a.enq(40);
        a.enq(50);
        a.disp();
        System.out.println(a.deq());
        a.disp();
        System.out.println(a.empty());
    }
}