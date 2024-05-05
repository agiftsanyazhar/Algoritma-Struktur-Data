package pkg152011513020_staticbtree;

public class Main {

    public static void main(String[] args) {
        StaticBTree();
    }
    
    public static void StaticBTree(){
        StaticBTree a;

        a   = new StaticBTree(7);

        a.insert(20);
        a.insert(10);
        a.insert(30);
        a.insert(5);
        a.insert(17);
        a.insert(25);
        a.insert(50);

        a.disp();
    }
}