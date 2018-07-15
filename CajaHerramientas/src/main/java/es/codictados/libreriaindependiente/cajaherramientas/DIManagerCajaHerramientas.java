package es.codictados.libreriaindependiente.cajaherramientas;

public class DIManagerCajaHerramientas {

    private DIManagerCajaHerramientas() {}

    private static ComponenteCajaHerramientas sComponente;

    public static void init() {
        sComponente = DaggerComponenteCajaHerramientas.builder().build();
    }

    public static ComponenteCajaHerramientas getComponente() {
        return sComponente;
    }
}
