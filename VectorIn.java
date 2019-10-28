package impresionintercalada;

import java.util.ArrayList;

public class VectorIn {
	public static void main(String[] args) {
		int i, j;
		ArrayList<String> nombres = new ArrayList<String>(); 
		ArrayList<String> apellidos = new ArrayList<String>();
		nombres.add("Lautaro");
		nombres.add("Lautaro");
		nombres.add("Lautaro");
		nombres.add("Lautaro");
		nombres.add("Lautaro");
		apellidos.add("Diaz");
		apellidos.add("Diaz");
		apellidos.add("Diaz");
		apellidos.add("Diaz");
		apellidos.add("Diaz");
		ArrayList<String> fullList = new ArrayList<>();
		fullList.addAll(nombres);
		fullList.addAll(apellidos);
		System.out.println(fullList);
		}

}
