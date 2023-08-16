package Poo_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Estudiante estudiante;
    private String nombreCurso;
    private Profesor profesor;

    public Curso(String nombreCurso, Profesor profesor, Estudiante estudiante){
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "\n" +
                "Nombre del Curso:" + nombreCurso + '\n' +
                "Profesor\n" + profesor +
                "Estudiantes\n"+ estudiante;
    }
}
