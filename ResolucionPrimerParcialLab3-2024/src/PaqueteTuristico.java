public abstract class PaqueteTuristico {
    public static int id=0;
    private int numero;
    private int cantidad;
    private String destino;
    private int stock;
    private int duracion;


    private final float PLAYA=600;
    private final float MONTANIA=500;
    private float precioUnitario;

    private boolean flag=true;

    public PaqueteTuristico(){
        setNumero();
    }
    public PaqueteTuristico(String destino, int stock, int duracion) {
        this.cantidad=0;
        setDestino(destino);
        this.stock = stock;
        this.duracion = duracion;
        this.setPrecioUnitario(destino);
        setNumero();
    }

    public abstract double precioTotal();

    public void setNumero(){
        if (flag==true){
            this.id++;
            this.numero = id;
        }
    }
    public int getNumero() {
        return numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino.equalsIgnoreCase("playa") ||(destino.equalsIgnoreCase("montania"))){
            this.destino = destino;
        } else{
            System.out.println("El destino ingresado no es correcto");
            flag=false;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String destino) {
        if (destino.equalsIgnoreCase("playa")){
        this.precioUnitario = PLAYA;
        } else if (destino.equalsIgnoreCase("montania")){
            this.precioUnitario = MONTANIA;
        }else
            this.precioUnitario = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean setCantidad(int cantidad) {
        flag= false;
        if(this.stock>=cantidad){
            this.cantidad = cantidad;
            stock=stock-cantidad;
            flag=true;
        }else{
            flag=false;
        }
        return flag;
    }

    @Override
    public String toString() {
        return " numero='" + numero +
                ", destino='" + destino + '\'' +
                ", cantidad=" + cantidad +
                ", stock=" + stock +
                ", duración=" + duracion +
                " días , precio Unitario=" + precioUnitario;
    }
}
