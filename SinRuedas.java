
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class SinRuedas extends Oficina  //crea Objetos del tipo Silla de Oficina sin Ruedas
{
    //hereda todos sus campos
    
    //constructor
    public SinRuedas(int numeroMuebles)
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
    public String mostrarNumeroMuebles() //muestra el número de sillas de oficina sin ruedas
    {
        return "Número de sillas de oficina sin ruedas: " + getNumeroMuebles();
    }
}
