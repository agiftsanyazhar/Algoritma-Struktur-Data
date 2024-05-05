package pkg152011513020_tugas5;

public class Circular_Double_Linked_List {
    Double_Node head;
    Double_Node tail;
    int size;
    
    public Circular_Double_Linked_List(){
        this.head   = null;
        this.size   = 0;
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public void addFront(int info){
        if (isEmpty() == true){
            this.head   = new Double_Node(info);
            this.head.setNext(this.head);
            this.head.setPrev(this.head);
            this.size++;
        }
        else{
            Double_Node t      = new Double_Node(info);
            this.head.getPrev().setNext(t);
            t.setNext(this.head);
            t.setPrev(this.head.getPrev());
            this.head.setPrev(t);
            this.size++;
        }
    }
    
    public void delFront(){
        if (isEmpty() == false){
            this.head.getPrev().setNext(this.head.getNext());
            this.head   = this.head.getNext();
            this.head.setPrev(this.head.getPrev().getPrev());
            this.size--;
        }
    }
    
    public void delRear(){
        if (isEmpty() == false){
            for (int i=1; i<this.size; i++){
                this.head.getPrev().getPrev().setNext(this.head);
                this.head.setPrev(this.head.getPrev().getPrev());
                this.size--;
            }
            this.size--;
        }
    }
    
    public void delInfo(int info){
        if (isEmpty() == false){
            Double_Node t       = this.head;
            if(t.getInfo() == info){
                delFront();
            }
            else{
                t.getPrev().setNext(t.getNext());
                t.getNext().setPrev(t.getPrev());
                this.size--;
            }
        }
    }
    
    public void print(){
        Double_Node t = this.head;
        for (int i=1; i<=this.size; i++){
            System.out.print(t.getInfo() + "    ");
            t = t.getNext();
        }
        System.out.print("\n");
    }
}