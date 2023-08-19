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
        // Lógica para mostrar información completa
    }
}
