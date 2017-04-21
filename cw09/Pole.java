import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Random;
import java.lang.Math;

/** Klasa przechowująca kolejne przybliżenia pola koła o promieniu range,
* obliczająca to pole za pomocą metody monte carlo
*/
public class Pole implements Serializable{
	/** Konstruktor domyślny przyjmujący promień koła - range */
	Pole(double range){_r=range;_pole=1;_ile=1;_traf=1;}
	private double _r;
	private double _pole;
	private int _ile;
	private int _traf;
	/** Metoda ustawiająca wartość Pola */ 
	public void setPole(double r){_pole=r;}
	/** Metoda zwaracająca wartość Pola */ 
	public double getPole(){return _pole;}
	/** Metoda ustawiająca wartość promienia */ 
	public void setR(double r){_r=r;}
	/** Metoda zwracająca wartość Pola */ 
	public double getR(){return _r;}
	/** Metoda aktualizująca wartość Pola o 100 rzutów */ 
	public void rzuc(){
		Random r= new Random();
		double a=1;
		double b=1;
		for(int i=0;i<100;i++){
			r= new Random();
			a = (r.nextDouble()*(2.0*_r))-_r;
			b= (r.nextDouble()*(2.0*_r))-_r;
			if(Math.sqrt(Math.abs(a*a+b*b))<=_r)
				_traf+=1;
		}
		_ile+=100;
		_pole=(2.0*_r)*(2.0*_r)*((double)_traf/(double)_ile);
	}
		

}
