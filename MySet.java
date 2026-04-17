public class MySet{
    private int[] myElements;
    private int myElementCount;

    public MySet(int count){
        myElements = new int[count];
        myElementCount = count;
        for(int x = 0; x < count; x++){
            myElements[x] = x * 10;
        }
        System.out.println(this);
        boolean isIn = contains(10);
        System.out.println(isIn);
        isIn = contains(132);
        System.out.println(isIn);
    }

    public boolean contains(int x){
        if(x == 0){
            return false;
        }
        if()
    }

    public boolean containsHelper(int value, int index){
       
    }
    
    public String toString(){
        return myElements.toString();
    }

    public static void main(String[] args) {
        new MySet(10);
    }
}