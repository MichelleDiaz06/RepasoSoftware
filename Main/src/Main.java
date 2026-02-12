public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Bibliotecario bibliotecario1 = new Bibliotecario("123", "Juan", "juan@biblioteca.com", "Mañana");
        System.out.println(bibliotecario1.darEmail());

        Socio socio1 = new Socio("456", "Maria", "maria@biblioteca.com", 5);
        socio1.registrarPrestamo(2);

        biblioteca.agregarSocio(socio1);

        System.out.println(biblioteca.darSocios().get(0).darNombre());

    }
}

