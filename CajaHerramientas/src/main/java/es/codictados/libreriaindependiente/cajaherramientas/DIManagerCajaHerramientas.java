package es.codictados.libreriaindependiente.cajaherramientas;

public class DIManagerCajaHerramientas {

    private DIManagerCajaHerramientas() {}

    private static ComponenteCajaHerramientas sComponente;

    public static ComponenteCajaHerramientas getComponente() {

        if (sComponente == null) {
            sComponente = DaggerComponenteCajaHerramientas.builder().build();
        }

        return sComponente;
    }
}
