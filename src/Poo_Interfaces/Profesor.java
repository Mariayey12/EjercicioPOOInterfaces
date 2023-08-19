package Poo_Interfaces;
import java.util.ArrayList;
// Clase Profesor
class Profesor extends Persona {
    private String titulo;
    private ArrayList<String> materias;

    public Profesor(String nombre, int edad, String genero, String titulo, ArrayList<String> materias) {
        super(nombre, edad, genero);
        this.titulo = titulo;
        this.materias = materias;
    }
}