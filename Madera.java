
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Madera extends Cafe    //crea Objetos del tipo Mesa de Café de Madera
{
    //hereda todos sus campos
    
    //constructor
    public Madera(int numeroMuebles)
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
    public String mostrarNumeroMuebles() //muestra el número de mesas de café de madera
    {
        return "Número de mesas de café de madera:      " + getNumeroMuebles();
    }
}
