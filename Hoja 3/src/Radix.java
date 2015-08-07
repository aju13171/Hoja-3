
public class Radix {
	
	
	public static void mostrarArregloEnt(int[] arreglo){
		//Recorrer el arreglo para mostrar los nï¿½meros
		System.out.println("Usted ha ingresado los siguientes números:");
		int j=1;
		for (int arr:arreglo) //Va a recorrer todo el arreglo guardando en la variable arr cada elemento del arreglo.
		{
			System.out.println("Numero "+j+" : "+arr);
			j++;
		}
		System.out.println("Tamaño del arreglo: "+arreglo.length);
	}
	
	public static void RadixSort(int[] arreglo){
		
		
		String[] cero = new String[arreglo.length];
		
		String[] uno = new String[arreglo.length];
		
		String[] dos = new String[arreglo.length];
		
		String[] tres = new String[arreglo.length];
		
		String[] cuatro = new String[arreglo.length];
		
		String[] cinco = new String[arreglo.length];
		
		String[] seis = new String[arreglo.length];
		
		String[] siete = new String[arreglo.length];
		
		String[] ocho = new String[arreglo.length];
		
		String[] nueve = new String[arreglo.length];
		
		int[] vieja = arreglo;
		String[] nueva = new String[arreglo.length];
		
		
		
		
		int posnueva = 0;
		int contadorCero = 0;
		int contadorUno = 0;
		int contadorDos = 0;
		int contadorTres = 0;
		int contadorCuatro = 0;
		int contadorCinco = 0;
		int contadorSeis = 0;
		int contadorSiete = 0;
		int contadorOcho = 0;
		int contadorNueve = 0;
		/*
		 * Identificar el numero mayor del arreglo y la cantidad de digitos que tiene para saber cuantas veces se debe repetir el ciclo de clasificacion
		 * */
		int mayor = 0;
		for(int i=0; i < vieja.length; i++){
			if (vieja[i] > mayor){
				mayor = vieja[i];
			}
		}
		System.out.println("Número mayor: "+mayor);
		System.out.println("Número de digitos en "+mayor+" : "+String.valueOf(mayor).length());
		
		/*
		 * Contador : veces que se debe repetir el ciclo
		 * */
		int contador = String.valueOf(mayor).length();
		
		//int a string, agregar ceros faltantes y almacenarlos en arreglo nueva[]
		
		for(int i=0; i < vieja.length; i++){
			nueva[i] = Integer.toString(vieja[i]);
			while (nueva[i].length() != String.valueOf(mayor).length()){
				nueva[i]= '0'+nueva[i].substring(0);
			}
		}
		
		// imprimir valores del arreglo nueva despues de agregar los ceros
		int j=1;
		for (String aj:nueva) //Va a recorrer todo el arreglo guardando en la variable val cada elemento del arreglo.
		{
			System.out.println("Numero "+j+" : "+aj);
			j++;
		}
		
		
		int caracter = String.valueOf(mayor).length()-1;
		
		while (contador != 0){
			//claasificar en listas de 0 a 9
			for(int i = 0; i < nueva.length; i++){
				if(nueva[i].charAt(caracter) == '0'){
					cero[contadorCero] = nueva[i];
					contadorCero++;
				} 
				else if(nueva[i].charAt(caracter) == '1'){
					uno[contadorUno] = nueva[i];
					contadorUno++;
				} 
				else if(nueva[i].charAt(caracter) == '2'){
					dos[contadorDos] = nueva[i];
					contadorDos++;
				} 
				else if(nueva[i].charAt(caracter) == '3'){
					tres[contadorTres] = nueva[i];
					contadorTres++;
				} 
				else if(nueva[i].charAt(caracter) == '4'){
					cuatro[contadorCuatro] = nueva[i];
					contadorCuatro++;
				} 
				else if(nueva[i].charAt(caracter) == '5'){
					cinco[contadorCinco] = nueva[i];
					contadorCinco++;
				} 
				else if(nueva[i].charAt(caracter) == '6'){
					seis[contadorSeis] = nueva[i];
					contadorSeis++;
				} 
				else if(nueva[i].charAt(caracter) == '7'){
					siete[contadorSiete] = nueva[i];
					contadorSiete++;
				} 
				else if(nueva[i].charAt(caracter) == '8'){
					ocho[contadorOcho] = nueva[i];
					contadorOcho++;
				} 
				//else if(nueva[i].charAt(caracter) == '9'){
				else{
					nueve[contadorNueve] = nueva[i];
					contadorNueve++;
				}
			}//finaliza for clasificacion
			
			caracter--;
			
			for(int k = 0; k == contadorCero; k++){
				nueva[posnueva] = cero[k];
				posnueva++;
			}
			for(int k = 0; k == contadorUno; k++){
				nueva[posnueva] = uno[k];
				posnueva++;
			}
			for(int k = 0; k == contadorDos; k++){
				nueva[posnueva] = dos[k];
				posnueva++;
			}
			for(int k = 0; k == contadorTres; k++){
				nueva[posnueva] = tres[k];
				posnueva++;
			}
			for(int k = 0; k == contadorCuatro; k++){
				nueva[posnueva] = cuatro[k];
				posnueva++;
			}
			for(int k = 0; k == contadorCinco; k++){
				nueva[posnueva] = cinco[k];
				posnueva++;
			}
			for(int k = 0; k == contadorSeis; k++){
				nueva[posnueva] = seis[k];
				posnueva++;
			}
			for(int k = 0; k == contadorSiete; k++){
				nueva[posnueva] = siete[k];
				posnueva++;
			}
			for(int k = 0; k == contadorOcho; k++){
				nueva[posnueva] = ocho[k];
				posnueva++;
			}
			for(int k = 0; k == contadorNueve; k++){
				nueva[posnueva] = nueve[k];
				posnueva++;
			}
			
			int e=1;
			for (String aj:nueva) //Va a recorrer todo el arreglo guardando en la variable val cada elemento del arreglo.
			{
				System.out.println("Numero "+e+" : "+aj);
				e++;
			}
			
			contador--;
			posnueva = 0;
			contadorCero = 0;
			contadorUno = 0;
			contadorDos = 0;
			contadorTres = 0;
			contadorCuatro = 0;
			contadorCinco = 0;
			contadorSeis = 0;
			contadorSiete = 0;
			contadorOcho = 0;
			contadorNueve = 0;
			
			}
			
		}// metodo
			
			
}
