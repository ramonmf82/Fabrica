import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Proyecto de la asignatura de Programación Orientada a Objetos    
 * Curso 1º Ingeniería en Tecnologías de la Información             
 * UNED                                                             
 *                                                                  
 * @author Ramón Martínez Fernández                                 
 * @version                                                         
 */                                                               
public class Fabrica //clase principal del programa
{
    //campos
    
    private static ArrayList<Empleado> comercialArray = new ArrayList();  //guarda Listado de Comerciales
    private static ArrayList<Empleado> plantillaArray = new ArrayList();  //guarda Listado de Artesanos en plantilla
    private static ArrayList<Empleado> porHorasArray = new ArrayList();   //guarda Listado de Artesanos por Horas        
    private static Jefe jefe;                                             //guarda Jefe
    
    private static ArrayList<Pedidos> pedidosActivos = new ArrayList();   //Listado de Pedidos en Activo

    private static Pedidos pedido;                                        //estos campos 
    private static Comercial comercial;                                   //serán provisionales,
    private static EnPlantilla plantilla;                                 //Se introducirán en 
    private static PorHoras porHoras;                                     //los Array               
    
    //constructor
    public Fabrica() //no inicializamos ningún campo
    {

    }
    
    //métodos
    public static void main(String[] args){    /*  ### MÉTODO MAIN ###  */
        int respuesta1;     //estas variables se usarán para los
        char respuesta2;    //switch y para los bucles do-while
            
        String nombre;      //estas variables se usarán
        String apellido;    //para inicializar el Jefe
        
        nombre = JOptionPane.showInputDialog("Introduzca el nombre del Jefe: ");   //creamos Jefe por defecto
        apellido = JOptionPane.showInputDialog("Introduzca el apellido: ");        //la primera vez que
        jefe = new Jefe(nombre, apellido, "Jefe");                                 //implementamos el programa
        
        do{
        
            respuesta1 = Integer.parseInt(JOptionPane.showInputDialog("MENÚ PRINCIPAL" +   //menú principal del
                                  "\nIndique qué empleado es usted: "+                     //programa. Decidimos
                                  "\n1.- Jefe" +                                           //qué Empleado
                                  "\n2.- Comercial" +                                      //va a realizar sus 
                                  "\n3.- Artesano"));                                      //acciones correspondientes
        
            switch(respuesta1)
            {
                case 1: accionesJefe();
                        
                        break; 
                
                case 2: if(comercialArray.size() != 0)
                        {
                            accionesComercial();
                        }
                        else
                        {
                            System.out.println("\nNo hay Comerciales actualmente en la Empresa.\n"); 
                        }
                        
                        break;
                        
                case 3: if(plantillaArray.size() != 0 || porHorasArray.size() != 0)
                        {
                            accionesArtesano();
                        }
                        else
                        {
                            System.out.println("\nNo hay Artesanos de ningún tipo actualmente en la Empresa.\n"); 
                        }
                        
                        break;
                
                default: defaultCase();
            }
            
            respuesta2 = JOptionPane.showInputDialog("¿Desea el Usuario realizar otra acción? (s/n)").charAt(0);
            
        }while(respuesta2 == 's');
    }
    
    public static void verListadoComerciales() //muestra el Listado de Comerciales
    {
        System.out.println("\nListado de Comerciales: \n");
        for(int i = 0; i < comercialArray.size(); i++)
        {
            System.out.println("\nComercial " + i + ":\n" + comercialArray.get(i).mostrarDatosPersona());
            System.out.println("\n#######################################################");    
        }
    }    
    
    public static void verListadoEnPlantilla() //muestra el Listado de Artesanos en Plantilla
    {
        System.out.println("\nListado de Artesanos en Plantilla: \n");
        for(int i = 0; i < plantillaArray.size(); i++)
        {   
            System.out.println("\nArtesano en Plantilla " + i + ":\n" + plantillaArray.get(i).mostrarDatosPersona());
            System.out.println("\n#######################################################");    
        }
    }
    
    public static void verListadoPorHoras() //muestra el Listado de Artesanos por Horas
    {
        System.out.println("\nListado de Artesanos por Horas: \n");
        for(int i = 0; i < porHorasArray.size(); i++)
        {
            System.out.println("\nArtesano por Horas " + i + ":\n" + porHorasArray.get(i).mostrarDatosPersona());
            System.out.println("\n#######################################################");    
        }
    }
    
