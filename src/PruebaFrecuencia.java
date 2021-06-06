import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaFrecuencia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra = "";
		System.out.println("Introduzca palabra a buscar: END PARA TERMINAR ");

		File ruta = new File("C:\\pruebas\\El Quijote ISO-8859-1.txt");
		Frecuencia f1 = null;
		try {
			f1 = new Frecuencia(ruta);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (!palabra.equalsIgnoreCase("END")) {
			palabra = sc.nextLine();
			f1.frecuenciaPalabra(palabra);

		}
		System.out.println("FIN DE PROGRAMA");
	}

}
