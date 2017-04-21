import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.io.*;


/** klasa obiektu będącego słownikiem */
public class Dict implements Serializable{
	/** najlepszy sposób poniewaz przechowywuje dane przez klucz i wartosc czyli tak jak normalny słownik, 
	  * bezposrednio mozemy sie do tych danych odwołać,
	  * TreeMap (ta wersja) poniewarz szukanie po drzewie jest szybsze.	
	  */
	public TreeMap<String,String> dane;
	/** Konstruktor domyślny */
	public Dict(){dane=new TreeMap<String,String>();}
}


