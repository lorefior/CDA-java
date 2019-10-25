package Stack.proyec;

import java.util.*;

public class StackApp {
	public static void main(String args[]) {
		Stack<String> STACK = new Stack<String>();

		STACK.push("San Lorenzo");
		STACK.push("Estudiantes");
		STACK.push("Independiente");
		STACK.push("Boca");
		STACK.push("River");
		STACK.push("Belgrano");

		System.out.println("Primera Nacional: " + STACK);

		System.out.println("En peligro de descenso : " + STACK.peek());

		System.out.println("En que posicion se encuenta Boca? " + STACK.search("Boca"));

		System.out.println("Descendio: " + STACK.pop());

		System.out.println("Primera Nacional: " + STACK);

	}
}
