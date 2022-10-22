package co.edu.eafit.fundamentosprogramacion.sensoresvehiculos;

import java.util.Arrays;

public class Sensor implements Comparable<Sensor> {

	private Sensor[] sensores = new Sensor[3];
	private int tamaño = 3;
	private int posAnadir = 0;
	private int cantidadSensoresTemperatura;
	private String tipo;
	private double valorComercial;

	public Sensor() {
		super();
	}

	public Sensor(String tipo, double valorComercial) {
		super();
		this.tipo = tipo;
		this.valorComercial = valorComercial;
	}

	public int cantidadSensores() {
		return this.posAnadir;
	}

	@Override
	public int compareTo(Sensor sensor) {
		int value = 0;
		if (this.valorComercial < sensor.getValorComercial()) {
			value = -1;
		} else if (this.valorComercial > sensor.getValorComercial()) {
			value = 1;
		}
		// TODO Auto-generated method stub
		return value;
	}

	public int getCantidadSensoresTemperatura() {
		return cantidadSensoresTemperatura;
	}

	public int getPosAnadir() {
		return posAnadir;
	}

	public Sensor[] getSensores() {
		return sensores;
	}

	public Sensor getSensoresTemperatura(Sensor sensor) {
		Sensor[] sensorSort = new Sensor[sensor.getCantidadSensoresTemperatura()];
		Sensor sensorTemperatura = new Sensor();
		sensorTemperatura.setSensores(sensorSort);
		if (sensor.getCantidadSensoresTemperatura() > 0) {
			for (int i = 0; i < sensor.cantidadSensores(); i++) {

				if (sensor.getSensores()[i].getTipo().equalsIgnoreCase("temperatura")) {
					sensorTemperatura.getSensores()[sensorTemperatura.getPosAnadir()] = sensor.getSensores()[i];
					sensorTemperatura.setPosAnadir(1);
				}
			}
		}

		return sensorTemperatura;
	}

	public String getSensoresTemperaturaSort(Sensor sensorTemperatura) {

		Arrays.sort(sensorTemperatura.getSensores());

		return sensorTemperatura.toStringSensores();
	}

	public int getTamaño() {
		return tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorComercial() {
		return valorComercial;
	}

	public void setCantidadSensoresTemperatura(int cantidadSensoresTemperatura) {
		this.cantidadSensoresTemperatura = this.cantidadSensoresTemperatura + cantidadSensoresTemperatura;
	}

	public void setPosAnadir(int posAnadir) {
		this.posAnadir = this.posAnadir + posAnadir;
	}

	public void setSensores(Sensor[] sensores) {
		this.sensores = sensores;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setValorComercial(double valorComercial) {
		this.valorComercial = valorComercial;
	}

	@Override
	public String toString() {
		return "Sensor [tipo=" + tipo + ", valorComercial=" + valorComercial + "]";
	}

	public String toStringSensores() {
		String informacionTotal = "Información de todos los sensores almacenados hasta el momento." + "\n" + "\n";
		int posicionSensor = 1;
		for (int i = 0; i < this.posAnadir; i++) {
			informacionTotal = informacionTotal + posicionSensor + " | " + this.sensores[i].toString() + "\n";
			++posicionSensor;
		}

		return informacionTotal;
	}

}
