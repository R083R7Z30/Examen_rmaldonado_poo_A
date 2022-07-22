
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Persona;

public class Aplicacion {

    public static void main(String[] args) {

        Persona p1 = new Persona("Roberto", "Maldonado", "20", "1721634654");
        Cliente c1 = new Cliente("0979060750");
        
        Persona p2 = new Persona("Anthony", "Sarango", "21", "1753880200");
        Empleado e1 = new Empleado((float) 1300);
        

        System.out.println("cliente: " + p1.getNombre()+ " "  +p1.getApellido());
        System.out.println("cedula "+p1.getCi());
        System.out.println("edad: " + p1.getEdad() + " Años");
        System.out.println("telefono de contacto: " + c1.getTelefono()+""); 
        System.out.println("");
        
        System.out.println("empleado: " + p2.getNombre()+ " "  +p2.getApellido());
        System.out.println("cedula "+p2.getCi());
        System.out.println("edad: " + p2.getEdad() + " Años");
        System.out.println("salario: " + e1.getSueldo());
    }

}

