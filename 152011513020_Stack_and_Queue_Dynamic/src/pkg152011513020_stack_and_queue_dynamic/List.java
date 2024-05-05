package pkg152011513020_stack_and_queue_dynamic;

public class List {
    private int size; // jumlah node dalam list
    private Node front; // pointer menunjuk node depan
    private Node rear; // pointer menunjuk node belakang
    
    /**
     * deklarasi constructor
     */
    List(){
        this.size = 0;
        this.front = null;
        this.rear = null;
    }
    
    /**
     * check apakah list kosong
     * kembali / return true bila list kosong
     * kembali / return false bila list TIDAK KOSONG
     * @return 
     */
    public boolean empty(){
        return size==0;
    }
    
    /**
     * menambah node / data pada posisi depan
     * @param info
     */
    public void addFront(int info){
        Node t;
        t = new Node(info);
        
        if(empty()){ // kondisi awal list kosong
            this.front = t;
            this.rear = t;
            this.size++;
        }
        else { // proses menyambung node t di depan front
            t.setNext(this.front);
            this.front = t;
            this.size++;
        }
    }
    
    /**
     * menambahkan node / data pada posisi belakang
     * @param info
     */
    public void addRear(int info){
        Node t;
        t = new Node(info);
        
        if(empty()){ // keadaan list kosong
            this.front = t;
            this.rear = t;
            this.size++;
        }
        else { // proses menyambung node t di belakang rear
            this.rear.setNext(t);
            this.rear = t;
            this.size++;
        }
    }
    
    /**
     * menghapus node paling depan
     */
    public void delFront(){
        if(!this.empty()){
            this.front = this.front.getNext();
            this.size--;
            
            if(this.empty()){ // check apakah setelah dihapus list kosong
                this.front = null;
                this.rear = null;
            }
        }
    }
    
    public void delRear(){
        if(!this.empty()){
            Node t; // node sementara
            
            // awalnya t menunjuk ke front
            t = this.front;
            
            // t menunjuk ke node persis di depan rear
            while(t.getNext() != this.rear)
                t = t.getNext();
            
            // menghapus node yang ditunjuk oleh rear
            // selanjutnya rear menunjuk ke node yang ditunjuk oleh t
            t.setNext(null);
            this.rear = t;
            this.size--;
            
            if(this.empty()){
                this.front = null;
                this.rear = null;
            }
        }
    }
    
    
    /**
     * menghapus node dengan info tertentu
     * @param info
     */
    public void delInfo(int info){
        Node t1,t2;
        if(!this.empty()){
            // variable sementara t1 dan t2
            // t1 akan menunjuk ke node dengan info yang sesuai
            // t2 akan menunjuk node sebelum / di depan t1
            
            t1 = this.front;
            t2 = null;
            while((t1 != null) && (t1.getInfo() != info)){
                t2 = t1;
                t1 = t1.getNext();
            }
           
            // proses menghapus node yang diinginkan
            // ditunjut oleh t1
            if(t1 != null){
                if(t2 == null) // t1 menunjuk node paling depan
                    this.delFront();
                else if(t1.getNext()==null) // t1 menunjuk ke rear
                        this.delRear();
                      else { // t1 menunjuk node di tengah
                        t2.setNext(t1.getNext());
                        this.size--;
                      
                        if(this.empty()){
                            this.front = null;
                            this.rear = null;
                        }
                      }
            }
        }
    }
    
    public void disp(){
        Node t;
        t = this.front;
        while(t != null){
            t.disp();
            t = t.getNext();
        }
        System.out.print("\n\n");
    }
    
    
}