    public static void verListadoPedidosActivos() //muestra el Listado de Pedidos activos: en Espera o Trabajando
    {
        if(pedidosActivos.size() != 0)
            {
                System.out.println("\nListado de Clientes y sus Pedidos: ");
                for(int i = 0; i < pedidosActivos.size(); i++)
                { 
                    System.out.println("\nPedido " + i + ":\n");
                    pedidosActivos.get(i).mostrarPedido();
                }
            }
        else
        {
            System.out.println("\nNo hay Pedidos Activos actualmente.\n");
        }
    }

    public static void defaultCase() //método que se llama en todos los default de los switch
    {
        System.out.println("\nOpción incorrecta. \nVuelva a elegir");  
    }
    
    public static void accionesJefe() //contratar y despedir Empleados - Ver Listado de Empleados    
    {                                
        int respuesta1;     //estas variables se usarán
        int respuesta2;     //para los switch y para
        char respuesta3;    //los bucles do-while
        
        String nombre;      //estas variables se usarán
        String apellido;    //para rellenar los constructores

        do{
        respuesta1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la acción que desea realizar:" +
                                "\n1.- Contratar Empleado" +                        //aparecen 
                                "\n2.- Despedir Empleado" +                         //todas las
                                "\n3.- Ver Listado de Comerciales" +                //acciones que           submenú 
                                "\n4.- Ver Listado de Artesanos en Plantilla" +     //puede 
                                "\n5.- Ver Listado de Artesanos por Hora" +         //realizar
                                "\n6.- Ver datos del Jefe"));                       //el Jefe
            switch(respuesta1) 
            {
                case 1: respuesta2= Integer.parseInt(JOptionPane.showInputDialog("Indique qué tipo de Empleado desea contratar:" +
                                "\n1.- Comercial" +                     //se decide
                                "\n2.- Artesano en Plantilla" +         //qué Empleado se      submenú
                                "\n3.- Artesano por Horas"));           //va a contratar
                        switch(respuesta2)
                        {
                            case 1: nombre = JOptionPane.showInputDialog("Introduzca el nombre del Comercial: ");
                                    apellido = JOptionPane.showInputDialog("Introduzca el apellido");
                                    comercial = new Comercial(nombre, apellido, "Comercial");                                
                                    comercialArray.add(comercial); //creamos Comercial y lo introducimos en su ArrayList
                                    
                                    break; //break de case 1 de respuesta2
                                    
                            case 2: nombre = JOptionPane.showInputDialog("Introduzca el nombre del Artesano: ");
                                    apellido = JOptionPane.showInputDialog("Introduzca el apellido");
                                    plantilla = new EnPlantilla(nombre, apellido, "Artesano en Plantilla");
                                    plantillaArray.add(plantilla); //creamos Artesano en Plantilla y lo introducimos en su ArrayList
                                    
                                    break; //break de case 2 de respuesta2

                            case 3: nombre = JOptionPane.showInputDialog("Introduzca el nombre del Artesano: ");
                                    apellido = JOptionPane.showInputDialog("Introduzca el apellido");
                                    porHoras = new PorHoras(nombre, apellido, "Artesano por Horas");
                                    porHorasArray.add(porHoras); //creamos Artesano por Horas y lo introducimos en su ArrayList
                                    
                                    break; //break de case 4 de respuesta2
                                    
                            default: defaultCase();
                        }         
                        
                        break; //break de case 1 de respuesta1
                
                case 2: respuesta2= Integer.parseInt(JOptionPane.showInputDialog("Indique qué tipo de Empleado desea despedir:" +
                                "\n1.- Comercial" +                     //se decide 
                                "\n2.- Artesano en Plantilla" +         //qué Empleado se       submenú
                                "\n3.- Artesano por Horas"));           //va a despedir
                        switch(respuesta2)
                        {
                            case 1: if(comercialArray.size() == 0)
                                    {
                                        System.out.println("\nNo hay Comerciales actualmente en la Empresa.\n"); 
                                    }
                                    else
                                    {
                                        verListadoComerciales(); 
                                        respuesta2= Integer.parseInt(JOptionPane.showInputDialog("Mire el Listado de " +
                                                    "Comerciales de la empresa e indique el número del Comercial" +
                                                    "que quiera despedir."));
                                        do
                                        {      
                                            comercialArray.remove(respuesta2); //despedimos al Comercial elegido
                                        }
                                        while(respuesta2 < 0 || respuesta2 > comercialArray.size());
                                    }
                                    
                                    break; //break de case 1 de respuesta2
                            
                            case 2: if(plantillaArray.size() == 0)
                                    {
                                        System.out.println("\nNo hay Artesanos en Plantilla actualmente en la empresa.\n"); 
                                    }
                                    else
                                    {
                                        verListadoEnPlantilla(); 
                                        respuesta2= Integer.parseInt(JOptionPane.showInputDialog("Mire el Listado de " +
                                                    "Artesanos en Plantilla de la empresa e indique el número del Comercial" +
                                                    "que quiera despedir."));
                                        do
                                        {
                                            plantillaArray.remove(respuesta2); //despedimos al Artesano en Plantilla elegido
                                        }
                                        while(respuesta2 < 0 || respuesta2 > comercialArray.size());
                                    }
                                    
                                    break; //break de case 2 de respuesta2
                            
                            case 3: if(porHorasArray.size() == 0)
                                    {
                                        System.out.println("\nNo hay Artesanos por Horas actualmente en la empresa.\n"); 
                                    }
                                    else
                                    {
                                        verListadoPorHoras(); 
                                        respuesta2= Integer.parseInt(JOptionPane.showInputDialog("Mire el Listado de " +
                                                    "Artesanos por Horas de la empresa e indique el número del Comercial" +
                                                    "que quiera despedir."));
                                        do
                                        {
                                            porHorasArray.remove(respuesta2); //despedimos al Artesano por Horas elegido 
                                        }
                                        while(respuesta2 < 0 || respuesta2 > comercialArray.size());
                                    }
                                    
                                    break; //break de case 3 de respuesta2
                            
                            default: defaultCase();
                        }
                        break; //break de case 2 de respuesta1
                
                        /* Nota: en case 2 he puesto los if-else al revés, es decir, primero se lanza el mensaje
                         * de Lista vacía si el Array está vacío, y se muestra el Listado en el else.
                         * Por ninguna razón en especial, simplemente por probar de las dos formas.
                         * En todos los demás case del programa los he puesto como sigue:
                         * primero se muestra el Listado y despues se lanza el mensaje de Lista vacía en el else */
                        
                case 3: if(comercialArray.size() != 0)
                        {
                            verListadoComerciales(); //se muestra el Listado de Comerciales
                        }
                        else
                        {
                            System.out.println("\nNo hay Comerciales actualmente en la Empresa.\n");
                        }
                        
                        break; //break de case 3 de respuesta1
                    
                case 4: if(plantillaArray.size() != 0)
                        {
                            verListadoEnPlantilla(); //se muestra el Listado de Artesanos en Plantilla
                        }
                        else
                        {
                            System.out.println("\nNo hay Artesanos en Plantilla actualmente en la Empresa.\n");
                        }
                        
                        break; //break de case 4 de respuesta1
                        
                case 5: if(porHorasArray.size() != 0)
                        {
                            verListadoPorHoras(); //se muestra el Listado de Artesanos por Horas
                        }
                        else
                        {
                            System.out.println("\nNo hay Artesanos por Horas actualmente en la Empresa.\n");
                        }
                        
                        break; //break de case 5 de respuesta1
                        
                case 6: System.out.println("\nDatos del Jefe de la Empresa:\n");
                        System.out.println(jefe.mostrarDatosPersona()); //se muestran los datos del Jefe
                
                        break; //break de case 6 de respuesta1
                        
                default: defaultCase();
            }
            
