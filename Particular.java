
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Particular extends Cliente     //crea Objetos del tipo Cliente Particular
{
    //campos
    
    private String apellido;
    
    //constructor
    public Particular(String nombre, String apellido, String direccion, int telefono)
    {
        super(nombre, direccion, telefono);
        this.apellido = apellido;
    }
    
    //métodos
    public String getApellido() //método getter
    {
        return apellido;
    }
    
    @Override
    public String mostrarDatosPersona() //muestra los datos de un cliente particular
    {
        return "Nombre:     " + getNombre() +
             "\nApellido:   " + apellido + 
             "\nDirección:  " + getDireccion() + 
             "\nTeléfono:   " + getTelefono();
    }
}
