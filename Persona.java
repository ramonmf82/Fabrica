
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public abstract class Persona        //crea Objetos del tipo Persona
{
    //campos
    
    protected String nombre;
    
    //constructor
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }
    
    //métodos
    public String getNombre() //método getter
    {
        return nombre;
    }
    
    public abstract String mostrarDatosPersona();
}
