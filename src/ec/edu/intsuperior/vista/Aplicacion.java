
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

public class Aplicacion {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("Roberto", "Maldonado", "20", "1721634654");
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("0979060750");

        System.out.println("El cliente: " + p2.getNombre());
        System.out.println("con cedula "+p2.getCi());
        System.out.println("De: " + p2.getEdad() + " Años de Edad");
        System.out.println("Y numero de telefono: " + c2.getTelefono());
    }

}

