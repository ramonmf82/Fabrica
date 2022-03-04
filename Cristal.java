
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Cristal extends Cafe   //crea Objetos del tipo Mesa de Café de Cristal
{
    //herda todos sus campos
    
    //constructor
    public Cristal(int numeroMuebles)
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
    public String mostrarNumeroMuebles() //muestra el número de mesas de café de cristal
    {
        return "Número de mesas de café de cristal:     " + getNumeroMuebles();
    }
}
