package pkg152011513020_tugas5;

public class Circular_Linked_List {
    private Node front;
    private int size;
    
    Circular_Linked_List(){
        this.size   = 0;
        this.front  = null;
    }
    
    public boolean isEmpty(){
        return this.size==0;
    }
    
    public void add(int info){
        if(isEmpty() == true){
            this.front  = new Node(info);
            this.front.setNext(this.front);
            this.size++;
        }
        else{
            Node a  = new Node(info);
            Node b  = this.front;
            for (int i=1; i<this.size; i++){
                b   = b.getNext();
            }
            b.setNext(a);
            a.setNext(this.front);
            this.size++;
        }
    }
    
    public void delFront(){
        if(isEmpty() == false){
            this.front  = this.front.getNext();
            Node b      = this.front;
            for (int i=1; i<this.size-1; i++){
                b       = b.getNext();
            }
            b.setNext(this.front);
            this.size--;
        }
    }
    
    public void delRear(){
        if(isEmpty() == false){
            Node b  = this.front;
            for (int i=1; i<this.size-1; i++){
                b   = b.getNext();
            }
            b.setNext(this.front);
            this.size--;
        }
    }
    
    public void delInfo(int info){
        if (isEmpty() == false){
            Node t          = this.front;
            int pos         = 1;
            while (t.info!=info && pos<this.size){
                t           = t.getNext();
                pos++;
            }
            if (t.getInfo() == info){
                if(t == this.front){
                    delFront();
                }
                else{
                    t       = t.getNext();
                    Node a  = this.front;
                    for(int i=1; i<(pos-1); i++){
                        a   = a.getNext();
                    }
                    a.setNext(t);
                    this.size--;
                }
            }
        }
    }
    
    public void print(){
        Node t  = this.front;
        for(int i=1; i<=this.size+1; i++){
            System.out.print(t.getInfo()+" ");
            t   = t.getNext();
        }
        System.out.println("");
    }
}