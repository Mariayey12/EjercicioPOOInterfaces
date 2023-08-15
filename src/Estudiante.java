package Poo_Interfaces;

public class Estudiante extends Persona implements Estadisticas{
    private String carnet;
    private double[]  notas;
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
        double min = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < min){
                min = notas[i];
            }
        }
        return min;
    }
}