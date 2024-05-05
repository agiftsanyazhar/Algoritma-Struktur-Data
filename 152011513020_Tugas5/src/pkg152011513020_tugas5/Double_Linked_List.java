package pkg152011513020_tugas5;

public class Double_Linked_List {
    Double_Node head; // pointer menunjuk node terdepan
    Double_Node tail; // pointer menunjuk node terakhir
    int size; // jumlah node yang terdapat dalam list
    
    /**
    * constructor create list kosong
    */
    public Double_Linked_List(){
        this.head   = null;
        this.tail   = null;
        this.size   = 0;
    }
    
    /**
    * check apakah list dalam keadaan kosong atau tidak
    * mengembalikan nilai TRUE atau FALSE
    * @return
    */
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    /**
    * menambahkan satu node dengan nilai info ke dalam list pada posisi terdepan
    * nilai info didapat melalui passing parameter
    * tidak diperlukan check Full karena list bersifat dynamic
    * dianggap tidak pernah Full
    * @param info
    */
    public void addFront(int info){
        if (isEmpty() == true){
            this.head   = new Double_Node(info);
            this.tail   = this.head;
            this.size++;
        }
        else{
            Double_Node t      = new Double_Node(info);
            t.setNext(this.head);
            this.head.setPrev(t);
            this.head   = t;
            this.size++;
        }
    }
    
    /**
    * menambahkan satu node dengan nilai info ke dalam list pada posisi terakhir
    * nilai info didapat melalui passing parameter/**
    * tidak diperlukan check Full karena list bersifat dynamic
    * dianggap tidak pernah Full
    * @param info
    */
    public void addRear(int info){
        if (isEmpty() == true){
            this.tail   = new Double_Node(info);
            this.head   = this.tail;
            this.size++;
        }
        else{
            Double_Node t      = new Double_Node(info);
            this.tail.setNext(t);
            t.setPrev(this.tail);
            this.tail   = t;
            this.size++;
        }
    }
    
    /**
    * menghapus satu node dari list pada posisi terdepan
    * bila list dalam keadaan kosong, maka tidak dilakukan aksi apapun
    * */
    public void delFront(){
        if (isEmpty() == false){
            this.head   = this.head.getNext();
            this.head.setPrev(null);
            this.size--;
        }
    }
    
    /**
    * menghapus satu node dari list pada posisi terakhir
    * bila list dalam keadaan kosong, maka tidak dilakukan aksi apapun
    */
    public void delRear(){
        Double_Node t = this.head;
        
        if (isEmpty() == false){
            for (int i=1; i<this.size; i++){
                t   = t.getNext();
//                this.size--;
            }
            this.size--;
        }
    }
    
    public void delInfo(int info){
        if (found(info) == true){
            Double_Node t       = getPosition(info);
            if(t == this.head){
                delFront();
            }
                else if (t == this.tail){
                    delRear();
                }
                    else{
                        t.getPrev().setNext(t.getNext());
                        t.getNext().setPrev(t.getPrev());
                        this.size--;
                    }
        }
    }
    
    /**
    * melakukan check apakah terdapat node dengan nilai info tertentu di dalam list
    * mengembalikan nilai TRUE bila info ditemukan dan
    * mengembalikan nilai FALSE bila info tidak ditemukan
    * @param info
    * @return
    */
    public boolean found(int info){
        Double_Node t = this.head;
        if(isEmpty() == false){
            for (int i=1; i<this.size; i++){
                if (t.getInfo() == info){
                    return true;
                }
                else {
                    t = t.getNext();
                }
            }
        }
        return false;
    }
    
    /**
    * mencari node dengan nilai info yang ditentukan dan
    * selanjutnya mengembalikan alamat node yang memuat info tersebut
    * /**
    * function akan mengembalikan nilai null bila data tidak ditemukan
    *
    * @param info
    * @return
    **/
    public Double_Node getPosition(int info){
        Double_Node t = this.head;
        if(isEmpty() == false){
            for (int i=1; i<this.size; i++){
                if (t.getInfo() == info){
                    return t;
                }
                t = t.getNext();
            }
        }
        return null;
    }
    
    /**
    * menghapus satu node yang memiliki nilai info tertentu
    * yang dihapus adalah node yang ditemukan pertama dan hanya satu node saja
    * function tidak melakukan tindakan apapun bila node yang dimaksud
    * tidak ditemukan
    *
    * @param info
    */
    public void delete(int info){
        if (found(info) == true){
            Double_Node t  = getPosition(info);
            if(t == this.head){
                delFront();
            }
            else if (t == this.tail){
                delRear();
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
    
    public void printMaju(){
        Double_Node t   = this.head;
        for (int i=1; i<=this.size; i++){
            System.out.print(t.getInfo() + " ");
            t           = t.getNext();
        }
        System.out.print("\n\n");
    }
    
    public void printMundur(){
        Double_Node t   = this.tail;
        for (int i=1; i<=this.size; i++){
            System.out.print(t.getInfo() + " ");
            t           = t.getPrev();
        }
        System.out.print("\n\n");
    }
}