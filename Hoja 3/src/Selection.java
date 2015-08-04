/*ordemaniento selection sort*/
/* 
 * Se selecciona de la lista el primer elemento, se recorre
 * toda la lista hasta encontrar con otro elemento mas pequeño
 * o terminar de recorrer toda la lista. El elemento mas pequeño
 * se mueve a la primera posicion en caso de ser la primera corrida
 * o se mueve al espacio donde se tomo el elemento antes de recorrer 
 * la lista.
 */
public class Selection {
	/*lista unsort es la lista de entrada*/
	int [] unsort;
	
	public void setLista(int[] lista){
		/*lista es la lista enviada desde el main*/
		unsort = lista;
	}
	
	public void sort(){
		int largo = unsort.length;
		int less;
		/*se recorre cada elemento de la lista*/
		for (int i=0; i<largo-1; i++){
			/*selecciona el primer elemento como el menor*/
			less = unsort[i];
			/*se realiza el recorrido de lista en busca de uno menor*/ 
			for (int j= i+1; j<largo; j++){
				if (unsort[j]<less){
					/*si el elemento de recorrido es menor que el seleccionado*/
					unsort[i] = unsort[j];
					unsort[j] = less;
				}
			}
		}
	}
	
	public int[] getOrden(){
		return unsort;
	}
}
