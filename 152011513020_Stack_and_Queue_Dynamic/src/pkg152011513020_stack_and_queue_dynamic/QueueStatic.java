package pkg152011513020_stack_and_queue_dynamic;

public class QueueStatic {
    private int[] data; // menyimpan data
    private int front; // menunjuk indeks data paling depan
    private int rear; // menunjuk indeks data paling akhir
    private int maxSize;
    
    /**
     * deklarasi constructor
     * @param maxSize
     */
    public QueueStatic(int maxSize){
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.data = new int[maxSize];
    }
    
    public boolean empty(){
        return(this.front == this.rear);
    }
    
    public boolean full(){
        return ((this.rear+1)%this.maxSize == this.front);
    }
    
    /**
     * memasukkan data pada indeks/posisi terakhir
     * @param info
     */
    public void enq(int info){
        if(!this.full()){
            this.data[++this.rear] = info;
        }
    }
    
    /**
     * mengambil data paling depan
     * @return 
     */
    public int deq(){
        if(!this.empty()){
            this.front = (this.front+1) % this.maxSize;
        }
        return(this.data[this.front]);
    }
    
    public void disp(){
        if(!this.empty()){
            int t;
            t = this.front;
            while(t != this.rear){
                t = (t+1) % maxSize;
                System.out.print(data[t]+" ");
            }
        }
    }
}