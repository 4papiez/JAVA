/** Klasa Point przechowująca współrzędne */
public class Point extends Shape{
	/** Konstruktor przyjmujący współrzedne x i y */
	Point(double x, double y){_x=x; _y=y;}
	/** Metoda zwracająca nazwe typu obiektu */
	public String getName(){return "Point";}
	/** Metoda zwracająca zawartość obiektu w formie Stringa */
	public String toString(){return "["+_x+", "+_y+"]";}
	/** Metoda zwracająca pole */
	public double area(){return 0;}
	/** Metoda zwracająca objętość */
	public double volume(){return 0;}

	
	double _x;
	double _y;
	
	
}
