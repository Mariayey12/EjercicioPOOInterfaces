package Poo_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante extends Persona implements Estadisticas{
    private String carnet;
    private static double[]  notas = new double[3];
    public Estudiante (String nombre, int edad, String genero, String carnet, double[] notas){
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
    }

    @Override
    public double calcularPromedio() {
        double promedio = 0;
        for (int i = 0; i < notas.length; i++){
            promedio = promedio + notas[i];
        }
        return promedio/ notas.length;
    }

    @Override
    public double calcularMaximo() {
        double max = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > max){
                max = notas[i];
            }
        }
        return max;
    }

    @Override
    public double calcularMinimo() {
        double min = 5;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < min){
                min = notas[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Carnet: "+ carnet +
                "\nnotas: " + Arrays.toString(Estudiante.notas)+"\n";
    }

}
