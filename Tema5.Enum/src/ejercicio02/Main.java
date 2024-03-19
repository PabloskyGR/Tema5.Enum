package ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String departamento = sc.next();
		sc.nextLine();

		Articulo art = new Articulo("Fanta", 1.5, 10, departamento);

		System.out.println(art.imprime());

		System.out.println("Precio con IVA: " + art.getPVP());
		System.out.println();

		System.out.println("Precio con descuento: " + art.getPVPDescuento(50));
		System.out.println();

		System.out.println("Se han vendido 3 fantas");
		art.vender(3);
		System.out.println();

		System.out.println(art.imprime());
		System.out.println();

		System.out.println("Se ha rellenado con 6 fantas");
		art.almacenar(6);
		System.out.println();

		System.out.println(art.imprime());

		sc.close();
	}

}
