import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.Element;
import java.util.List;

import static org.junit.Assert.*;

public class StackTest
{
  Stack file;
  int ELEMENT_1 = 5;
  int ELEMENT_2 = 8;

  @Before
  public void initializationQueue(){
    file = new Stack();
  }

  @Test
  public void givenNoQueue_whenCreateQueue_thenQueueEmpty() {
    boolean exist = file.isEmpty();
    assertEquals(true, exist);
  }

  @Test
  public void givenEmptyQueue_whenAddElement_thenQueueNotEmpty(){
    file.queue(ELEMENT_1);
    boolean queueEmpty = file.isEmpty();
    assertFalse(queueEmpty);
  }

  @Test
  public void givenEmptyQueue_whenAddElement1AndElement2_thenPrintElement2AndElement1(){
    file.queue(ELEMENT_1);
    List<Integer> result = file.queue(ELEMENT_2);
    int teteListe = result.get(0);
    assertEquals(ELEMENT_2, teteListe);
  }

  @Test
  public void givenQueueofElements_whenPop_thenReturnlastElementInQueue(){
    file.queue(ELEMENT_1);
    file.queue(ELEMENT_2);
    file.queue(ELEMENT_1);
    file.pop();
    int lastElementInQueue = file.listQueue.get(file.listQueue.size());
    assertEquals(ELEMENT_2, lastElementInQueue);
  }

//  @Test
//  public void givenOneElementInQueue_whenPop_thenQueEmpty(){
//    file.queue(ELEMENT_1);
//    file.pop();
//    assertTrue(file.isEmpty());
//  }

}
