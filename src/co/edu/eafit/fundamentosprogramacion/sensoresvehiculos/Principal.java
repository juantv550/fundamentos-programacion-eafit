package co.edu.eafit.fundamentosprogramacion.sensoresvehiculos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A continuación lea las siguientes instrucciones: ");
		System.out.println("0 detiene el programa.");
		System.out.println("1 para ingresar un vehículo.");
		System.out.println("2 muestra la información almacenada de los vehículos.");
		System.out.println("3 cantidad de vehículos almacenados.");
		System.out.println("4 muestra la información de vehículos con color verde.");
		System.out.println("5 muestra la información de vehículos con modelo entre el año 2001 y 2021.");
		System.out.println("6 para ingresar un sensor.");
		System.out.println("7 muestra la información almacenada de los sensores.");
		System.out.println("8 cantidad de sensores almacenados.");
		System.out.println("9 muestra la información de sensores tipo temperatura.");
		System.out.println("666 muestra la información de sensores tipo temperatura y ordenados por valor comercial.");
		System.out.println("");

		mostrarMenu();
	}

	private static void mostrarMenu() {

		Vehiculo vehiculo = new Vehiculo();
		int modelo = 0;
		String marca = "N/A";
		double valorComercial = 0;
		Vehiculo siguienteVehiculo = null;

		Sensor sensor = new Sensor();
		String tipo = "N/A";

		@SuppressWarnings("resource")
		Scanner lectura = new Scanner(System.in);

		System.out.println("Ingrese el número para su necesidad: ");

		boolean continua = true;

		int decision = lectura.nextInt();

		if (decision == 0) {
			System.out.println("Lástima que no nos probaste. Te esperamos en una próxima ocasión!");
			continua = false;
		}

		while (continua) {

			if (decision == 1) {
				if (vehiculo.getTamaño() > vehiculo.getPosAnadir()) {
					System.out.println("Ingrese el modelo: ");
					modelo = lectura.nextInt();

					System.out.println("Ingrese el marca: ");
					marca = lectura.next();

					System.out.println("Ingrese el valor comercial: ");
					valorComercial = lectura.nextDouble();

					siguienteVehiculo = new Vehiculo(modelo, marca, valorComercial);

					System.out.println("Desea ingresar el color de vehículo? S/N ");

					if (lectura.next().toUpperCase().equalsIgnoreCase("S")) {
						System.out.println("Ingrese el color de vehículo: ");
						siguienteVehiculo = new Vehiculo(modelo, marca, valorComercial, lectura.next());
					}

					vehiculo.getVehiculos()[vehiculo.getPosAnadir()] = siguienteVehiculo;
					vehiculo.setPosAnadir(1);
				} else {
					System.out.println("Error base de datos de vehículos llena.");
				}
			}

			if (decision == 0) {
				System.out.println("Gracias por utilizarnos. Te esperamos de nuevo!");
				continua = false;
			}

			if (decision == 2) {
				System.out.println(vehiculo.toStringVehiculos());
			}

			if (decision == 3) {
				System.out.println("Cantidad de vehículos almacenados: " + vehiculo.cantidadVehiculos() + ".");
			}

			// por desarrollar
			if (decision == 4) {
				System.out.println(vehiculo.obtenerVehiculosVerdes(vehiculo));
			}

			if (decision == 5) {
				System.out.println(vehiculo.obtenerVehiculosPorModelo(vehiculo));
			}

			if (decision == 6) {
				if (sensor.getTamaño() > sensor.getPosAnadir()) {

					System.out.println("Ingrese el tipo: ");
					tipo = lectura.next();

					System.out.println("Ingrese el valor comercial: ");
					valorComercial = lectura.nextDouble();

					sensor.getSensores()[sensor.getPosAnadir()] = new Sensor(tipo, valorComercial);
					sensor.setPosAnadir(1);
				} else {
					System.out.println("Error base de datos de sensores llena.");
				}

				if (tipo.equalsIgnoreCase("temperatura")) {
					sensor.setCantidadSensoresTemperatura(1);
				}
			}

			if (decision == 7) {
				System.out.println(sensor.toStringSensores());
			}

			if (decision == 8) {
				System.out.println(sensor.cantidadSensores());
			}

			if (decision == 9) {
				System.out.println(sensor.getSensoresTemperatura(sensor).toStringSensores());
			}

			if (decision == 666) {
				Sensor sensorParam = sensor.getSensoresTemperatura(sensor);
				System.out.println(sensor.getSensoresTemperaturaSort(sensorParam));
			}

			System.out.println("Que desea hacer? ");
			decision = lectura.nextInt();

		}

	}

}
