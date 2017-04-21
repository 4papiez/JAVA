import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;




public class lab09{
	public static void main(String[] args){
		double range=1;
		Pole k=new Pole(range);
		try{
			ObjectInputStream i=new ObjectInputStream(new FileInputStream("obj.tmp"));
			k= (Pole) i.readObject();
			i.close();
		}catch(Exception e){
			System.out.println("Pierwsze wywołanie!");		
		}finally{
			Scanner cin = new Scanner(System.in);
			String co;
			System.out.println("Co zrobić (n/e)");//n - nastepny rzut, e - wyjscie z programu		
			co=cin.nextLine();
			while(!co.equals("e")){
				if(co.equals("n")){
					k.rzuc();
					System.out.println("Pole wynosi: "+k.getPole());
					System.out.println("Co zrobić (n/e)");
				
				}
				co=cin.nextLine();
			}
			try{
				ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream("obj.tmp"));
				o.writeObject(k);
				o.close();
			}catch(Exception e){
				System.out.println("Zapis stanu gry nie powiódł się z powodu: "+e);
			}
		}
	}

						
}
