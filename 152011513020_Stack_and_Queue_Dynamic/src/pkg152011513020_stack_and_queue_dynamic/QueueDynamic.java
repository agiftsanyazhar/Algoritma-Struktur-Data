package pkg152011513020_stack_and_queue_dynamic;

public class QueueDynamic {
    private Node front;
    private Node rear;
    private int size;
    
    public QueueDynamic(){
        this.front  = null;
        this.rear   = null;
        this.size   = 0;
    }
    
    public boolean empty(){
        return this.size == 0;
    }
    
    public void enq(int info){
        if (empty() == true){
            this.front  = new Node(info);
            this.rear   = this.front;
            this.size++;
        }
        
        else{
            Node t=new Node(info);
            this.rear.setNext(t);
            this.rear   = t;
            this.size++;
        }
    }
    
    public int  deq(){
        Node t      = this.front;
        this.front  = t.getNext();
        size--;
        return t.getInfo();
    }
    
    public void disp(){
        Node t      = this.front;
        for(int i=1;i<=this.size;i++){
            System.out.print(t.getInfo()+" ");
            t       = t.getNext();
        }
        System.out.println("");
    }
}