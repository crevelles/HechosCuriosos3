package com.example.a21657540.hechoscuriosos2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvHC;
    Button btnHC;
    ListaHechos listaHechos = new ListaHechos();
    RelativeLayout r;
    ColoresFondo cf = new ColoresFondo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = (RelativeLayout) findViewById(R.id.relay);
        tvHC = (TextView) findViewById(R.id.hechoCuriosoTextView);

    }



    public void mostrarHecho(View view) {
        tvHC.setText(listaHechos.getHechoAleatoreo());
        int color = cf.getColor();
        r.setBackgroundColor(color);

    }
}
