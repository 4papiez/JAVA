import java.lang.*;

/** klasa parametryzowana typem T Stosu */ 

public class Stos<T>{
	/** prywatna głowa typu Node parametryzowanym typem T */
	private Node<T> head;
	/** rozmiar (int) ilosc elementów */
	private int rozm;
	/** konstruktor domyslny */
	public Stos(){rozm=0;head=null;};
	/** metoda push dodaje element t typu T zwraca true jesli sie udało dodac false w przeciwnym wypadku */
	public boolean push(T t){
		try{
			if (head==null){
				head=new Node<T>(t);
				rozm++;
			}
			else{
				Node<T> temp=head;
				head=new Node<T>(t);
				head._next=temp;
				rozm++;
			}		
			return true;
		}catch(Exception e){
			return false;
		}
	}
	/** funkcja pop sciąga element ze Stosu zwracając go */
	public T pop(){
		Node<T> temp=head;
		T wynik=head._t;
		head=head._next;
		rozm--;
		return wynik;
			
	}
	/** przeładowanie funkcji toString() */ 
	public String toString(){
		String wynik="";
		Node<T> temp=head;
		if (head==null)
			return wynik+"{}";
		
		for(int i=0;i<rozm;i++){
			wynik+="{"+temp._t+"} ";
			temp=temp._next;
		}
		return wynik;	
		
	}	

}
