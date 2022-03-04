
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Comedor extends Mesa   //crea Objetos del tipo Mesa de Comedor
{
    //hereda todos sus campos
    
    //constructor
    public Comedor(int numeroMuebles)
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
    public String mostrarNumeroMuebles() //muestra el número de mesas de comedor
    {
        return "Número de mesas de comedor:             " + getNumeroMuebles();
    }
}
