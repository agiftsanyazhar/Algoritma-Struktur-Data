package pkg152011513020_node;

public class List {
    Node head; // pointer menunjuk node terdepan
    Node tail; // pointer menunjuk node terakhir
    int size; // jumlah node yang terdapat dalam list
    
    /**
    * constructor create list kosong
    */
    public List(){
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
            this.head   = new Node(info);
            this.tail   = this.head;
            this.size++;
        }
        else{
            Node t      = new Node(info);
//            t.setNext(t);
            t.setNext(this.head);
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
            this.tail   = new Node(info);
            this.head   = this.tail;
            this.size++;
        }
        else{
            Node t      = new Node(info);
            this.tail.setNext(t);
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
            this.size--;
        }
    }
    
    /**
    * menghapus satu node dari list pada posisi terakhir
    * bila list dalam keadaan kosong, maka tidak dilakukan aksi apapun
    */
    public void delRear(){
        Node t = this.head;
        
        if (isEmpty() == false){
            for (int i=1; i<this.size; i++){
                t   = t.getNext();
//                this.size--;
            }
            this.size--;
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
        Node t = this.head;
        
        if(isEmpty() == false){
            for (int i=1; i<this.size; i++){
                if (t.getInfo() == info){
                    return true;
                }
            }
            t = t.getNext();
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
    public Node getPosition(int info){
        Node t = this.head;
        
        if(isEmpty() == false){
            for (int i=1; i<this.size; i++){
                if (t.getInfo() == info){
                    return t;
                }
            }
            t = t.getNext();
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
        Node t = this.head;
        int pos = 0;
        boolean parm=false;
        
        do{
            if (t.getInfo()==info){
                t = t.getNext();
                
                Node a = this.head;
                for(int i=1; i<(pos-1); i++){
                    a = a.getNext();
                }
                a.setNext(t);
                parm = true;
                this.size--;
            }
            pos++;
            t = t.getNext();
        }
        while (parm==false || pos==size);
    }
    
    public void print(){
        Node t = this.head;
        
        for (int i=1; i<=this.size; i++){
            System.out.print(t.getInfo() + "    ");
            t = t.getNext();
        }
        System.out.print("\n");
    }
}