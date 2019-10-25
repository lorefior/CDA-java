package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Array {
	public static void main(String[] args) {
		ArrayList<String> datos = new ArrayList<String>();
		datos.add("Brasil");
		String s = datos.get(0);
		datos.add("Argentina");
		datos.add("Paraguay");
		datos.add("Uruguay");
		ArrayList<String> datos3 = new ArrayList<String>();
		datos3.add("Brasil");
		datos3.add("Peru");
		datos3.add("Paraguay");
		datos3.add("Uruguay");
		ArrayList<String> datos2 = new ArrayList<String>();
		datos2.add("Alemania");
		datos2.add("Francia");
		datos2.add("Italia");
		datos2.add("Belgica");
		datos2.add("Luxemburgo");

		HashMap<String, ArrayList> formulario = new HashMap<String, ArrayList>();
		formulario.put("Mercosur", datos);

		formulario.put("U.E", datos2);

		formulario.forEach((String, ArrayList) -> System.out
				.println("Union: " + String + "  Paises que lo integran: " + ArrayList));
		formulario.replace("Mercosur", datos3);
		formulario.forEach((String, ArrayList) -> System.out
				.println("Union: " + String + "  Paises que lo integran: " + ArrayList));

	}
}
