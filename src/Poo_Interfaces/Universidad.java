package Poo_Interfaces;

import java.util.ArrayList;
// Clase Universidad
class Universidad {
    private ArrayList<Curso> cursos;

    public Universidad() {
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Método para mostrar la información de cursos, profesores y estudiantes
    public void mostrarInformacionCompleta() {
        System.out.println("Información completa de la universidad:");
        System.out.println("------------------------------------");

        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.nombreCurso);
            System.out.println("Profesor: " + curso.profesor.nombre);
            System.out.println("Estudiantes inscritos:");

            for (Estudiante estudiante : curso.estudiantes) {
                System.out.println("  " + estudiante.nombre);
            }

            System.out.println();
        }
    }
}
