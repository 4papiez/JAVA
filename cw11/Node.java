/** klasa parametryzowana typem T reprezentyjąca element Listy */
public class Node<T>{
	/** przechowywany obiekt typu T */
	public T _t;
	/** nastepny element Listy */
	public Node<T> _next;
	/** konstruktor przyjmujący to co element Listy ma przechowywać */
	public Node(T t){_t=t;_next=null;}

}

