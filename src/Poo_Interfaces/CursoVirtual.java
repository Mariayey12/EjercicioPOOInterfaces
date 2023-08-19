package Poo_Interfaces;
// Clase CursoVirtual
class CursoVirtual extends Curso {
    private String plataforma;

    public CursoVirtual(String nombreCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, profesor);
        this.plataforma = plataforma;
    }

    // Implementación de métodos de Gestionable
    @Override
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante.nombre + " inscrito en el curso virtual " + nombreCurso);
    }

    @Override
    public void retirarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
        System.out.println("Estudiante " + estudiante.nombre + " retirado del curso virtual " + nombreCurso);
    }


}
