public class Cultural extends PaqueteTuristico{
    private int numero;
    private int cantidadVisitas;
    private final float VISITAS=10;
    public Cultural() {

    }

    public Cultural(String destino, int stock, int duracion, int cantidad) {
        super(destino, stock, duracion);
        this.cantidadVisitas= cantidad;
    }

    @Override
    public double precioTotal() {

        return super.getPrecioUnitario() +(this.cantidadVisitas*VISITAS);
    }


    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidad) {
        this.cantidadVisitas = cantidad;
    }

    @Override
    public String toString() {
        return "\n      Paquete Turístico {" +
                super.toString()+
                "; Tipo Cultural, cantidad visitas=" + cantidadVisitas +
                ", precio total= "+precioTotal()+
                '}';
    }
}
