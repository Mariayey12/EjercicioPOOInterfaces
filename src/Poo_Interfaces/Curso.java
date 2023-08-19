package Poo_Interfaces;

import java.util.ArrayList;
// Clase abstracta Curso
abstract class Curso implements Gestionable {
    protected String nombreCurso;
    protected Profesor profesor;
    protected ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }
}