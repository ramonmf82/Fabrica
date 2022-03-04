
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Empresa extends Cliente    //crea Objetos del tipo Cliente Empresa
{
    //hereda todos sus campos
    
    //constructor
    public Empresa(String nombre, String direccion, int telefono)
    {
        super(nombre, direccion, telefono);
    }
    
    //métodos
    @Override
    public String mostrarDatosPersona() //muestra los datos de una empresa cliente
    {
        return "Nombre:     " + getNombre() +
             "\nDirección:  " + getDireccion() + 
             "\nTeléfono:   " + getTelefono();
    }
}
