public class Relax extends PaqueteTuristico implements Seguro{

    private int numero;
    private String spa;
    private final float HIDROMASAJES=20;
    private final float BANIOSDEBARRO=30;

    public Relax() {

    }

    public Relax(String destino, int stock, int duracion, String spa) {
        super(destino, stock, duracion);
        setSpa(spa);
    }

    @Override
    public double precioTotal() {

        double precio=0;
        if (spa.equalsIgnoreCase("hidromasajes")){
          precio = super.getPrecioUnitario()+this.HIDROMASAJES;
        } else if (spa.equalsIgnoreCase("banios de barro")){
            precio=super.getPrecioUnitario() + this.BANIOSDEBARRO;
        }

        return precio*porcentajeSeguro();
    }


    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        if (spa.equalsIgnoreCase("hidromasajes")||spa.equalsIgnoreCase("banios de barro")){
            this.spa = spa;
        } else {
            System.out.println(" El servicio de spa no existe");
        }
    }

    @Override
    public String toString() {
        return "\n      Paquete Turístico {" + super.toString()+
                "; Tipo Relax, spa='" + spa + '\'' +
                 ", precio total= "+precioTotal()+
                '}';
    }

    @Override
    public double porcentajeSeguro() {
        return 1 + (double) SEGURO/100f;
    }
}
