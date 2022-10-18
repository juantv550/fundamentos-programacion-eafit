package co.edu.eafit.fundamentosprogramacion.sensoresvehiculos;

public class Vehiculo {

	Vehiculo[] vehiculos = new Vehiculo[10];

	int tamaño = 2;

	int posAnadir = 0;

	int modelo;

	String marca;

	double valorComercial;

	String color;

	public Vehiculo() {
		super();

		// TODO Auto-generated constructor stub
	}

	public Vehiculo(int modelo, String marca, double valorComercial) {
		this(modelo, marca, valorComercial, "verde");
	}

	public Vehiculo(int modelo, String marca, double valorComercial, String color) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.valorComercial = valorComercial;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public int getModelo() {
		return modelo;
	}

	public int getPosAnadir() {
		return posAnadir;
	}

	public int getTamaño() {
		return tamaño;
	}

	public double getValorComercial() {
		return valorComercial;
	}

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public void setPosAnadir(int posAnadir) {
		this.posAnadir = this.posAnadir + posAnadir;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public void setValorComercial(double valorComercial) {
		this.valorComercial = valorComercial;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	public String toStringVehiculos() {
		String informacionTotal = "Información de todos los vehículos almacenados hasta el momento." + "\n" + "\n";
		int posicionVehiculo = 1;
		for (int i = 0; i < this.posAnadir; i++) {
			informacionTotal = informacionTotal + posicionVehiculo + " | " + vehiculos[i].toString() + "\n";
			++posicionVehiculo;
		}

		return informacionTotal;
	}

	public int cantidadVehiculos() {
		return this.posAnadir;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", marca=" + marca + ", valorComercial=" + valorComercial + ", color="
				+ color + "]";
	}

}
