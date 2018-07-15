package es.codictados.libreriaindependiente.taller;

import android.app.Application;

import es.codictados.libreriaindependiente.cajaherramientas.DIManagerCajaHerramientas;

public class Aplicacion extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DIManagerCajaHerramientas.init();
    }
}
