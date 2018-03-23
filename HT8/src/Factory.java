
import java.util.PriorityQueue;

/**
 * Clase que demuestra la utilizacion del patron de diseño factory.
 * @author Ana Lucía Hernández (17138) Diego Sevilla (17238)
 */
class Factory {
    /**
     * Constructor vacio.
     */
    public Factory(){}
    /**
     * Metodo que retorna la implementacion a utilizar
     * @param impMap el string que dice que implementacionse utilizara
     * @return el Map correspondiente
     */
    public static Object getImp(String imp) {
    // seleccion de la implementacion a utilizar:
        if(imp.equals("VectorHeap"))
        {
            return new VectorHeap<Paciente>();
        }
        else
        {
            return new PriorityQueue<Paciente>();
        }          
   }

}
