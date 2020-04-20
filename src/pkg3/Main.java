package pkg3;

import pkg1.Stampa1;
import pkg2.Stampa2;


public class Main {

	public static void main(String[] args) {
		String stringa="STRINGA DI INPUT";
		
		Stampa1 s1 = new Stampa1(stringa);
		Stampa2 s2 = new Stampa2(stringa);
		
		System.out.println(s1);
		System.out.println(s2);

		

	}

}
