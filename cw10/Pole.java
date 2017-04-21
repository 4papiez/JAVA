import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Random;
import java.lang.Math;

/** klasa Pole reprezentująca plansze */
public class Pole implements Serializable{
/** konstruktor domyślny inicjalizujacy odpowiednie zmienne */
	Pole(){
		_d=15; _h=10; _koniec=false; _jest= false;
		_tab=new char[_h][];
		for (int i=0;i<_h;i++){
			_tab[i]=new char[15];
		}
		for (int i=0;i<_h;i++){
			if(i==0||i==_h-1){
				for(int j=0;j<_d;j++)
					_tab[i][j]='X';
			}
			else{
				_tab[i][0]='X';
				_tab[i][_d-1]='X';
			}
		}
		for(int i=1;i<_h-1;i++){
			for(int j=1;j<_d-1;j++)
				_tab[i][j]=' ';
		}
	}
	/** zmienna prywatna reprezentujaca szerokość */
	private int _d;
	/** zmienna prywatna wysokość */
	private int _h;
	/** plansza */
	private char _tab[][];
	/** zmenna okreslająca czy koniec gry */
	private boolean _koniec;
	/** zmienna okreslajaca czy aktualnie spada jakas kulka */
	private boolean _jest;
	/** zmienna okteslajaca polozenie kulki na osi x */
	private int _a;
	/** zmianna okreslajaca polozenie kulki na osi y */
	private int _i;
	/** metoda zwracajaca zmienna koniec */
	public boolean koniec(){return _koniec;}
	/** metoda kolejnego kroku */ 
	public void rzuc(){
		Random r= new Random();
		if (!_jest){//sprawdzenie czy spada kulka
			int a = r.nextInt(3)+6;//losowanie
			if(_tab[1][a]=='o'){//warunek zakonczenia gry
				_koniec=true;
				return;
			}
			_tab[1][a]='o';
			_a=a;
			_i=1;
			_jest=true;
		}
		else{
			int los=2;
			if( (_tab[_i+1][_a+1]!='X' && _tab[_i+1][_a+1]!='o') && (_tab[_i+1][_a-1]!='X' && _tab[_i+1][_a-1]!='o') ){//sprawdzenie czy mamy wybor
				los = r.nextInt(2);
			}
			
			if(_tab[_i+1][_a]!='X' && _tab[_i+1][_a]!='o'){
				_tab[_i+1][_a]='o';
				_tab[_i][_a]=' ';
				_i++;		
			}
			else{
				
				if(_tab[_i+1][_a+1]!='X' && _tab[_i+1][_a+1]!='o' && (los==2 || los==0) ){
					_tab[_i+1][_a+1]='o';
					_tab[_i][_a]=' ';
					_i++;
					_a++;
				}
				else{
					if(_tab[_i+1][_a-1]!='X' && _tab[_i+1][_a-1]!='o' && (los==2 || los==1) ){
					_tab[_i+1][_a-1]='o';
					_tab[_i][_a]=' ';
					_i++;
					_a--;
					}
					else{
						_jest=false;
					}
				}		
					 
			}
		}
	}
	/** metoda zwracajaca plansze w formie tekstowej */
	public String toString(){
		String result="";
		for (int i=0;i<_h;i++){
			for(int j=0;j<_d;j++)
				result+=_tab[i][j];
			result+='\n';
		}
		return result;
	}
		

}
