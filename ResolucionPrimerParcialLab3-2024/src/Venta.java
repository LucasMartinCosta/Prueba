import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private String fecha;
    private Cliente cliente;
    private ArrayList<PaqueteTuristico> paquetesCliente;

    public Venta(String fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        paquetesCliente=new ArrayList<>();
    }

    public void agregarPaqueteCliente(int cantidad,PaqueteTuristico paqueteTuristico){
        if (paqueteTuristico.setCantidad(cantidad)){
            paquetesCliente.add(paqueteTuristico);
            System.out.println("La cantidad indicada del Paquete Turístico ha sido agregada con exito");
        }else {
            System.out.println("La cantidad indicada del Paquete Turístico no se puede agregar");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<PaqueteTuristico> getPaquetesCliente() {
        return paquetesCliente;
    }

    @Override
    public String toString() {
        return "\n      Venta{" +
                "fecha='" + fecha + '\'' +
                ", cliente=" + cliente.toString() +
                ", paquetesCliente=" + paquetesCliente.toString() +
                '}';
    }
}
