package Poo_Interfaces;

// Clase CursoPresencial
class CursoPresencial extends Curso {
    private String horario;

    public CursoPresencial(String nombreCurso, Profesor profesor, String horario) {
        super(nombreCurso, profesor);
        this.horario = horario;
    }

    // Implementación de métodos de Gestionable
    @Override
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante.nombre + " inscrito en el curso " + nombreCurso);
    }

    @Override
    public void retirarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
        System.out.println("Estudiante " + estudiante.nombre + " retirado del curso " + nombreCurso);
    }

    // Método para calcular el promedio de asistencia
    public  double calcularPromedio() {
        int totalEstudiantes = estudiantes.size();
        if (totalEstudiantes == 0) {
            return 0; // No hay estudiantes inscritos, promedio de asistencia es 0
        }

        int sumaAsistencias = 0;
        for (Estudiante estudiante : estudiantes) {
            // Lógica para obtener la asistencia del estudiante (por ejemplo, mediante atributos adicionales en Estudiante)
            // Sumar las asistencias para todos los estudiantes
        }

        return (double) sumaAsistencias / totalEstudiantes;
    }

}

