package pkg152011513020_stack_and_queue_dynamic;

public class StackStatic {
    private int[] data; // menyimpan data
    private int maxSize;// kapasitas maksimum stack
    private int top; // menunjuk / index posisi data paling atas
    
    StackStatic(int maxSize){
        this.maxSize = maxSize;
        this.data = new int[maxSize];
        this.top = -1;
    }
    
    public boolean full(){
        return (this.top == (this.maxSize-1));
    }
    
    public boolean empty(){
        return this.top == -1;
    }
    
    /**
     * memasukkan data pada posisi paling atas
     * @param info
     */
    public void push(int info){
        if(!this.full())
            this.data[++top] = info;
    }
    
    /**
     * mengambil data pada posisi paling atas
     * @return 
     */
    public int pop(){
        if(!this.empty())
            return(this.data[this.top--]);
        else return -1000;
    }
}