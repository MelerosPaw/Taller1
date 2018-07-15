package es.codictados.libreriaindependiente.cajaherramientas;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuloCajaHerramientas {

    @Provides
    String provideFormula() {
        return "Grasa hecha a base de componentes de calidad.";
    }

    @Provides
    @Singleton
    Grasa provideGrasa() {
        return new Grasa();
    }

//    @Provides
//    MartilloPercutor provideMartilloPercutor() {
//        return new MartilloPercutor();
//    }
}
