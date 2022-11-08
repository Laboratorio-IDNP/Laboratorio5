package com.example.laboratorio3;

import java.io.Serializable;

public class Postulante implements Serializable {
    private String dni;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String fechaNacimiento;
    private String colegioPrecedencia;
    private String carreraPostula;

    public Postulante() {
    }

    public Postulante(String dni, String apellidoPaterno, String apellidoMaterno, String nombres, String fechaNacimiento, String colegioPrecedencia, String carreraPostula) {
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.colegioPrecedencia = colegioPrecedencia;
        this.carreraPostula = carreraPostula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Override
    public String toString() {
        return "Postulante{" +
                "apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", nombres='" + nombres + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", colegioPrecedencia='" + colegioPrecedencia + '\'' +
                ", carreraPostula='" + carreraPostula + '\'' +
                '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getColegioPrecedencia() {
        return colegioPrecedencia;
    }

    public void setColegioPrecedencia(String colegioPrecedencia) {
        this.colegioPrecedencia = colegioPrecedencia;
    }

    public String getCarreraPostula() {
        return carreraPostula;
    }

    public void setCarreraPostula(String carreraPostula) {
        this.carreraPostula = carreraPostula;
    }
}
