package Poo_Interfaces;
import java.util.ArrayList;
import java.util.Arrays;

public class Profesor extends Persona{
    private String titulo;
    private ArrayList<String> materias = new ArrayList<String>();

    public Profesor (String nombre, int edad, String genero, String titulo, ArrayList<String> materias){
        super(nombre, edad, genero);
        this.titulo = titulo;
        this.materias = materias;
    }

    public String getTitulo() {
        return titulo;
    }


    public ArrayList<String> getMaterias() {
        return materias;
    }


    @Override
    public String toString() {
        return super.toString()+ "Titulo: "+titulo+
                "\nMaterias: "+ getMaterias();
    }


}
