package com.example.laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_PostulanteRegistro extends AppCompatActivity {

    private EditText campoDni;
    private EditText campoApellidoPaterno;
    private EditText campoApellidoMaterno;
    private EditText campoNombres;
    private EditText campoFechaNacimiento;
    private EditText campoColegioPrecedencia;
    private EditText campoCarreraPostula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_registro);

        campoDni = (EditText) findViewById(R.id.editTextDni);
        campoApellidoPaterno = (EditText) findViewById(R.id.editTextApellidoPaterno);
        campoApellidoMaterno = (EditText) findViewById(R.id.editTextApellidoMaterno);
        campoNombres = (EditText) findViewById(R.id.editTextNombres);
        campoFechaNacimiento = (EditText) findViewById(R.id.editTextFechaNacimiento);
        campoColegioPrecedencia = (EditText) findViewById(R.id.editTextColegioProcedencia);
        campoCarreraPostula = (EditText) findViewById(R.id.editTextCarreraPostula);

    }

    public void registerForActivityResult(View button) {
        String dni = campoDni.getText().toString();
        String apellidoPaterno = campoApellidoPaterno.getText().toString();
        String apellidoMaterno = campoApellidoMaterno.getText().toString();
        String nombres = campoNombres.getText().toString();
        String fechaNacimiento = campoFechaNacimiento.getText().toString();
        String colegioPrecedencia = campoColegioPrecedencia.getText().toString();
        String carreraPostula = campoCarreraPostula.getText().toString();

        Postulante postulante = new Postulante();
        postulante.setDni(dni);
        postulante.setApellidoPaterno(apellidoPaterno);
        postulante.setApellidoMaterno(apellidoMaterno);
        postulante.setNombres(nombres);
        postulante.setFechaNacimiento(fechaNacimiento);
        postulante.setColegioPrecedencia(colegioPrecedencia);
        postulante.setCarreraPostula(carreraPostula);

        //Toast.makeText(this, "El postulante ha sido registrado", Toast.LENGTH_SHORT).show();

        //Enviar el postulante creado a la activity Main donde esta la lista de Postulantes
        Bundle bundleActivityMenu = new Bundle();
        bundleActivityMenu.putSerializable("postulante", postulante);

        Intent intentActivityMenu = new Intent(this, Activity_Menu.class);
        intentActivityMenu.putExtras(bundleActivityMenu);

        //Lista de postulantes
        Bundle listaPostulantes = getIntent().getExtras();
        intentActivityMenu.putExtras(listaPostulantes);

        //Se envia el intent
        startActivity(intentActivityMenu);

    }
}

