package pkg152011513020;

public class StaticBTree {
    private int [] data;
    private int maxSize;
    
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
    
    public void inOrder(){
        
    }
    
    public void preOrder(){
        
    }
    
    public void postOrder(){
        
    }
}