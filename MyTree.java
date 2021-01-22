import tree.LinkedBinarySearchTree;

public class MyTree<T> implements Frontier<T>{
  private LinkedBinarySearchTree<T> tree;

  public MyTree(){
    tree = new LinkedBinarySearchTree<T>();
  }

  public void add(T newItem){
    tree.addElement(newItem);
  }

  public T remove(){
    return tree.removeMin();
  }
  
  public int size(){
    return tree.size();
  }
}
