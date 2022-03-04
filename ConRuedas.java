
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class ConRuedas extends Oficina  //crea Objetos del tipo Silla de Oficina con Ruedas
{
    //hereda todos sus campos
    
    //constructor
    public ConRuedas(int numeroMuebles)
    {
        super(numeroMuebles);
    }
    
    //métodos
    @Override
    public int getNumeroMuebles() //método getter
    {
        return numeroMuebles;
    }
    
    @Override
    public String mostrarNumeroMuebles() //muestra el número de sillas de oficina con ruedas
    {
        return "Número de sillas de oficina con ruedas: " + getNumeroMuebles();
    }
}
