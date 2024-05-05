package pkg152011513020_stack_and_queue_dynamic;

public class StackDynamic {
    private Node top; // pointer menunjuk Node atas
    private Node bottom;
    private int size; // jumlah data di dalam stack
    
    /**
     * deklarasi constructor
     */
    StackDynamic(){
        this.top    = null;
        this.bottom = null;
        this.size   = 0;
    }
    
    public boolean empty(){
        return this.size == 0;
    }
    
    public void push(int info){
        if (empty() == true){
            this.top    = new Node(info);
            this.bottom = this.top;
            this.size++;
        }
        else {
            Node t      = new Node(info);
            this.top.setNext(t);
            this.top    = t;
            this.size++;
        }
    }
    
    public int pop(){
        if(this.size == 1){
            Node t      = this.top;
            this.top    = null;
            this.size--;
            
            return t.getInfo();
        }
        else(empty() == false){
            Node t      = this.bottom;
            for(int i=1; i<size-1; i++){
                t       = t.getNext();
            }
            this.size--;
            
            return this.top.getNext().getInfo();
        }
    }
    
    public void disp(){
        Node t  = this.bottom;
        for(int i=1; i<=this.size; i++){
            System.out.print(t.getInfo() + " ");
            t   = t.getNext();
        }
        System.out.print("\n");
    }
}