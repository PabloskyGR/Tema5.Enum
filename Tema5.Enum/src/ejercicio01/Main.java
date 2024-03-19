package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean salir = false;

		int opc;

		String genero1, genero2, genero3;

		System.out.println("Dime el género de El señor de los anillos");
		genero1 = sc.next();
		sc.nextLine();

		System.out.println("Dime el género de El Quijote");
		genero2 = sc.next();
		sc.nextLine();

		System.out.println("Dime el género de harry Potter");
		genero3 = sc.next();
		sc.nextLine();

		Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 5, 0, genero1);
		Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 7, 2, genero2);
		Libro libro3 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 10, 5, genero3);

		do {

			menu();
			System.out.println("Dime que acción quieres realizar (1 - 4)");
			opc = sc.nextInt();

			switch (opc) {
			case 1: {
				System.out.println("Elige el libro para realizar el préstamo:");
				System.out.println("1. " + libro1.getTitulo());
				System.out.println("2. " + libro2.getTitulo());
				System.out.println("3. " + libro3.getTitulo());
				int libroSeleccionado = sc.nextInt();

				switch (libroSeleccionado) {
				case 1:
					libro1.prestamo();
					break;
				case 2:
					libro2.prestamo();
					break;
				case 3:
					libro3.prestamo();
					break;
				default:
					System.out.println("Opción inválida");
				}
				break;

			}
			case 2: {
				System.out.println("Elige el libro para realizar la devolución:");
				System.out.println("1. " + libro1.getTitulo());
				System.out.println("2. " + libro2.getTitulo());
				System.out.println("3. " + libro3.getTitulo());
				int libroSeleccionado = sc.nextInt();

				switch (libroSeleccionado) {
				case 1:
					libro1.devolucion();
					break;
				case 2:
					libro2.devolucion();
					break;
				case 3:
					libro3.devolucion();
					break;
				default:
					System.out.println("Opción no válida");
				}
				break;
			}
			case 3: {
				System.out.println(libro1);
				System.err.println("- - - - - - - - - - - - - - - - - -");
				System.out.println(libro2);
				System.err.println("- - - - - - - - - - - - - - - - - -");
				System.out.println(libro3);

				break;
			}
			case 4: {
				System.out.println("Saliendo...");
				salir = true;
				break;
			}
			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (!salir);

		sc.close();

	}

	public static void menu() {

		System.out.println(" - - - - - OPERACIONES - - - - - ");
		System.out.println("|                               |");
		System.out.println("|  1. Préstamo                  |");
		System.out.println("|  2. Devolución                |");
		System.out.println("|  3. Información de libros     |");
		System.out.println("|  4. Salir                     |");
		System.out.println("|                               |");
		System.out.println(" - - - - - - - - - - - - - - - - ");

	}

}
