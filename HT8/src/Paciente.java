
/**
 *
 * @author Paul Belches 17088 - Diego Sevilla 17238
 */
public class Paciente implements Comparable<Paciente>{
    private String Name;
    private String Description;
    private String Code;

    public Paciente(String Name, String Description, String Code) {
        this.Name = Name;
        this.Description = Description;
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }
    
    @Override
    public int compareTo(Paciente t) {
        return Code.compareTo(t.getCode()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
