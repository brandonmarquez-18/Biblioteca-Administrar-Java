package proyecto;
import javax.swing.JOptionPane;
public class Proyecto {
    public static void main(String[] args) {
        //BRANDON
        OperacionesProyecto Biblioteca = new OperacionesProyecto();
        Biblioteca.GenerarColalibros();
        int RepetirMenu = 0;
        while(RepetirMenu <= 0 || RepetirMenu >7){
             int opc = Integer.parseInt(JOptionPane.showInputDialog("ELIGE UNA OPCIÃ“N DEL MENÃš:\n \n"
            + "1.- PEDIR LIBRO.\n"
            + "2.- MOSTAR RELACIÃ“N CLIENTES-LIBROS.\n"
            + "3.- MOSTRAR COLA LIBROS.\n"
            + "4.- MOSTAR LISTA CLIENTES.\n"
            + "5.- BUSCAR LIBROS BINARIAMENTE.\n"
            + "6.- BUSCAR CLIENTES BINARIAMENTE.\n"
            + "7.- SALIR.\n \n"));
            switch(opc){
                case 1:
                    Biblioteca.PedirLibro();
                    RepetirMenu = 0;
                    break;
                case 2:
                    Biblioteca.MostrarRelacion();
                    RepetirMenu = 0;
                    break;
                case 3:
                    Biblioteca.MostrarColaLibros();
                    RepetirMenu = 0;
                    break;
                case 4:
                    Biblioteca.MostrarListaClientes();
                    RepetirMenu = 0;
                    break;
                case 5:
                    Biblioteca.BuscarLibrosBinariamente();
                    RepetirMenu = 0;
                    break;
                case 6:
                    Biblioteca.BuscarClientesBinariamente();
                    RepetirMenu = 0;
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "De nada vuelva pronto...");
                    RepetirMenu = 1;
                    break;
            }
        }
    }
}
