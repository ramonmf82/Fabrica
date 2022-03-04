

/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public abstract class Cliente extends Persona       //crea Objetos del tipo Cliente
{
    //campos
    
    protected String direccion;
    protected int telefono;
    
    //constructor
    public Cliente(String nombre, String direccion, int telefono)
    {
        super(nombre);
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    //métodos
    public int getTelefono() //método getter
    {
        return telefono;
    }
    
    public String getDireccion() //método getter
    {
        return direccion;
    }
    
    @Override
    public abstract String mostrarDatosPersona();
}
