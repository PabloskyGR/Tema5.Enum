package ejercicio01;

public class Libro {

	private String titulo = "";
	private String autor = "";
	private int ejemplares = 0;
	private int prestados = 0;
	private Genero genero;

	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados > 0) {
			this.prestados = prestados;
		}
		if (genero != null) {
			this.genero = Genero.valueOf(genero);
		}
	}

	public boolean prestamo() {
		boolean existencias = false;

		if (this.ejemplares > 0) {
			this.ejemplares--;
			this.prestados++;
			existencias = true;
		}

		return existencias;
	}

	public boolean devolucion() {
		boolean existencias = false;

		if (this.prestados > 0) {
			this.prestados--;
			this.ejemplares++;
			existencias = true;
		}

		return existencias;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPrestados() {
		return prestados;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		if (genero != null) {
			this.genero = genero;
		}
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += "Titulo: " + this.titulo + "\n";
		cadena += "Autor: " + this.autor + "\n";
		cadena += "Género: " + this.genero + "\n";
		cadena += "Ejemplares: " + this.ejemplares + "\n";
		cadena += "Prestados: " + this.prestados + "\n";

		return cadena;
	}

}
