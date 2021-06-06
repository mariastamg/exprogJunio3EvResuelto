import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Frecuencia {
	
	private static Map<String, Integer>mapa=new HashMap<String, Integer>();
	private String linea;
	private int contador=0;
	private String palabra;
	
	public Frecuencia(File ruta) throws FileNotFoundException {
		
		try {
			FileReader fr=new FileReader(ruta);
			BufferedReader br=new BufferedReader(fr);
			linea=br.readLine();
			while(linea!=null){
			String[]palabras=linea.split("\\P{L}+");
			for(int i=0;i<palabras.length;i++) {
				palabra=palabras[i];
				if(mapa.containsKey(palabra)) {
					contador=mapa.get(palabra);//valor 
					contador++;
					mapa.replace(palabra, contador);//actualizo valor
				}else {
					mapa.put(palabra, 1);
				}
			}
			linea=br.readLine();
				
			}
			
			
			
			

			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public int frecuenciaPalabra(String palabra) {
		int frecuencia=0;
		if(mapa.containsKey(palabra)) {
			
		frecuencia=mapa.get(palabra);//El valor para esa key
				
			
		}
		System.out.println("La palabra "+palabra+" se repite "+frecuencia+" veces.");
		return frecuencia ;
		
	}

}
