import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class lab12{
	/** Funkcja przyjmuje jako pierwszy parametr szukane słowo lub opcje -add (dodaje do słownika) lub opcje -rm (usuwa) */
	public static void main(String[] args){
		Dict dic=new Dict();
		String k;
		String w;
		Scanner cin = new Scanner(System.in);
   		try{
			ObjectInputStream i=new ObjectInputStream(new FileInputStream("dict.ser"));
			dic= (Dict) i.readObject();
			i.close();
		}
		catch(Exception e){
			
		}finally{
			if(args[0].equals("-add")){
				if(args.length==1){
					System.out.println("Podaj klucz:");
					k=cin.nextLine();
					System.out.println("Podaj tłumaczenie:");
					w=cin.nextLine();
					dic.dane.put(k,w);
					dic.dane.put(w,k);
				}
				else if(args.length==2){
					k=args[1];
					System.out.println("Podaj tłumaczenie:");
					w=cin.nextLine();
					dic.dane.put(k,w);
					dic.dane.put(w,k);
				}
				else if (args.length==3){
					k=args[1];
					w=args[2];
					dic.dane.put(k,w);
					dic.dane.put(w,k);
				}
			}
			if(args[0].equals("-rm")){
				if(args.length==1){
					System.out.println("Podaj klucz:");
					k=cin.nextLine();
					dic.dane.remove(k);
						
				}
				if(args.length==2){
					k=args[1];
					dic.dane.remove(k);
				}
				else{
					System.out.println("Złe wywwołanie!!!");
				}	
	
			}
			if (!args[0].equals("-add")&&!args[0].equals("-rm")){
				if(args.length==1){
					if(dic.dane.get(args[0])!=null){
						System.out.println(dic.dane.get(args[0]));
					}else{
						System.out.println("Brak słowa we słowniku!!!");
					}
				}else{
					System.out.println("Źle korzystasz z tego programu!!!");
				}
			}

					
			try{
				ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream("dict.ser"));
				o.writeObject(dic);
				o.close();
			}catch(Exception e){
				System.out.println("Zapis nie powiódł się z powodu: "+e);
		}		
		}
		
	}	
}


