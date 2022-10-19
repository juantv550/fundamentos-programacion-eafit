package co.edu.eafit.fundamentosprogramacion.sensoresvehiculos;

public class Sensor {

	private Sensor[] vehiculos = new Sensor[8];
	private int tamaño = 8;
	private int posAnadir = 0;
	private String tipo;
	private double valorComercial;

	public Sensor[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Sensor[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getPosAnadir() {
		return posAnadir;
	}

	public void setPosAnadir(int posAnadir) {
		this.posAnadir = posAnadir;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValorComercial() {
		return valorComercial;
	}

	public void setValorComercial(double valorComercial) {
		this.valorComercial = valorComercial;
	}

	public Sensor() {
		super();
	}

	public Sensor(String tipo, double valorComercial) {
		super();
		this.tipo = tipo;
		this.valorComercial = valorComercial;
	}

	@Override
	public String toString() {
		return "Sensor [tipo=" + tipo + ", valorComercial=" + valorComercial + "]";
	}

}
