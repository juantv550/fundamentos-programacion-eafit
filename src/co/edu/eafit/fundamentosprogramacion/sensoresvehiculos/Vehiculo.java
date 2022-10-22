package co.edu.eafit.fundamentosprogramacion.sensoresvehiculos;

public class Vehiculo {

	private Vehiculo[] vehiculos = new Vehiculo[10];
	private int tamaño = 2;
	private int posAnadir = 0;
	private int modelo;
	private String marca;
	private double valorComercial;
	private String color;

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

	public int cantidadVehiculos() {
		return this.posAnadir;
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

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", marca=" + marca + ", valorComercial=" + valorComercial + ", color="
				+ color + "]";
	}

	public String toStringVehiculos() {
		String informacionTotal = "Información de todos los vehículos almacenados hasta el momento." + "\n" + "\n";
		int posicionVehiculo = 1;
		for (int i = 0; i < this.posAnadir; i++) {
			informacionTotal = informacionTotal + posicionVehiculo + " | " + this.vehiculos[i].toString() + "\n";
			++posicionVehiculo;
		}

		return informacionTotal;
	}

	public String obtenerVehiculosVerdes(Vehiculo vehiculo) {
		int posicionVehiculo = 1;
		int cantidadVehiculosVerdes = 0;
		String vehiculosVerdes = "Vehículos registrados con color verde. \n \n";
		if (vehiculo.cantidadVehiculos() > 0) {
			for (int i = 0; i < vehiculo.cantidadVehiculos(); i++) {
				if (vehiculo.getVehiculos()[i].getColor().equalsIgnoreCase("verde")) {
					vehiculosVerdes = vehiculosVerdes + posicionVehiculo + " | " + vehiculo.getVehiculos()[i].toString()
							+ "\n";
					++posicionVehiculo;
					++cantidadVehiculosVerdes;
				}
			}
		}

		if (cantidadVehiculosVerdes == 0) {
			vehiculosVerdes = vehiculosVerdes + cantidadVehiculosVerdes;
		}

		return vehiculosVerdes;
	}

	public String obtenerVehiculosPorModelo(Vehiculo vehiculo) {
		int posicionVehiculo = 1;
		int cantidadVehiculosModelo = 0;
		int modelo = 0;
		String vehiculosModelo = "Vehículos registrados con modelo entre 2000 y 2021. \n \n";
		if (vehiculo.cantidadVehiculos() > 0) {
			for (int i = 0; i < vehiculo.cantidadVehiculos(); i++) {
				modelo = vehiculo.getVehiculos()[i].getModelo();
				if (modelo >= 2000 && modelo <= 2021) {
					vehiculosModelo = vehiculosModelo + posicionVehiculo + " | " + vehiculo.getVehiculos()[i].toString()
							+ "\n";
					++posicionVehiculo;
					++cantidadVehiculosModelo;
				}
			}
		}

		if (cantidadVehiculosModelo == 0) {
			vehiculosModelo = vehiculosModelo + cantidadVehiculosModelo;
		}

		return vehiculosModelo;
	}

}
