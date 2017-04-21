/** Klasa Square przechowująca współrzędne rogu i długość boku */
public class Square extends Point{
	/** Konstruktor przyjmujący długość boku, współrzędną x i y */
	Square(double side, double x, double y){super(x,y); _side=side;}
	/** Metoda zwracająca nazwe typu obiektu */
	public String getName(){return "Square";}
	/** Metoda zwracająca pole */
	public double area(){return _side*_side;}
	/** Metoda zwracająca zawartość obiektu w formie Stringa */
	public String toString(){return "Corner = "+super.toString()+"; side = "+_side;}

	double _side;

}
