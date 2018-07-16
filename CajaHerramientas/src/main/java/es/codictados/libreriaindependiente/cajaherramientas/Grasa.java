package es.codictados.libreriaindependiente.cajaherramientas;


import javax.inject.Inject;

public class Grasa {

    protected int usos;

    @Inject String mFormula;

    public Grasa() {
        DIManagerCajaHerramientas.getComponente().inject(this);
        usos = 10;
    }

    public String getDescripcion() {
        return "Grasa n.º " + hashCode() + " " + mFormula +
                " Duración: " + usos + " usos." ;
    }

    public String usar() {
        if (usos > 0) {
            usos--;
            return "Grasa utilizada. Quedan " + usos + " usos.";
        } else {
            return "La grasa se ha agotado.";
        }
    }

    public boolean puedeEngrasar() {
        return usos > 0;
    }
}
