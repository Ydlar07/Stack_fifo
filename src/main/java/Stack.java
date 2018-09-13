import java.util.ArrayList;
import java.util.List;

public class Stack
{
  private boolean emptyQueue = true;
  public List<Integer> listQueue = new ArrayList<Integer>();
  public boolean isEmpty(){
    return emptyQueue;
  }

  public List<Integer> queue(int element)
  {
    int elementPrecedent;
    emptyQueue = false;
    if(listQueue.isEmpty()){
      listQueue.add(element);
    } else {
      listQueue.add(0, element);
    }
    return listQueue;
  }

  public void pop()
  {
    if(listQueue.size() == 0){
      emptyQueue = true;
    } else if (listQueue.size() == 1) {
      listQueue.remove(0);
      emptyQueue = true;
    } else {
      listQueue.remove(0);
    }
  }
}
