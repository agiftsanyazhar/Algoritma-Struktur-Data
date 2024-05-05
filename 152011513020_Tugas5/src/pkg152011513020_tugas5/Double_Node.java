package pkg152011513020_tugas5;

public class Double_Node {
    int info;       // memuat satu data integer
    Double_Node next;      // pointer to next node
    Double_Node prev;
    
    /**
    * constructor dengan parameter info
    * @param info
    */
    public Double_Node(int info){
        this.info   = info;
        this.next   = null;
        this.prev   = null;
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
    public void setNext(Double_Node next){
        this.next   = next;
    }
    
    public void setPrev(Double_Node prev){
        this.prev   = prev;
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
 pada address/ alamat yang merujuk pada node lain
 mengembalikan nilai pointer of Node
    * @return
    */
    public Double_Node getNext(){
        return this.next;
    }
    
    public Double_Node getPrev(){
        return this.prev;
    }
    
    /**
    * menyetak nilai yang termuat di dalam info
    */
    public void print(){
        System.out.println("Info    = " + this.info);
    }
}