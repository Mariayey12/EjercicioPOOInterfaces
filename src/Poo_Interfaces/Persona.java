package Poo_Interfaces;

// Interfaz Estadisticas
interface Estadisticas {
    double calcularPromedio();
    double calcularMaximo();
    double calcularMinimo();
}
// Interfaz Gestionable
interface Gestionable {
    void inscribirEstudiante(Estudiante estudiante);
    void retirarEstudiante(Estudiante estudiante);
}


// Clase abstracta Persona
abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "nombre: " + nombre + '\n' +
                "edad: " + edad + '\n' +
                "genero: " + genero + '\n';
    }
}