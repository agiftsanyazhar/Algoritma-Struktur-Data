package pkg152011513020_stack_and_queue_dynamic;

public class Node {
    private int info;
    private Node next;
    
    /**
     * deklarasi constructor
     * @param info
     */
    Node(int info){
        this.info = info;
        this.next = null;
    }
    
    /**
     * menampilkan isi data di dalam node
     */
    public void disp(){
        System.out.print(this.info+" ");
    }
    
    /**
     * mengganti nilai data di dalam node
     * @param info
     */
    public void setInfo(int info){
        this.info = info;
    }
    
    /**
     * mengambil data dari node
     * @return 
     */
    public int getInfo(){
        return this.info;
    }
    
    /**
     * mengisi / mengarah nilai next ke node baru yang dituju
     * @param t
     */
    public void setNext(Node t){
        this.next = t;
    }
    
    /**
     * mengambil alamat dari next
     * @return 
     */
    public Node getNext(){
        return this.next;
    }
}