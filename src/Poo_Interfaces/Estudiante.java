package Poo_Interfaces;

// Clase Estudiante
class Estudiante extends Persona implements Estadisticas {
    private String carnet;
    private double[] notas;

    public Estudiante(String nombre, int edad, String genero, String carnet, double[] notas) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
    }

    // Implementación de métodos de Estadisticas
    @Override
    public double calcularPromedio() {
        double sum = 0;
        for (double nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }

    @Override
    public double calcularMaximo() {
        double max = Double.MIN_VALUE;
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    @Override
    public double calcularMinimo() {
        double min = Double.MAX_VALUE;
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
}

