
package ec.edu.intsuperior.modelo;


public class Empresa {

    private String nombre;
    private String sector;
    private String funcion;
    
    public Empresa() {
    }

    public Empresa(String nombre, String sector, String funcion) {
        this.nombre = nombre;
        this.sector = sector;
        this.nombre = funcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSector(String nombre) {
        this.sector = sector;
    }
    
    public void setFuncion(String nombre) {
        this.funcion = funcion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getSector() {
        return sector;
    }
    
    public String getFuncion() {
        return funcion;
    }

    

}


