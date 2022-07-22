
package ec.edu.intsuperior.modelo;

public class Persona { 

    private String nombre; 
    private String apellido;   
    private String edad;
    private String ci; 
            
    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getEdad() {
        return edad;
    }
    
    public String getCi() {
        return ci;
    }

   
    
    

}
