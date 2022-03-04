
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Cocina extends Silla   //crea Objetos del tipo Silla de Cocina
{
    //hereda todos sus campos
    
    //constructor
    public Cocina(int numeroMuebles)
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
    public String mostrarNumeroMuebles() //muestra el número de sillas de cocina
    {
        return "Número de sillas de cocina:             " + getNumeroMuebles();
    }
}
