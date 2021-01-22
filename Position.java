public class Position implements Comparable<Position>{
  private int x; 
  private int y;
  private int dist;

  Position (){
    x = 0;
    y = 0;
    dist = 0;
  }

  public int getx(){
    return x;
  }

  
  public int gety(){
    return y;
  }

 
  public void setx(int a){
    x = a;
  }

 
  public void sety(int a){
    y = a;
  }

  public void setDistance(int d){
    dist = d;
  }
  public int compareTo(Position p){
    return this.dist - p.dist;
  }
}
