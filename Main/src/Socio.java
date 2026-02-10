public class Socio extends Usuario{
    private int limiteEjemplares;
    private int ejemplaresPrestados;
    private double multasPendientes;

    public Socio(String id, String nombre, String email, int limiteEjemplares) {
        super(id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;
        this.ejemplaresPrestados = 0;
        this.multasPendientes = 0.0;
    }

    public void registrarPrestamo (int cantidad){
        if(cantidad > limiteEjemplares - ejemplaresPrestados){

            throw new IllegalArgumentException("supera el limite del socio");
        }
        if(multasPendientes > 0 ){
            throw new IllegalArgumentException("No se puede pedir si tiene una multa");
        }
        System.out.println("Se prestaron" + cantidad + "libros");
        }
}}
