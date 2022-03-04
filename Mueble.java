
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Mueble     //crea Objetos del tipo Mueble
{
    //campos
    
    protected int numeroMuebles;
    
    //constructor
    public Mueble(int numeroMuebles)
    {
        this.numeroMuebles = numeroMuebles;
    }
    
    //métodos
    public int getNumeroMuebles() //método getter
    {
        return numeroMuebles;
    }
    
    public String mostrarNumeroMuebles() //muestra una lista de todos los muebles de un pedido
    {
        return "numeroMuebles";
    }
}
