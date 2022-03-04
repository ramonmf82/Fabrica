
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public abstract class Artesano extends Empleado //crea Objetos del tipo Artesano
{
    //hereda todos sus campos
    
    //constructor
    public Artesano(String nombre, String apellido, String cargo)
    {
        super(nombre, apellido, cargo);
    }
    
    //métodos
    @Override
    public abstract String mostrarDatosPersona();
}
