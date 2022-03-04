
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class EnPlantilla extends Artesano   //crea Objetos del tipo artesano en Plantilla
{
    //hereda todos sus campos
    
    //constructor
    public EnPlantilla(String nombre, String apellido, String cargo)
    {
        super(nombre, apellido, cargo);
    }
    
    //métodos
    @Override
    public String mostrarDatosPersona() //muestra los datos de un artesano en plantilla
    {
        return "Nombre:     " + getNombre() +
             "\nApellido:   " + getApellido() + 
             "\nCargo:      " + getCargo() +
             "\nE-mail:     " + getMail();
    }
}
