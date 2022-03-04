
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Plegable extends Silla //crea Objetos del tipo Silla plegable
{
    //hereda todos sus campos
    
    //constructor
    public Plegable(int numeroMuebles)
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
    public String mostrarNumeroMuebles() //muestra el número de sillas plegables
    {
        return "Número de sillas plegables:             " + getNumeroMuebles();
    }
}
