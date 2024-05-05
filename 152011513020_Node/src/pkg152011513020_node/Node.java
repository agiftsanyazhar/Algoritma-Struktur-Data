package pkg152011513020_node;

public class Node {
    int info; // memuat satu data integer
    Node next; // pointer to next node
    
    /**
    * constructor dengan parameter info
    * @param info
    */
    public Node(int info){
        this.info    = info;
        this.next    = null;
    }
    
    /**
    * mengubah nilai variable info dengan nilai tertentu yang dimasukkan
    * dari luar melalui parameter input
    * @param info
    */
    public void setInfo(int info){
        this.info    = info;
    }
    
    /**
    * mengubah variable pointer next menunjuk ke object tertentu sesuai nilai
    * parameter input
    * @param next
    */
    public void setNext(Node next){
        this.next   = next;
    }
    
    /**
    * mengambil nilai info dari sebuah node
    * mengembalikan sebuah nilai integer
    * @return
    */
    public int getInfo(){
        return this.info;
    }
    
    /**
    * mengambil nilai pointer next, nilainya mungkin null atau merefers
    * pada address/ alamat yang merujuk pada node lain
    * mengembalikan nilai pointer of Node
    * @return
    */
    public Node getNext(){
        return this.next;
    }
    
    /**
    * menyetak nilai yang termuat di dalam info
    */
    public void print(){
        System.out.println("Info    = " + this.info);
    }
}