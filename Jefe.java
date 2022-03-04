
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Jefe extends Empleado      //crea Objetos del tipo Jefe
{
    //hereda todos sus campos
    
    //constructor
    public Jefe(String nombre, String apellido, String cargo)
    {
        super(nombre, apellido, cargo);
    }
    
    //métodos
    @Override
    public String mostrarDatosPersona() //muestra los datos del jefe de la empresa
    {
        return "Nombre:     " + getNombre() +
             "\nApellido:   " + getApellido() + 
             "\nCargo:      " + getCargo() +
             "\nE-mail:     " + getMail();
    }
}
