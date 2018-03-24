
import java.util.PriorityQueue;

/**
 * Clase que demuestra la utilizacion del patron de diseño factory.
 * @author Paul Belches 17088 - Diego Sevilla 17238
 */
class Factory {
    /**
     * Constructor vacio.
     */
    public Factory(){}
    Object Imp;
    /**
     * Metodo que retorna la implementacion a utilizar
     * @param impMap el string que dice que implementacionse utilizara
     * @return el Map correspondiente
     */
    public Object getImp(String imp) {
    // seleccion de la implementacion a utilizar:
        if(imp.equals("VectorHeap"))
        {   
            Imp = new VectorHeap<>();
        }else{
            Imp = new PriorityQueue<>();
        } 
        return Imp;
   }

}
