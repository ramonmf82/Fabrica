import javax.swing.JOptionPane;
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos
 * Curso 1º Ingeniería en Tecnologías de la Información 
 * UNED
 * 
 * @author Ramón Martínez Fernández
 * @version 
 */
public class Pedidos        //crea Objetos del tipo Pedidos
{
    //campos
    
    private Cliente cliente;        //Se creará el cliente
    private String estado;          //el campo estado se usará para indicar si el pedido está en espera, en proceso o detenido
    private String observaciones;   //se usará para añadir comentarios al estado del pedido
    private Mueble[] mueble;
    
    //constructores
    public Pedidos(String nombre, String apellido, String direccion, int telefono)
    { //este constructor será llamado cuando el cliente sea un particular
        cliente = new Particular(nombre, apellido, direccion, telefono);
        estado = "En espera"; //por defecto, el pedido se queda en espera
        observaciones = "No hay observaciones"; //por defecto, el pedido no tiene observaciones
        mueble = new Mueble[8]; //si se añaden o se quitan muebles al catálogo basta con cambiar este número
    }
    
    public Pedidos(String nombre, String direccion, int telefono)
    { //este constructor será llamado cuando el cliente sea una empresa
        cliente = new Empresa(nombre, direccion, telefono);
        estado = "En espera"; //por defecto, el pedido se queda en espera
        observaciones = "No hay observaciones"; //por defecto, el pedido no tiene observaciones
        mueble = new Mueble[8];
    }
    
    //métodos
    public String getObservaciones() //método getter
    {
        return observaciones;
    }
    
    public String getEstado() //método getter
    {
        return estado;
    }
    
    public void cambiarEstado(String nuevoEstado) //actualiza el estado del pedido
    {
        estado = nuevoEstado;
    }
    
    public void realizarObservaciones(String nuevaObservacion) //añade nuevas observaciones del pedido
    {
        observaciones = nuevaObservacion;
    }
    
    public void realizarPedido() // pregunta qué tipo de muebles quiere comprar el cliente y cuántos de cada tipo 
    {
        int numeroCatalogo;
        char respuesta;
        mueble[0] = new Comedor(0);      //en cada 
        mueble[1] = new Dormitorio(0);   //casilla de
        mueble[2] = new Madera(0);       //la matriz 
        mueble[3] = new Cristal(0);      //mueble[]
        mueble[4] = new Cocina(0);       //guardamos
        mueble[5] = new Plegable(0);     //un mueble 
        mueble[6] = new ConRuedas(0);    //de cada 
        mueble[7] = new SinRuedas(0);    //tipo
        do{
            numeroCatalogo = Integer.parseInt(JOptionPane.showInputDialog("Este es el catálogo de muebles. " +
                             "Indique cual desea comprar" + 
                             "\n   Mesas:" +                                    //menú 
                             "\n1.-Mesas de Comedor" +                          //principal 
                             "\n2.-Mesas de Dormitorio" +                       //del método.
                             "\n3.-Mesas de Café de Madera" +                   //se 
                             "\n4.-Mesas de Café de Cristal" +                  //decide
                             "\n   Sillas:" +                                   //cuántos
                             "\n5.-Sillas de Cocina" +                          //Muebles
                             "\n6.-Sillas Plegables" +                          //comprar
                             "\n7.-Sillas de Oficina con Ruedas" +              //de cada
                             "\n8.-Sillas de Oficina sin Ruedas"));             //tipo
            switch(numeroCatalogo)
            {      
                case 1: 
                mueble[0] = new Comedor(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Mesas de Comedor desea comprar?")));
                        break;
                    
                case 2: 
                mueble[1] = new Dormitorio(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Mesas de Dormitorio desea comprar?")));
                        break;
                    
                case 3: 
                mueble[2] = new Madera(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Mesas de Café de Madera desea comprar?")));
                        break;
                    
                case 4: 
                mueble[3] = new Cristal(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Mesas de Café de Cristal desea comprar?")));
                        break;
                    
                case 5: 
                mueble[4] = new Cocina(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Sillas de Cocina desea comprar?")));
                        break;
                    
                case 6: 
                mueble[5] = new Plegable(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Sillas Plegables desea comprar?")));
                        break;
                    
                case 7:
                mueble[6] = new ConRuedas(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Sillas de Oficina con Ruedas desea comprar?")));
                        break;
                    
                case 8: 
                mueble[7] = new SinRuedas(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Sillas de Oficina sin Ruedas desea comprar?")));
                        break;
            }
            
            respuesta = JOptionPane.showInputDialog("¿Desea realizar otra compra?(s/n)").charAt(0);
        
        }while(respuesta == 's');
    }
    
    public void mostrarPedido()           //devuelve los datos del pedido
    {                                     //no se mostrarán los muebles que no se hayan encargado
        System.out.println(" ");
        System.out.println("\nDatos del Cliente: \n\n" + 
                           cliente.mostrarDatosPersona() + 
                           "\n\nMuebles encargados: \n");
        if (mueble[0].getNumeroMuebles() != 0) { System.out.println(mueble[0].mostrarNumeroMuebles()); }
        if (mueble[1].getNumeroMuebles() != 0) { System.out.println(mueble[1].mostrarNumeroMuebles()); }  
        if (mueble[2].getNumeroMuebles() != 0) { System.out.println(mueble[2].mostrarNumeroMuebles()); }
        if (mueble[3].getNumeroMuebles() != 0) { System.out.println(mueble[3].mostrarNumeroMuebles()); }
        if (mueble[4].getNumeroMuebles() != 0) { System.out.println(mueble[4].mostrarNumeroMuebles()); }
        if (mueble[5].getNumeroMuebles() != 0) { System.out.println(mueble[5].mostrarNumeroMuebles()); }
        if (mueble[6].getNumeroMuebles() != 0) { System.out.println(mueble[6].mostrarNumeroMuebles()); }
        if (mueble[7].getNumeroMuebles() != 0) { System.out.println(mueble[7].mostrarNumeroMuebles()); } 
        System.out.println("\nEstado del pedido: " + estado + 
                           "\nObservaciones:     " + observaciones);
        System.out.println("\n#######################################################");                   
    }
}
