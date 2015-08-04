import java.util.Random;

public class main {

	public static void main(String[] args) {
		Random gen = new Random();
		Selection selection = new Selection();
		int a;
		int cant = 10;
		int [] lista = new int[cant];
		
		System.out.println("Lista desordenada: ");
		//generacion y almacenaje de los 3000 numeros random
		for (int b=0; b<cant; b++){
			a = gen.nextInt(9000);
			lista[b] = a;
			System.out.println ("Posicion " + b + ": " + lista[b]);
		}
		
		System.out.println ("\n\n");
		System.out.println ("Lista ordenada: " );
		
		//Uso de ordenamiento selection sort
		selection.setLista(lista);
		selection.sort();
		lista = selection.getOrden();
		
		//impresion de la nueva lista
		for (int i=0; i<cant; i++){
			System.out.println ("Posicion" + i + ": " + lista[i]);
		}
	}

}
