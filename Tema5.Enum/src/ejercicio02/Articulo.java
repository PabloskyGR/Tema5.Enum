package ejercicio02;

public class Articulo {

	private String nombre = "";
	private double precio = 0;
	public final double IVA = 0.21;
	private int cuantosQuedan = 0;
	private Departamentos departamento;

	public Articulo(String nombre, double precio, int cuantosQuedan, String departamento) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
		if (cuantosQuedan > 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
		if (departamento != null && !departamento.equals("")) {
			this.departamento = Departamentos.valueOf(departamento);
		}
	}

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	public String imprime() {
		String cadena = "";

		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Precio: " + this.precio + "\n";
		cadena += "Departamento: " + this.departamento + "\n";
		cadena += "Stock: " + this.cuantosQuedan + "\n";

		return cadena;

	}

	public double getPVP() {
		double pvp = 0;

		pvp = this.precio + (this.IVA * this.precio);

		return pvp;
	}

	public double getPVPDescuento(double descuento) {
		double pvpDescuento = 0;

		descuento /= 100;
		pvpDescuento = getPVP() - (descuento * getPVP());

		return pvpDescuento;
	}

	public boolean vender(int cantidad) {
		boolean dev = false;

		if (cantidad > 0 && this.cuantosQuedan >= cantidad) {
			this.cuantosQuedan -= cantidad;
			dev = true;
		}

		return dev;
	}

	public boolean almacenar(int cantidad) {
		boolean dev = false;

		if (cantidad > 0) {
			this.cuantosQuedan += cantidad;
			dev = true;
		}

		return dev;
	}

}
