import java.util.LinkedList;
import java.util.Deque;

// public class MyStack<T> implements Frontier<T>{
 // private LinkedList<T> stack;

//  public MyStack(){
  //  stack = new LinkedList<T>();
  //}

  //public void add(T newItem){
    //stack.push(newItem);
  //}

  //public T remove(){
    //return stack.pop();
  //}

  //public int size(){
    //return stack.size();
  //}
 //}

public class MazeSolver{
  private Maze maze;

  public MazeSolver(Maze maze){
    this.maze = maze;
  }

 
  public boolean traverse(){
    boolean done = false;
    int row, column;
    Position pos = new Position();
    //Deque<Position> stack = new LinkedList<Position>();
    Frontier<Position> frontier = new MyTree<Position>();
    //stack.push(pos);
    frontier.add(pos);
    
    while (!(done) && frontier.size() != 0){
      pos = frontier.remove();
      if (pos.getx() == maze.getRows()-1 && pos.gety() == maze.getColumns()-1){
        done = true;  // the maze is solved
      }else{
        push_new_pos(pos.getx() - 1,pos.gety(), frontier); 
        push_new_pos(pos.getx() + 1,pos.gety(), frontier);
        push_new_pos(pos.getx(),pos.gety() - 1, frontier);
        push_new_pos(pos.getx(),pos.gety() + 1, frontier); 
      }
      System.out.print("\033\143"); 
      System.out.println(maze);
      try{
       Thread.sleep(500);
      }catch(InterruptedException e){}
      maze.tryPosition(pos.getx(),pos.gety());  // this cell has been tried
      //System.out.println(maze);
    }

    return done;
  }


   public boolean traverse_rc(int row, int column){
     return false;
   }

  
  private void push_new_pos(int x, int y, Frontier<Position> frontier){
    Position npos = new Position();
    npos.setx(x);
    npos.sety(y);
    int distance = (maze.getRows()-x)+(maze.getColumns() -y);
    npos.setDistance(distance);
    if (maze.validPosition(x,y)){
      frontier.add(npos);
    }
  }
}
