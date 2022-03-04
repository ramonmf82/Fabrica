
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class PorHoras extends Artesano  //crea Objetos del tipo Artesano por Horas
{
    //hereda todos sus campos
    
    //constructor
    public PorHoras(String nombre, String apellido, String cargo)
    {
        super(nombre, apellido, cargo);
    }
    
    //métodos
    @Override
    public String mostrarDatosPersona() //muestra los datos de un artesano contratado por horas 
    {
        return "Nombre:      " + getNombre() +
             "\nApellido:    " + getApellido() + 
             "\nCargo:       " + getCargo() +
             "\nE-mail:      " + getMail();
    }
}
