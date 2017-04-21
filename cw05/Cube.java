/** Klasa Cube przechowująca współrzędne rogu i długość boku */
public class Cube extends Square{
	/** Konstruktor przyjmujący długość boku, współrzędną x i y */
	Cube(double side, double x, double y){super(side,x,y);}
	/** Metoda zwracająca nazwe typu obiektu */
	public String getName(){return "Cube";}
	/** Metoda zwracająca obiętość bryły */
	public double volume(){return _side*_side*_side;}
	/** Metoda zwracająca pole powierzchni całkowitej */
	public double area(){return 6*super.area();}
	/** Metoda zwracająca zawartość obiektu w formie Stringa */
	public String toString(){return super.toString()+"; depth = "+_side;}
}
