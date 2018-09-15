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
      listQueue.add(element);
      listQueue.add(null);
      for ( int i = listQueue.size(); i >1; i--){
        elementPrecedent = listQueue.get(i - 2);
        listQueue.set(i-1, elementPrecedent ) ;
      }
      listQueue.set(0, element);
    }
    return listQueue;
  }

  public List<Integer> pop()
  {
    if(listQueue.size() == 0)
    {
      emptyQueue = true;
    } else if (listQueue.size() == 1)
    {
      listQueue.remove(0);
      emptyQueue = true;
    } else {
      listQueue.remove(0);
    }
    return listQueue;
  }
}
