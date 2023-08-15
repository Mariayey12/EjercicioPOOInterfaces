package Poo_Interfaces;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre,int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this. genero = genero;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + '\n' +
                "edad: " + edad + '\n' +
                "genero: " + genero + '\n';
    }
}
