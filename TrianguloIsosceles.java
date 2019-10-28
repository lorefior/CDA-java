package isosceles;

import java.util.Scanner;

public class TrianguloIsosceles {
	public static void main(String[] args) {
double area;
int auxl;
Scanner entrada = new Scanner(System.in);
System.out.println("¿Cuantos triangulos desea ingresar?");
float t = entrada.nextInt();
for (int i = 0; i < t; i++) {
System.out.println("ingrese la base del triangulo " + auxl);
auxl++;
float b = entrada.nextInt();
System.out.println("ingrese la altura del triangulo A");
float a = entrada.nextInt();
System.out.println("ingrese la base del triangulo B");
float bb = entrada.nextInt();
System.out.println("ingrese la altura del triangulo B");
float ab = entrada.nextInt();

area= ((b*a)/2);

double l=(a*a)+((b/2)*(b/2));
float lado = (float) Math.sqrt(l);

float perimetro = (lado *2 )+ a ;

double areab= ((bb*ab)/2);
double lb=(ab*ab)+((bb/2)*(bb/2));
float ladob = (float) Math.sqrt(l);
float perimetrob = (lado *2 )+ a ;
if(areab>area) {
	System.out.println("El  Area y/o el perimetro del triangulo  B es mayor al A ");
}else if (area>areab) {
	System.out.println("El  Area y/o el perimetro del triangulo  A es mayor al B ");
}else 
	System.out.println("los triangulos son iguales en area y perimetro");
System.out.println("Triangulo A");
System.out.println("El lado es " + ladob);
System.out.println("El area es " + area);
System.out.println("El perimetro es " + perimetro);
System.out.println("Triangulo A");
System.out.println("El lado es " + lado);
System.out.println("El area es " + areab);


System.out.println("El perimetro es " + perimetrob);

entrada.close();

}
}
