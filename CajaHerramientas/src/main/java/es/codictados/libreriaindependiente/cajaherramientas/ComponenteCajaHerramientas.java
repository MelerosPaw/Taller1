package es.codictados.libreriaindependiente.cajaherramientas;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ModuloCajaHerramientas.class)
public interface ComponenteCajaHerramientas {

    void inject(Grasa grasa);
    void inject(MartilloPercutor martilloPercutor);
}
