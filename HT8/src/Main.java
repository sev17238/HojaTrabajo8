
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Paul Belches 17088 - Diego Sevilla 17238
 */
public class Main {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        int decision = 0; 
        
        //VectorHeap<String> vector = new VectorHeap<>(); 
                                                                            
        //BinaryNode<String> nod = null;
        //BinaryTree2<String> tree = new BinaryTree2<String>(nod);
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        
            System.out.println("Ingrese el nombre del archivo.txt que quiere leer para su lista de pacientes (Ej. pacientes.txt): ");
            String file = teclado.nextLine();
            
            BufferedReader br = new BufferedReader(new FileReader(file));     

            try {                
                StringBuilder sb = new StringBuilder();
                String line = "";              
                                                
                String nameDescription = "";
                String code = "";
                
                //Ciclo en donde se lee cada linea del .txt donde estan las asociaciones de ingles y espanol
                while ((line=br.readLine())!=null) {
                    sb.append(line);
                    sb.append(System.lineSeparator()); 
                    line = line + " "; //Concatenado para que el ultimo valor sea leido sin problemas
                                       //por substring
                    for(int i=1;i<line.length();i++){
                        String iter = line.substring((i-1), i); 
                        if(iter.equals(",")){
                            for(int e=i;e<line.length();e++){
                                String iter2 = line.substring((e-1), e);
                                if(iter2.equals(",")){
                                    code = line.substring(e, line.length()).toUpperCase(); //se obtiene la subcadena luego de ","
                                    nameDescription = line.substring(0, e-1).toUpperCase(); //se obtiene la subcadena antes de ","    
                                }
                            }
                        }
                    }
                    
                    //BinaryNode<String> node = new BinaryNode<String>(ingles,espanol); //se crea un nuevo nodo con cada linea
                    //tree.addNodo(node); //el nodo se agrega al arbol
                    
                    System.out.println(nameDescription +" | "+ code); //PRUEBA para ver la separacion del codigo y de la descripcion                   
                }
                System.out.println("Que desea hacer? \n1. Mostrar pacientes por prioridad \n2. Retirar paciente siguiente \n3. Salir ");
                decision = teclado.nextInt();               
                while(decision != 3){
                    switch(decision){
                        case 1: //Mostrar pacientes
                            
                            break;
                        case 2: //Retirar paciente siguiente
                            
                            break;
                    }
                }
           
                
            }
            finally{
                br.close();
            }  
        
        
    }
    
    
    
}