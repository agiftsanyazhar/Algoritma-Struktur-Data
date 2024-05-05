package pkg152011513020_staticbtree;

public class StaticBTree {
    private int [] data;
    private int maxSize;
    private int size;
    
    StaticBTree(int maxSize){
        this.maxSize    = maxSize;
        data            = new int[maxSize];
    }
    
    public void disp(){
        for(int i=0; i<this.maxSize; i++){
            System.out.print(data[i]+" ");
        }
    }
    
    public void insert(int info){
        data    = new int [info];
        
        if(data[0] == 0){
            data[0] = info;
        }
        
        int curIdx  = 0;
        
        while(data[curIdx] != info){
            if(info<data[curIdx]){
                //Kiri
                if(data[curIdx*2+1] < 0){
                    data[curIdx*2+1] = info;
                } else{
                    curIdx  = curIdx*2+1;
                }
            } else{
                //Kanan
                if(data[curIdx*2+2] > 0){
                    data[curIdx*2+2] = info;
                } else{
                    curIdx  = curIdx*2+2;
                }
            }
        }
    }
    
    public void inOrder(int index){
        if (index<maxSize){
            inOrder(index*2+1);
            System.out.print(data[index] + " ");
            inOrder((index+1)*2);
        }
    }
    
    public void inOrder(){
        System.out.println("===================");
        System.out.println("     InOrder       ");
        System.out.println("===================");
        if(this.size>0){
            inOrder(0);
            System.out.print("\n\n");
        }
    }
    
    public void preOrder(int index){
        if (index<maxSize){
            System.out.print(data[index]+" ");
            preOrder(index*2+1);
            preOrder((index+1)*2);
        }
    }
    
    public void preOrder(){
        System.out.println("===================");
        System.out.println("      preOrder     ");
        System.out.println("===================");
        if(this.size>0){
            preOrder(0);
            System.out.print("\n\n");
        }
    }
    
    public void postOrder(int index){
        if (index<maxSize){
            postOrder(index*2+1);
            postOrder((index+1)*2);
            System.out.print(data[index]+" ");
        }
    }
    
    public void postOrder(){
        System.out.println("===================");
        System.out.println("     postOrder     ");
        System.out.println("===================");
        if(this.size>0){
            postOrder(0);
            System.out.print("\n\n");
        }
    }
}