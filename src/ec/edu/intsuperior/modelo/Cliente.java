
package ec.edu.intsuperior.modelo;

public class Cliente extends Persona{

    private String telefono;

    public  Cliente() {
    }

    public Cliente(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}


