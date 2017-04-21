import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;



/** Pseudo tetris */

public class lab10{
	public static void main(String[] args){
		Pole k=new Pole();
		Scanner cin = new Scanner(System.in);
		String co;
		System.out.println("Co zrobić (n/e)");		
		co=cin.nextLine();
		while(!co.equals("e") && !k.koniec() ){
			if(co.equals("n")){
				k.rzuc();
				System.out.println(k.toString());
				System.out.println("Co zrobić (n/e)");
				
			}
			co=cin.nextLine();
		
		}
		if(k.koniec())
			System.out.println("GAME OVER");
	}

						
}
