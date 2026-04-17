public class Paths{
    private int startY, startX;

    public Paths(){
        this.startY=1;
        this.startX=1;
        int p = pathCount(startX, startY);
        System.out.println(p);
    }
  
    //this returns the number of path between 0,0 and
    //n,k restricted by moving north and west only
    public int pathCount(int n, int k){
        return 0;
    }

    public static void main(String[] args) {
        new Paths();
    }
}
