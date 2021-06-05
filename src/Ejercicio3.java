import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {

	public static void main(String[] args) {
		Queue<Integer>colaNumeros=new LinkedList<Integer>();
		colaNumeros.add(9);
		colaNumeros.add(-2);
		colaNumeros.add(4);
		colaNumeros.add(-8);
		colaNumeros.add(10);
		colaNumeros.add(1);
		colaNumeros.add(7);
		colaNumeros.add(8);
		
		System.out.println(colaNumeros);
		
		System.out.println(invertir(4,colaNumeros));
		
		
		

	}
	
	public static Queue<Integer>invertir (int n, Queue<Integer>colaNumeros) {
		Queue<Integer>pilaInvertidos=new LinkedList<Integer>();
		//int sizeCola=colaNumeros.size();
		
		if(n<=0) {
			return colaNumeros;
		}
		
		if(colaNumeros==null) throw new IllegalArgumentException();
		
		if(!colaNumeros.isEmpty()) {
			for(int i=0;i<n;i++) {
				int caracterSacado=colaNumeros.poll();
				((LinkedList<Integer>) pilaInvertidos).push(caracterSacado);
			}
			
			/*Ahora tengo la cola original con los numeros que restan y la pila con los n 
			primeros numeros*/
			
			while(!pilaInvertidos.isEmpty()) {
				colaNumeros.offer(((LinkedList<Integer>) pilaInvertidos).pop());
			}
			
			/*He añadido los num de la pila a la cola original, ya invertidos, estan colocados
			 * en las ultimas posiciones*/
			
		
		for(int j=0;j<colaNumeros.size()-n;j++) {
			colaNumeros.offer(colaNumeros.poll());	
		}
		
		
		}
		return colaNumeros;
	}

}
