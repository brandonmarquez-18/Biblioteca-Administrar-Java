package proyecto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
public class OperacionesProyecto {
    
    
    //DECLARACIONES
    ArrayList<Integer> BuscarLibro = new ArrayList<Integer>();
    ArrayList<Integer> BuscarCliente = new ArrayList<Integer>();
    int AddClient = 1;
    
    
    //COLA LIBROS
    LinkedList<String> Libros = new LinkedList<String>();
    //LISTA CLIENTES
    List<String>Clientes = new ArrayList<>();
    //MATRIZ RELACION
    String Relacion [][] = new String [5][5];
    
    
    //DIMENCIONES INICIALIZADAS DE MATRIZ RALACIÃ“N
    int FilaCliente = 0;
    int ColumnaCliente = 0;
    
  
    int FilaLibro = 1;
    int ColumnaLibro = 0;
    
    
    
    
    //ISAAC
    public void GenerarColalibros(){
        //INVENTARIO DE LIBROS YA CREADO
        //.offer SE USA PARA LAS COLAS EN ESPECIFICO
        Libros.offer("1.- Cenicienta");
        Libros.offer("2.- TSURU TUNEADO");
        Libros.offer("3.- SpiderCholo");
        Libros.offer("4.- LOS WHITEXICAN");
        Libros.offer("5.- BobCholo");
        Libros.offer("6.- YodaCholo");
        
        
        //LISTA PARA BUSQUEDA BINARIA DE LIBROS
        BuscarLibro.add(1);
        BuscarLibro.add(2);
        BuscarLibro.add(3);
        BuscarLibro.add(4);
        BuscarLibro.add(5);
        BuscarLibro.add(6);
    }
     
    //BRANDON
    public void PedirLibro(){
        String ClienteAIngresar = JOptionPane.showInputDialog("Â¿CUÃ�L ES TU NOMBRE?:");
        Clientes.add(ClienteAIngresar);
        BuscarCliente.add(AddClient);
        AddClient++;

        Relacion[FilaCliente][ColumnaCliente] = ClienteAIngresar;
        ColumnaCliente++;

        MostrarColaLibros();
        int CantidadLibrosAComprar = Integer.parseInt(JOptionPane.showInputDialog("Â¿CUÃ�NTOS LIBROS QUIERES TE PRESTEN?"));
        for(int i=0;i<CantidadLibrosAComprar;i++){
            String LibroAIngresar = JOptionPane.showInputDialog(ClienteAIngresar+" INDICA EL LIBRO #"+(i+1)+" A PRESTAR:");
            Relacion[FilaLibro][ColumnaLibro] = LibroAIngresar;
            FilaLibro++;
        }
        FilaLibro = 1;
        ColumnaLibro++;
    }
    //ISAAC
    public void MostrarRelacion(){
        String mostrarRelacion = "";
        for(int i=0;i<Relacion.length;i++){
            for(int j=0;j<Relacion.length;j++){
                mostrarRelacion += Relacion[i][j];
                mostrarRelacion += "     ";
            }
            mostrarRelacion += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrarRelacion);
    }
    //BRANDON
    public void MostrarColaLibros(){
        String MostrarColaLibros = "";
        for(int i=0;i<Libros.size();i++){
            MostrarColaLibros += Libros.get(i);
            MostrarColaLibros += "     ";
            MostrarColaLibros += "\n";
        }
        JOptionPane.showMessageDialog(null, MostrarColaLibros);
    }
    //ISAAC
    public void MostrarListaClientes(){
        String MostrarListaClientes = "";
        for(int i=0;i<Clientes.size();i++){
            MostrarListaClientes += (i+1) + ".- " + Clientes.get(i);
            MostrarListaClientes += "     ";
            MostrarListaClientes += "\n";
        }
        JOptionPane.showMessageDialog(null, MostrarListaClientes);
    }
    //BRANDON
    public void BuscarLibrosBinariamente(){
        MostrarColaLibros();
        int LibroABuscar = Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL NÃšMERO DE LIBRO A BUSCAR"));
        for(int i=0;i<BuscarLibro.size();i++){
            if(LibroABuscar == BuscarLibro.get(i)){
                JOptionPane.showMessageDialog(null,BusquedaBinaria(BuscarLibro,LibroABuscar)+" FUE LA CASILLA PARA ENCONTRAR EL LIBRO " + Libros.get(i));
            }
        }
        if(LibroABuscar > BuscarLibro.size() || LibroABuscar <= 0){
            JOptionPane.showMessageDialog(null, "EL LIBRO #"+(LibroABuscar)+" NO EXISTE EN LA COLA");
        }
    }
    //ISAAC
    public void BuscarClientesBinariamente(){
        MostrarListaClientes();
        int ClienteABuscar = Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL NÃšMERO DE CLIENTE A BUSCAR"));
        for(int i=0;i<BuscarCliente.size();i++){
            if(ClienteABuscar == BuscarCliente.get(i)){
                JOptionPane.showMessageDialog(null,BusquedaBinaria(BuscarCliente,ClienteABuscar)+" FUE LA CASILLA PARA ENCONTRAR EL CLIENTE " + Clientes.get(i));
            }
        }
        if(ClienteABuscar > BuscarCliente.size() || ClienteABuscar <= 0){
            JOptionPane.showMessageDialog(null, "EL CLIENTE #"+(ClienteABuscar)+" NO EXISTE EN LA LISTA");
        }
    }
    
    //ISAAC
    public static int BusquedaBinaria(ArrayList<Integer> BuscarLOC,int dato){
        Collections.sort(BuscarLOC);
        int n=BuscarLOC.size();
        int mitad;
        int inferior=0;
        int superior=n-1;
        while(inferior<=superior){
            mitad=(superior+inferior)/2;
            if (BuscarLOC.get(mitad)==dato){
                return mitad+1;
            }else if(dato<BuscarLOC.get(mitad)){
                superior=mitad-1;
            }else{
                inferior=mitad+1;
            }
        }
        return -1;
    }
}