            respuesta3 = JOptionPane.showInputDialog("¿Desea el Jefe realizar otra acción? (s/n)").charAt(0);
        
        }while(respuesta3 == 's');
    }
    
    public static void accionesComercial() //añadir Clientes y sus Pedidos - visualizar Pedidos
    {                                     
        int respuesta1;     //estas variables se usarán 
        int respuesta2;     //para los switch y para 
        char respuesta3;    //los bucles do-while
        
        String nombre;      //estas variables 
        String apellido;    //se usarán
        String direccion;   //para rellenar
        int telefono;       //los constructores
        
        do{
        respuesta1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la acción que desea realizar:" +
                                "\n1.- Añadir Cliente y Pedido" +           //se decide qué acciones va
                                "\n2.- Ver Listado de Pedidos Activos"));    //a realizar el Comercial    submenú 
            switch(respuesta1)
            {
                case 1: respuesta2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de Ciente: " + 
                                "\n1.- Particular" +            //se decide qué tipo de Cliente         submenú
                                "\n2.- Empresa"));              //se va a dar da alta
                        switch(respuesta2)
                        {
                            case 1: nombre = JOptionPane.showInputDialog("Introduzca el nombre del Cliente: ");
                                    apellido = JOptionPane.showInputDialog("Introduzca el apellido:");
                                    direccion = JOptionPane.showInputDialog("Introduzca la dirección:");
                                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el teléfono:"));
                                    pedido = new Pedidos(nombre, apellido, direccion, telefono);
                                    pedido.realizarPedido();    //creamos Pedido si el Cliente es un Particular
                                    pedidosActivos.add(pedido); //introducimos el Pedido en el Array correspondiente
                                    
                                    break; //break de case 1 de respuesta2
                        
                            case 2: nombre = JOptionPane.showInputDialog("Introduzca el nombre de la Empresa: ");
                                    direccion = JOptionPane.showInputDialog("Introduzca la dirección:");
                                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el teléfono:"));
                                    pedido = new Pedidos(nombre, direccion, telefono);
                                    pedido.realizarPedido();    //creamos Pedido si el Cliente es una Empresa
                                    pedidosActivos.add(pedido); //introducimos el Pedido en el Array correspondiente
                                    
                                    break; //break de case 2 de respuesta2
                                    
                            default: defaultCase();
                        }
                        
                        break; //break de case 1 de respuesta1
                
                case 2: verListadoPedidosActivos();
                        
                        break; //break de case 2 de respuesta1          

                default: defaultCase();
            }
            
            respuesta3 = JOptionPane.showInputDialog("¿Desea el Comercial realizar otra acción? (s/n)").charAt(0);
        
        }while(respuesta3 =='s');                     
    }
    
    public static void accionesArtesano() //visualizar y modificar Estado y Observaciones en los Pedidos
    {
        int respuesta1;     //estas variables se usarán 
        int respuesta2;     //para los switch y para 
        char respuesta3;    //los bucles do-while
        
        int nuevoEstado;           //estas variables servirán para cambiar
        String nuevaObservacion;   //Estados y Oservaciones en los Pedidos 
        
        do{
        respuesta1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la acción que desea realizar: " +
                                "\n1.- Visualizar el Listado de Pedidos Activos" +    //se decide qué acciones
                                "\n2.- Modificar el Estado de un Pedido" +            //va a realizar       submenú
                                "\n3.- Realizar Observaciones en un Pedido "));       //el Artesano
            switch(respuesta1)
            {
                case 1: verListadoPedidosActivos();
                        
                        break;
 
                case 2: if(pedidosActivos.size() != 0)
                        {
                            verListadoPedidosActivos();
                            respuesta2= Integer.parseInt(JOptionPane.showInputDialog("Mire el Listado de Pedidos Activos " +
                                                     "e indique el número del que quiera cambiar su estado."));
                            nuevoEstado = Integer.parseInt(JOptionPane.showInputDialog("Indique el nuevo Estado: " +
                                                     "\n1.- En Espera" +            //se decide 
                                                     "\n2.- Fabricando" +           //el nuevo        submenú
                                                     "\n3.- Detenido" +             //estado
                                                     "\n4.- Terminado"));           //del Pedido
                               
                            if(nuevoEstado == 1)
                            {
                                pedidosActivos.get(respuesta2).cambiarEstado("En espera");
                            }
                            else if(nuevoEstado == 2)
                            {
                                pedidosActivos.get(respuesta2).cambiarEstado("Fabricando");
                            }
                            else if(nuevoEstado == 3)
                            {
                                pedidosActivos.get(respuesta2).cambiarEstado("Detenido");
                            } 
                            else if(respuesta2 == 4)
                            {
                                pedidosActivos.get(respuesta2).cambiarEstado("Terminado");
                            }
                        }
                        else
                        {
                            System.out.println("\nNo hay Pedidos actualmente.\n");
                        }
                        
                        break;
            
                case 3: if(pedidosActivos.size() != 0)
                        {
                            verListadoPedidosActivos();
                            respuesta2= Integer.parseInt(JOptionPane.showInputDialog("Mire el Listado de Pedidos de Particulares " +
                                                     "e indique el número del que quiera realizar Observaciones."));
                            nuevaObservacion = JOptionPane.showInputDialog("Escriba la Observación que considere oportuna:");                                 
                        
                            pedidosActivos.get(respuesta2).realizarObservaciones(nuevaObservacion);
                        }
                        else
                        {
                            System.out.println("\nNo hay Pedidos actualmente.\n");
                        }
                        break;

            
                default: defaultCase();
            }
            
            respuesta3 = JOptionPane.showInputDialog("¿Desea el Artesano realizar otra acción? (s/n)").charAt(0);
        
        }while(respuesta3 =='s');    
    }
}
