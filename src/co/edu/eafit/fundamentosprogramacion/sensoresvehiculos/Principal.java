package co.edu.eafit.fundamentosprogramacion.sensoresvehiculos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarMenu();
	}

	public static void mostrarMenu() {
		Vehiculo vehiculo = new Vehiculo();
		int modelo;

		String marca;

		double valorComercial;

		System.out.println("Por favor ingrese un 0 O 1, donde cero detiene el programa y 1 para continuar");
		@SuppressWarnings("resource")
		Scanner lectura = new Scanner(System.in);

		System.out.println("Ingrese el número: ");

		boolean continua = true;

		int decision = lectura.nextInt();

		if (decision == 0) {
			System.out.println("Lástima que no nos probaste. Te esperamos en una próxima ocasión!");
			continua = false;
		}

		while (continua) {

			if (decision == 1) {
				if (vehiculo.tamaño > vehiculo.posAnadir) {
					System.out.println("Ingrese el modelo: ");
					modelo = lectura.nextInt();

					System.out.println("Ingrese el marca: ");
					marca = lectura.next();

					System.out.println("Ingrese el valor comercial: ");
					valorComercial = lectura.nextDouble();

					Vehiculo siguienteVehiculo = new Vehiculo(modelo, marca, valorComercial);

					vehiculo.getVehiculos()[vehiculo.posAnadir] = siguienteVehiculo;
					vehiculo.setPosAnadir(1);
				} else {
					System.out.println("Error base de datos llena.");
				}
			}

			System.out.println("Que desea hacer? ");
			decision = lectura.nextInt();

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
				System.out.println(vehiculo.toStringVehiculos());
			}

		}

	}

}
