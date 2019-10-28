package isosceles;

import java.util.Scanner;

public class Triangulos {
	public static void main(String[] args) {
double area;
Scanner entrada = new Scanner(System.in);
System.out.println("¿Cuantos triangulos desea ingresar?");
float t = entrada.nextInt();
for (int i = 0; i < t; i++) {
	int cont=i+1;
System.out.println("ingrese la base del triangulo " + cont);
float b = entrada.nextInt();
System.out.println("ingrese la altura del triangulo " + cont);
float a = entrada.nextInt();
area= ((b*a)/2);
double l=(a*a)+((b/2)*(b/2));
float lado = (float) Math.sqrt(l);
float perimetro = (lado *2 )+ a ;
System.out.println("Triangulo" + cont);
System.out.println("El lado es " + lado);
System.out.println("El area es " + area);
System.out.println("El perimetro es " + perimetro);

}
	}
}
