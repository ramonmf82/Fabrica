
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Dormitorio extends Mesa    //crea Objetos del tipo mesa de Dormitorio
{
    //hereda todos sus campos
    
    //constructor
    public Dormitorio(int numeroMuebles)
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
    public String mostrarNumeroMuebles() //muestra el número de mesas de dormitorio
    {
        return "Número de mesas de dormitorio:          " + getNumeroMuebles();
    }
}
