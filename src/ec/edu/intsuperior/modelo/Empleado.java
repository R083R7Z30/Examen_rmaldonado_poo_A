
package ec.edu.intsuperior.modelo;


public class Empleado extends Persona {

    private float sueldo;

    public void CalcularSalario() {
    }

    public Empleado(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }
}
