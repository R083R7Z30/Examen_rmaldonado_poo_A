
package ec.edu.intsuperior.modelo;

public class Cliente extends Persona{

    private String telefono;

    public void mostrarDatos() {
    }

    public Cliente(String telefono) {
        this.telefono = telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }  

    public String getSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
