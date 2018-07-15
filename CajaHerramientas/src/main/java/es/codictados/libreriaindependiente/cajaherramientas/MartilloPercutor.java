package es.codictados.libreriaindependiente.cajaherramientas;

import javax.inject.Inject;

public class MartilloPercutor {

    private boolean estaEngrasado = true;

    @Inject Grasa mGrasa;

    public MartilloPercutor() {
        DIManagerCajaHerramientas.getComponente().inject(this);
    }

    public String getDescripcion() {
        return "Martillo n.º " + hashCode() + ", engrasado con ->\n\t" + mGrasa.getDescripcion();
    }

    public String taladrar() {

        StringBuilder resultado = new StringBuilder();

        if (estaEngrasado) {
            resultado.append("¡Trrrrrr...!");
            resultado.append(engrasar());
        } else {
            resultado.append("El martillo percutor no está engrasado.");
        }

        return resultado.toString();
    }

    public String recargarGrasa(Grasa grasa) {
        this.mGrasa = grasa;

        String resultado = "Grasa repuesta.";
        if (!estaEngrasado) {
            resultado += engrasar();
        }

        return resultado;
    }

    private String engrasar() {
        estaEngrasado = mGrasa.puedeEngrasar();
        return "\n" + mGrasa.usar();
    }
}
