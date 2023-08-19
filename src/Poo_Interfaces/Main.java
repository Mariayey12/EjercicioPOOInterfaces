package Poo_Interfaces;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Crear profesores
        Profesor profesor1 = new Profesor("Juan Pérez", 35, "Masculino", "Doctor en Ciencias", new ArrayList(Arrays.asList("Matemáticas", "Física")));
        Profesor profesor2 = new Profesor("María López", 40, "Femenino", "Doctora en Letras", new ArrayList(Arrays.asList("Literatura", "Redacción")));

        // Crear estudiantes
        double[] notasEstudiante1 = { 85.5, 90.0, 78.5 };
        Estudiante estudiante1 = new Estudiante("Carlos Ramírez", 20, "Masculino", "202012345", notasEstudiante1);

        double[] notasEstudiante2 = { 92.0, 88.5, 76.0 };
        Estudiante estudiante2 = new Estudiante("Ana García", 21, "Femenino", "202023456", notasEstudiante2);

        // Crear cursos
        CursoPresencial cursoPresencial = new CursoPresencial("Álgebra Lineal", profesor1, "Lunes y Miércoles, 10:00 AM - 12:00 PM");
        cursoPresencial.inscribirEstudiante(estudiante1);
        cursoPresencial.inscribirEstudiante(estudiante2);

        CursoVirtual cursoVirtual = new CursoVirtual("Introducción a la Literatura", profesor2, "Plataforma EduOnline");
        cursoVirtual.inscribirEstudiante(estudiante2); // Inscribe a estudiante2 en el curso virtual

        // Calcular y mostrar promedio de asistencia y participación
        double promedioAsistencia = cursoPresencial.calcularPromedio();

//***************************************************************************************//
        System.out.println("Promedio de asistencia en " + cursoPresencial.nombreCurso + ": " + promedioAsistencia);
        System.out.println("Promedio de participación en " + cursoVirtual.nombreCurso + ": " + promedioAsistencia);

        // Agregar cursos a la universidad
        Universidad universidad = new Universidad();
        universidad.agregarCurso(cursoPresencial);
        universidad.agregarCurso(cursoVirtual);

        // Mostrar información completa de la universidad
        universidad.mostrarInformacionCompleta();

        // Mostrar estadísticas de notas
        mostrarEstadisticasDeNotas(estudiante1);
        mostrarEstadisticasDeNotas(estudiante2);
    }
//*************************************************************************//
    // Método para mostrar estadísticas de notas de un estudiante
    private static void mostrarEstadisticasDeNotas(Estudiante estudiante) {
        System.out.println("Estadísticas de notas para " + estudiante.nombre + ":");
        System.out.println("Promedio: " + estudiante.calcularPromedio());
        System.out.println("Máximo: " + estudiante.calcularMaximo());
        System.out.println("Mínimo: " + estudiante.calcularMinimo());
    }
}
