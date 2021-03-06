/*Algnos metodos son tomados de los archivos de la clase*/
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * List based on simple nodes
 * @param <E> the type of objects that can be stored in the list
 */
class SinglyLinkedList<E> extends AbstractList<E>{

   protected int count; // list size
   protected Node<E> head; // ref. to first element

    /**
     * Constructor for a singly linked list
     */
   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }

    /**
     * Method used to get the amount of objects in the list
     * @return the number of elements in the list
     */
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }

    public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }

  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }

  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }



  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
             finger = finger.next();
         }
         finger.setNext(temp);
      } else head = temp;

	  count++;

   }

    /**
     * Returns the element of a specified position
     * @param i the position of wanted object
     * @return the object in position i
     */
    @Override
    public E get(int i) {
        Node<E> finger = head;
        for (int j=0;j<i-1;j++){
            finger = finger.next();
        }
        return finger.value();
    }

    /**
     * removes the last element of the list
     * @return the removed element
     */
    @Override
    public E removeLast() {
        Node<E> finger = head;
        Node<E> previus= null;
        while (finger.next() != null)
        {
            previus = finger;
            finger = finger.next();
        }
        if(previus==null){
            this.head = null;
        }
        else{
            previus.setNext(null);
        }
        count--;
        return finger.value();
    }

    /*Los siguientes metodos no se utlizan pero forman parte de la interfaz*/
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E set(int i, E e) {
        return null;
    }

    @Override
    public void add(int i, E e) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }
}