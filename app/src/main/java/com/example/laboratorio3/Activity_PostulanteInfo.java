package com.example.laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_PostulanteInfo extends AppCompatActivity {

    private EditText campoDni;
    private TextView result;
    private ArrayList<Postulante> postulantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_info);

        campoDni = (EditText) findViewById(R.id.editTextDNI);
        result = (TextView) findViewById(R.id.textResult);
        postulantes = new ArrayList<>();

        Bundle objectPostulante = getIntent().getExtras();

        if (objectPostulante != null) {
            postulantes = (ArrayList<Postulante>) objectPostulante.getSerializable("postulantes");
        }
        if (postulantes.size() == 0 ) {
            result.setText("No hay postulantes registrados");
        }
    }

    public void getResults(View button) {
        String dni = campoDni.getText().toString();
        if (dni != null) {
            for (Postulante p: postulantes) {
                if (p.getDni().equals(dni)) {
                    String datosPostulante = "DNI:" + p.getDni() + "\n" +
                            "APELLIDOS:" + p.getApellidoPaterno() + " " + p.getApellidoMaterno() + "\n" +
                            "NOMBRES:" + p.getNombres() + "\n" +
                            "FECHA NACIMIENTO:" + p.getFechaNacimiento() + "\n" +
                            "FECHA COLEGIO:" + p.getColegioPrecedencia() + "\n" +
                            "FECHA CARRERA:" + p.getCarreraPostula() + "\n";
                    result.setText(datosPostulante);
                } else {
                    result.setText("No hay resultados");
                }
            }
        }
    }
}

