package es.codictados.libreriaindependiente.taller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.codictados.libreriaindependiente.cajaherramientas.Grasa;
import es.codictados.libreriaindependiente.cajaherramientas.MartilloPercutor;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.scroll)          ScrollView scroll;
    @BindView(R.id.resultados)      TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.nuevo_martillo, R.id.nueva_grasa})
    public void onClick(Button button) {
        if (button.getId() == R.id.nueva_grasa) {
            incluirResultado(new Grasa().getDescripcion());
        } else {
            incluirResultado(new MartilloPercutor().getDescripcion());
        }
    }

    private void incluirResultado(String resultado) {
        String nuevoResultado = resultados.getText() + "\n" + resultado + "\n";
        resultados.setText(nuevoResultado);
        scrollHastaElFinal();
    }

    private void scrollHastaElFinal() {
        scroll.post(new Runnable() {
            @Override
            public void run() {
                scroll.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });
    }
}
