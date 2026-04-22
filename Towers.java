import java.util.*;

public class Towers{
  public ArrayList<Integer> left=new ArrayList<Integer>();
  public ArrayList<Integer> middle=new ArrayList<Integer>();
  public ArrayList<Integer> right=new ArrayList<Integer>();
  private int numDiscs=5;

  public Towers(){
      for(int x = numDiscs; x > 0; x--){
          left.add(x);
      }
      solve(numDiscs, left, middle, right);
      printTowers(numDiscs);
  }

  //YOU::you write this -- simple ArrayList move the last item of l to r
  private void moveFromOnePoleToAnother(ArrayList<Integer> pole1,  ArrayList<Integer> pole2){
    pole2.add(pole1.remove(pole1.size()-1));
  }

  //YOU:: recursive moment -- base case? recursive case?
  public void solve(int discs, ArrayList<Integer> poleA, ArrayList<Integer> poleB, ArrayList<Integer> poleC){
      if(discs == 1){
        moveFromOnePoleToAnother(poleA, poleC);
      } else{
        //recursive moment -- this three lines! and BIG HINT: two recursive calls to this method solve
        //as well as another call to moveFromLeftToRight
        solve(discs-1, poleA, poleC, poleB);
        moveFromOnePoleToAnother(poleA,poleC);
        solve(discs-1, poleB, poleA, poleC);
      }     
  }


  public void printTowers(int numDiscs){
    String leftT="",rightT="",middleT="";
    for(int x = 0; x < numDiscs; x++){
          if(x < left.size())
            leftT += left.get(x) + ", ";
          if(x < right.size())
            rightT += right.get(x) + ", ";
          if(x < middle.size())
            middleT += middle.get(x) + ", ";
    }
    System.out.println("Left: " + leftT);
    System.out.println("Middle: " + middleT);
    System.out.println("Right: " + rightT);

  }

  public static void main(String[] args){
    new Towers();
  }
}