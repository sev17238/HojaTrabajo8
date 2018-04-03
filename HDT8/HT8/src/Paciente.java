
/**
 * Clase que representa a un paciente con nombre, descripcion de su padecimiento y su codigo de importancia.
 * @author Paul Belches 17088 - Diego Sevilla 17238
 */
public class Paciente implements Comparable<Paciente>{
    private String Name;
    private String Description;
    private String Code;

    /** COnstructor de la clase crea un nuevo paciente     *
     * @param Name
     * @param Description
     * @param Code
     */
    public Paciente(String Name, String Description, String Code) {
        this.Name = Name;
        this.Description = Description;
        this.Code = Code;
    }

    /**
     * devuelve el nombre del paciente
     * @return el nombre
     */
    public String getName() {
        return Name;
    }

    /**
     * coloca el nombre del paciente
     * @param Name el nombre
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * devuelve la descripccion del padecimiento
     * @return la descripcion
     */
    public String getDescription() {
        return Description;
    }

    /**
     * coloca la descripcion del padecimeinto del paciente
     * @param Description la descripcion
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * devuelve el codigo de importancia del paciente
     * @return el codigo
     */
    public String getCode() {
        return Code;
    }

    /**
     * coloca el codigo del paciente
     * @param Code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }
    
    @Override
    public int compareTo(Paciente t) {
        return Code.compareTo(t.getCode()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
