package Poo_Interfaces;

import java.util.ArrayList;

public class CursoPresencial extends Curso{
    private String horario;

    public CursoPresencial(String nombreCurso, String horario, Profesor profesor){
        super(nombreCurso,profesor);
        this.horario = horario;
    }

    public double calcularAsistenciasPromedio(){
        double promedio = 0;
        return promedio;
    }

    @Override
    public String toString() {
        return "Curso Presencial\n" +
                "horario: " + horario +
                super.toString();
    }
}
