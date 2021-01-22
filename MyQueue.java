import java.util.LinkedList;

public class MyQueue<T> implements Frontier<T>{
  private LinkedList<T> queue;

  public MyQueue(){
    queue = new LinkedList<T>();
  }

  public void add(T newItem){
    queue.add(newItem);
  }

  public T remove(){
    return queue.remove();
  }

  public int size(){
    return queue.size();
  }
}
