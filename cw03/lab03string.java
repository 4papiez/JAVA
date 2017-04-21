import java.util.Scanner;


/**Klasa zawierajaca metody statyczne: dlugosc(String s),ile_razy_literka_wystepuje(String s,char a),
boolean czy_takie_same(String s1,String s2),String wspak(String s),boolean czy_plaindrom(String s),
boolean czy_abecadlowe(String s),String rot13(String s).
 */
public class lab03string{
/** funkcja zwraca dlugosc stringa*/
	static int dlugosc(String s){return s.length();};
/**funkcja zwraca krotnosc pojawienie sie znaku char a s stringu s*/
	static int ile_razy_literka_wystepuje(String s,char a){
		int wynik=0;
		for (int i=0; i<s.length();i++){
			if (s.charAt(i)==a)
				wynik++;
		}
		return wynik;
	}
/**funkcaja porownujaca dwa stringi*/
	static boolean czy_takie_same(String s1,String s2){
		if (s1.compareTo(s2)==0)
			return true;
		else
			return false;
	}
/**funkcja zwracajaca string odwrotny do stringa s*/
	static String wspak(String s){
		String wynik="";
		for (int i=s.length()-1;i>=0;i--)
			wynik+=s.charAt(i);
		return wynik;
	}
/**funkcja sprawdzajaca czy string s jest palindromowy*/
	static boolean czy_plaindrom(String s){
		int dlugosc=s.length();
		for(int i=0;i<s.length()/2;i++){
			if (s.charAt(i)!= s.charAt(dlugosc -i -1))
				return false;
		}
		return true;
	}
/**funkcja sprawdzajaca czy string s jest "abecadlowy"*/
	static boolean czy_abecadlowe(String s){
		for(int i=0;i<s.length()-2;i++){
			if(s.charAt(i)+1!=s.charAt(i+1))
				return false;
		}
		return true;
	}
/**funkcja szyfrujaca i odszyfrujaca*/
	static String rot13(String s){
		String wynik="";
		char znak=0;
		for(int i=0;i<s.length();i++){
			znak=s.charAt(i);
				if(znak+13>'Z'&& znak+13<'Z'+12)
					wynik+='a'+znak+(13-('Z'-znak));
				else if (znak+13>='a'&&znak+13<='Z')
					wynik+=znak+13;
				else
					wynik+=znak;
			

				
		}
		return wynik;
	}
}

