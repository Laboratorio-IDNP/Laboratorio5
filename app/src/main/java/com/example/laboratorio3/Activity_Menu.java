package com.example.laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Activity_Menu extends AppCompatActivity {

    private ArrayList<Postulante> postulantes;
    private Postulante postulante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        postulantes = new ArrayList<>();

        //Se recibe el objeto postulante
        Bundle objetoPostulante = getIntent().getExtras();
        if(objetoPostulante != null) {
            postulantes = (ArrayList<Postulante>) objetoPostulante.getSerializable("postulantes");
            postulante = (Postulante) objetoPostulante.getSerializable("postulante");
            postulantes.add(postulante);
            Toast.makeText(this, "El postulante ha sido registrado", Toast.LENGTH_SHORT).show();
            for (Postulante p: postulantes) {
                System.out.println(p);
            }
        }
    }

    public void goToActivityPostulanteInfo(View view) {
        Bundle bundleListPostulantes = new Bundle();
        bundleListPostulantes.putSerializable("postulantes", postulantes);

        Intent intentActivityPostulanteInfo = new Intent(this, Activity_PostulanteInfo.class);
        intentActivityPostulanteInfo.putExtras(bundleListPostulantes);
        startActivity(intentActivityPostulanteInfo);
    }

    public void goToActivityPostulanteRegistro(View view) {
        Bundle bundleListPostulantes = new Bundle();
        bundleListPostulantes.putSerializable("postulantes", postulantes);

        Intent intentPostulanteRegistro = new Intent(this, Activity_PostulanteRegistro.class);
        intentPostulanteRegistro.putExtras(bundleListPostulantes);
        startActivity(intentPostulanteRegistro);
    }
}