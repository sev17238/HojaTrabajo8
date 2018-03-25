
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.PriorityQueue;
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
        
        Factory fac = new Factory();
        VectorHeap<Paciente> heap = null;
        PriorityQueue<Paciente> queue = null;
        
        Scanner teclado = new Scanner(System.in); 
        System.out.println("¿Que Implementacion desea usar? (Escriba solo el numero) \n\t1. VectorHeap \n\t2. PriorityQueue");
        String entry = teclado.nextLine();
                
        switch(entry){
                    case "1":                       
                        heap = (VectorHeap)fac.getImp("VectorHeap"); 
                        break;
                    case "2":                           
                        queue = (PriorityQueue)fac.getImp("PriorityQueue");//                      
                        break;                     
                } 
            
            System.out.println("Ingrese el nombre del archivo.txt con los pacientes en espera (Ej. pacientes.txt): ");
            String file = teclado.nextLine();
            
            BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"));  

            try {                
                StringBuilder sb = new StringBuilder();
                String line = "";              
                
                //Ciclo en donde se lee cada linea del .txt
                while ((line=br.readLine())!=null) {
                    String[] partes = line.split(",");
                    
                    if (entry.equals("1")){
                        heap.add(new Paciente(partes[0],partes[1],partes[2]));                        
                    }else{
                        queue.offer(new Paciente(partes[0],partes[1],partes[2]));
                    }
                                        
                    System.out.println(Arrays.toString(partes)); //PRUEBA de impresion                  
                                                          
                }
                System.out.println("Que desea hacer?\n1. Retirar paciente siguiente \n2. Salir ");
                decision = teclado.nextInt();
                
                Paciente pa = null;
                while(decision != 2){
                    if(entry.equals("1")){
                        
                        if (!(heap.isEmpty())) pa = heap.remove();
                        else pa = null;
                        if(pa != null) System.out.println("\nPaciente a atender:\n"+pa.getName()+", "+pa.getDescription()+"; "+pa.getCode()+"\n");
                        else System.out.println("Ya no hay pacientes que atender.");
                        
                    }else{
                        pa = queue.poll();
                        if(pa != null)  System.out.println("\nPaciente a atender:\n"+pa.getName()+", "+pa.getDescription()+"; "+pa.getCode()+"\n");
                        else System.out.println("Ya no hay pacientes que atender.");
                        System.out.println("\n"+pa.getName()+", "+pa.getDescription()+"; "+pa.getCode()+"\n");
                    }                     
                    System.out.println("Que desea hacer?\n1. Retirar paciente siguiente \n2. Salir ");
                    decision = teclado.nextInt();
                }           
                
            }
            finally{
                br.close();
            }  
        
        
    }
    
    
    
}
