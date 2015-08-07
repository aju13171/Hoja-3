
/* Author yasminvale*/
/*clase main para crear archivo de texto para leer y ordenar cone el merge sort*/

public class mergeSTR{
  
    
	public  void MergeSTR(Comparable [ ] Array1)
	{
                // Array mid es temporal para realizar los cortes
		Comparable[] mid = new Comparable[Array1.length];
                //call constructor para iniciar ordenamiento
		MergeSTR(Array1, mid,  0,  Array1.length - 1);
                //impresiÃ³n lista
                System.out.println("Ordenamiento Merge");
                for (int i = 0; i < Array1.length-1; i++){
                    System.out.println(Array1[i]);
                    
                }    
	}
        
        
	private static void MergeSTR(Comparable [ ] compa1, Comparable [ ] mid, int high, int low)
	{
                /*aqui se corrobora que ya no hayan mÃ¡s comparaciones
				obteniendo el valor entral y aplicando merge para dividir el arreglo*/
		if( high < low )
		{
			int central = (high + low) / 2;
			MergeSTR(compa1, mid, high, central);
			MergeSTR(compa1, mid, central + 1, low);
			merge(compa1, mid, high, central + 1, low);
		}
	}

    private static void merge(Comparable[ ] compa1, Comparable[ ] mid, int high, int low, int lower )
    {
        //variable de elemento final de comparaciÃ³n
        int higher = low - 1;
        int ihigh = high;
        //valor del tamaÃ±o del array
        int control = lower - high + 1;

        //mientras no se haya llegado a los extremos compara las variables
        while(high <= higher && low <= lower)
            if(compa1[high].compareTo(compa1[low]) <= 0)
                mid[ihigh++] = compa1[high++];
            else
                mid[ihigh++] = compa1[low++];

        //Copiar parte restante izquierdo
        while(high <= higher)    
            mid[ihigh++] = compa1[high++];

        //copia de array parte baja 
        while(low <= lower) 
            mid[ihigh++] = compa1[low++];

        //se copia todo el arreglo compa1
        for(int i = 0; i < control; i++, lower--)
            compa1[lower] = mid[lower];
    }
    
   
    
 }

//Referencias:
/*
https://netbeans.org/kb/docs/java/profiler-profilingpoints.html
http://www.java2novice.com/java-sorting-algorithms/merge-sort/
http://javahungry.blogspot.com/2013/06/java-sorting-program-code-merge-sort.html


*/
