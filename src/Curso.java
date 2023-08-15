package Poo_Interfaces;

import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private Profesor profesor;



    public Curso(String nombreCurso, Profesor profesor){
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "\n" +
                "Nombre del Curso:" + nombreCurso + '\n' +
                "Profesor: " + profesor +
                '\n';
    }
}
