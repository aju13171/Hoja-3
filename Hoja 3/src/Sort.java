import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Sort {

    public static void main(String[] args) {
       
        //Cantidad de datos 
        int numeros = 10;
        File archivo = new File("archivo.txt");
        Random random = new Random(); 
        Comparable[] cadena = new Comparable[numeros];
        //Agrega los numeros random generados al archivo 
        try {
            FileWriter escribirArchivo = new FileWriter(archivo);
            BufferedWriter bfescribir = new BufferedWriter(escribirArchivo);
            PrintWriter escribir = new PrintWriter(bfescribir);
            
            int num; //Random de numeros 
                for (int i = 0; i < numeros; i++) {
        	num = (int)(random.nextDouble() * 2000.0);
        	System.out.println(num); 
                //escritura en el archivo
                bfescribir.write(Integer.toString(num));
                bfescribir.newLine();
            }
            
            escribir.close();
            bfescribir.close();
            
        }catch (Exception ex) {
        } 
        
        // almacener y leer en un Array
        BufferedReader insede;
        try {
       
            insede = new BufferedReader( new FileReader( archivo ) );
            String array1;
            
            while(insede.ready()){
                //Detecta lo que hay en array1 leÃ­da del archivo
                int cont=0;
                while((array1=insede.readLine())!=null){
                    array1 = array1.substring(0);
                    //Agrega los datos al array
                    cadena[cont] = (Integer.parseInt(array1));
                    cont = cont + 1; //Incrementa el cont del las lineas del arcivo
                }
            }
            }catch (IOException e) {
            e.printStackTrace();
            }
         //metodo merge   
        mergeSTR merge = new mergeSTR();
        merge.MergeSTR(cadena);
        
       
    }
}  
