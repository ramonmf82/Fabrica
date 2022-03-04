
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public abstract class Empleado extends Persona      //crea Objetos del tipo Empleado
{
    //campos
    
    protected String apellido;
    protected String cargo;
    
    //constructor
    public Empleado(String nombre, String apellido, String cargo)
    {
        super(nombre);
        this.apellido = apellido;
        this.cargo = cargo;
    }
    
    //métodos
    public String getCargo() //método getter
    {
        return cargo;
    }
    
    public String getApellido() //método getter
    {
        return apellido;
    }
    
    public String getMail() //crea una dirección de correo para cada empleado de la forma: nombreapellido@fabrica.com
    {
        return nombre + apellido + "@fabrica.com";
    }
    
    @Override
    public abstract String mostrarDatosPersona();
}
